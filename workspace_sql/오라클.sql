-- 한 줄 주석
/* 범위 주석 */

-- 테이블의 명 
-- emp 

select

    *   -- 모드 컬럼 ex) 하단에 보이는 EMPNO , ENAME , JOB ... 등등 
        -- 실무에서는 사용을 잘 안 함 됨 
from    -- 자동 정렬 단축키 : ctrl + F7
    emp; 
    
select

    empno , ename , deptno -- 조회 하고싶은 컬럼 명을 적어서 출력
                           -- 실행시키고 싶은 곳에 클릭 하고 출력하면 그 부분이 출력
from   
    emp;
    
select * from dept; -- 각자의 테이블을 조회
select * from salgrade; -- 각자의 테이블을 조회 


select deptno from emp;

-- distinct : select에서 중복되는 자료를 제거해준다 
-- select 다음에 컬럼을 골라서 form emp으로부터 

select distinct deptno from emp; -- distinct 겹치는 부분 정리 

select distinct job from emp; 

select deptno , job from emp;   -- 프롬 뒤엔 테이블 명

-- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는 걸 제거한다 
select distinct deptno , job from emp;


-- null 과 연산하면 무조건 null이다 
select ename , sal , sal*12+comm , comm from emp;

-- 컬럼 명에 별칭 사용방법 -- 
-- 새로 만든 컬럼에 new sal 이라는 이름 만들기 
-- 똑같은 글자를 생성하면 이름 뒤에 _1 이 붙는다 
-- 별칭을 줄 때 as 를 써도 되고 안 써도 된다
-- " 쌍따옴표 생략 가능 
-- 다만 별칭안에 띄어쓰기가 있는 경우 " 따옴표 생략 불가 
-- 가능하면 띄어쓰기보다 _언더바를 넣는 게 좋다 
select ename , sal , sal*12+comm as "new_sal" , comm from emp;

-- order by : 해당 컬럼으로 정렬 단지 그 용도
-- 오름차순으로 정리해주는 order by절
-- 내림차순은 desc 
select * from emp
order by sal;

select * from emp
order by comm;

-- 오름차순 생략가능 asc
select * from emp 
order by sal asc;

-- 내림차순 desc 
select * from emp 
order by sal desc;

-- deptno를 먼저 정렬하고 그 안에서 sal을 내림차순을 시킬 sql문 
select * from emp 
order by deptno asc , sal desc;

-- job을 겹치지 않게 분류하고 오름차순으로 정리 혹은 내림차순으로 정리 
select distinct job from emp
order by job asc;


-- where절은 select문으로 데이터를 조회할 때 특정 조건을 기준으로 원하는 행을 출력할 수 있음
-- 부서가 30인 애들만 나오게끔 
select * from emp
where deptno = 30;

-- 사원 번호가 7782인 애들만 나오게끔
select * from emp
where EMPNO = 7782;

-- 2000보다 높은 애들을 부르게끔 
select * from emp
where sal >= 2000
order by sal;

select * from emp
where ename = 'KING';

select * from emp
where deptno = 30 and job ='SALESMAN';

Select * from emp
where job = 'CLERK' and deptno = 30;

Select * from emp
where job = 'CLERK' and deptno = 30 or deptno = 20;

Select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp 
where sal >= 2000 and sal < 3000;
-------------------------------------
-- where문에 곱셈 산술 연사자를 사용할 수 있다 
-- 글자도 비교할 수 있음 ex z > a 순서는 z가 더 큰 값으로 적용 여러 글자도 가능 
-- 같음 : = 
-- 같지 않음 : != , <> , ^=

select * from emp
 -- where sal != 3000; 아래와 같음 
where sal <> 3000;

----------- 논리 부정 연산자 : not --------------
/*
    !(a!=b)
    
*/
select * from emp 
where not(sal >= 2000 and sal < 3000);

---------------In 연산자 --------------
-- or 연산자를 이용해서 여러개 조건을 만족하는 데이터를 뽑는데 
-- 불편하니깐 in을 쓰면 한 번에 데이터를 찾아올 수 있다 
-- job 뒤에 not을 응용해서 제외해서 데이터를 찾아올 수 있다 
select * from emp 
-- where job in ('MANAGER','SALESMAN','CLERK');
where job not in ('MANAGER','SALESMAN','CLERK');

-- between 최댓값,최솟값 입력하면 그 사이값을 알 수 있지만 oracle에서만 사용 가능
-- ex : between a and b 

----------------------------------6/21 
select * from emp
where sal between 2000 and 3000;

--------------LIKE문----------------
-- Like 는 문자열을 포함한 내용을 출력할 수 있는 방법 
select * from emp 
where ename like 'S%';
-- 사원의 이름 찾기 
-- _ : 어떤 값이든 상관없이 한 개의 문자 데이터를 의미
-- % : 길이와 상관없이(문자 없는 경우도 포함) 모든 문자 데이터를 의미

select * from emp where ename like 'A%';

select * from emp 
where ename like '_L%';
-- 두번째 글자가 L인 사람 찾기 앞에 언더바 세번째 자리가 L인사람 찾으려면 ? 언더바 두개 후 L
-- _는 딱 한 글자인데 어떤 글자던 관계없음 

select * from emp 
where ename like '%AM%';
-- 글자가 어느 위치에 있건 AM이 붙어있는 이름 찾기
-- ex ) ADAMS , JAMES

-- %_M 이라고 하면 몇 글자일까 ? _M 즉 두 번쨰 글자가 M인것을 찾음 %는 아무대나 들어가도 상관 없기 때문 
-- 응용해서 not like 도 가능 

select * from emp
where  comm <= 400;
-- null은 연산처리도 안 되고 비교도 안 된다 

select * from emp
where comm = null;
-- 이렇게 해도 null을 찾을 수 없다 

select * from emp
where comm is null;
-- null 찾는 방법 

select * from emp
where comm is not null;
-- null을 제외 하고 찾기 

select empno , ename , sal , deptno from emp
-- where deptno = 10 or 20 = deptno;
where deptno in ( 10 , 20 );

-------------집합 연산자 UNION ----------

select empno , ename , sal , deptno from emp
where deptno = 10

union -- 테이블이 서로 다른 상태라고 가정하면 둘 조건 사이에 union을 사용하면 합쳐진다 
      -- 서로 다른 조회 결과를 합쳐줌 // 단, 조회한 컬럼의 개수와 타입이 같아야한다 
      -- 만일 컬럼명 위치가 달라진다면 그대로의 값이 그 위치에 그대로 적용됨 
      -- ex) sal, deptno 의 값이 합쳐져서 보여짐 20 , 5000 이런식 
select empno , ename , sal , deptno from emp
where deptno = 20;

-- 똑같은 값으로 출력한 결과 // 중복된 자료를 제거해줌 
select empno , ename , sal , deptno from emp
where deptno = 10

union

select empno , ename , sal , deptno from emp
where deptno = 10;

-----------
-- union all은 값이 중복이 되도 제거하지 않고 전부 보여준다
select empno , ename , sal , deptno from emp
where deptno = 10

union all 

select empno , ename , sal , deptno from emp
where deptno = 10;

-- union , union all 은 다른 데이터베이스에서 사용가능하지만 
-- minus( 차집합 처리 ) , intersect ( 교집합 처리 ) 는 oracle 전용

-- q1
select * from emp
where ename like '%S';

-- q2
select empno , ename , job , sal , deptno from emp
where deptno = 30 and job = 'SALESMAN'
order by empno;

-- q3 
select empno , ename , job , sal , deptno from emp
where sal > 2000 and deptno in (20,30);

-- q3//2
select empno , ename , job , sal , deptno from emp
where sal > 2000 
minus
select empno , ename , job , sal , deptno from emp
where deptno in(10);

-- q4
select * from emp
where not sal >= 2000 and sal <= 3000;
-- 위에 피드백 괄호 치는 게 좋다 

-- q5
select ename , empno , sal , deptno from emp
where ename like '%E%'  
and deptno = 30  
and (sal < 1000 or sal > 2000);
-- and not ( sal > 1000 and sal < 2000); 선생님 예시 

-- q6
select * from emp
where 
    comm is null
    and mgr is not null
    and job in ('MANAGER','CLERK')
    and ename not like ('_L%');
    -- 선생님이 푸신 것 
    
------------함수--------------

Select ename , upper(ename), lower(ename) , initcap(ename)
from emp;
/*
    upper : 대문자로 변경 lower : 소문자 변경 initcap : 앞에 글자만 대문자로 변경 
*/

select * from emp
where lower (ename) like lower ('%Mi%');
-- ename 도 소문자로 바꾸고 , Mi 도 소문자로 바꿔서 찾는 방법으로 활용가능 

------------length

select ename , length(ename)
from emp;
-- 글자열의 길이 찾기

select * from emp
where length(ename) >= 5;

select length('한'), lengthb('한') from dual;
-- lengthb 는 byte를 계산해주는 함수
-- 한글은 한 글자당 3byte
-- dual은 사용자가 임의로 만들 수 있는 테이블 이라고 생각하면 될듯 ?

select job, substr(job, 1, 2), substr( job, 3, 2) , substr(job, 5)
from emp;
-- 컬럼에 넣을 수 있다 
-- substr : 대상이 되는 문자 ,시작위치 , 가져올 개수 
-- 가져올 개수를 안 쓰거나 너무 크면 끝까지 
-- splice 같은 느낌 job행에 1, 첫글자로부터 2, 두번쨰까지
-- ex) substr(job , -3, 2) 이렇게 뒤에서부터도 가능 
-- 문자니깐 lower 같은 것도 적용가능 lower (substr(job , -3, 2))

------ replace 함수 

-- ex ) 대체할 문자가 있다면 바꾸고 없으면 삭제한다 
-- replace(문자열 데이터 또는 열 이름(필수) , 찾는 문자(필수), 대체할 문자(선택))
select job, replace(job, 'A', '*') from emp;

-- 응용한 문제
select 
    job ,
    length (job),
    length (job) / 2,
    substr(job , (length (job)+1) / 2, 1),
    replace(
        job,
        substr(job , (length (job)+1) / 2, 1),
        '*'
        )
from emp;

--------L,R pad 함수 
-- 문법 pad(문자열 데이터 또는 열이름(필수), 데이터의 자리수(필수), 빈 공간에 채울 문자(선택))
-- 빈 공간을 채우기 위한 
-- 채울 문자 생략시 공백문자 '   ';
select 
    job,
    lpad(job , 10 , '#'),
    lpad(job , 4, '#')
from emp;

select 
    job , length(job), 15 - length(job),
from emp;
   
select 
    lpad(
    job,
    length(job) 
    +(15 - (length(job)))/2,
    '*')
from emp;

---------- concat 함수 : 문자끼리 합치는 방법 -------
select empno || ename || '님'
from emp;

-- trim 은 앞 뒤 공백 제거     * 글씨 사이에 있는 공백은 제거 안 함 
select 
    '  a b c   ',
    trim('  a b c   ')
from dual;

-- 실습문제 
select 
    '210612 - 3123456',
    '210612 - 3******'
from dual;

select 
    '210612 - 3123456',
   -- substr ('210612-3123456', 1 , 8) , 
   -- rpad ( '210612-3' , 14 , '*')
    rpad ( 
    substr ('210612-3123456', 1 , 8) , 
    length ('210612-3123456'), 
    '*'
    )
    
from dual;

-- 실습문제 2 ----

-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시 
-- 쉬운 버전 ) 앞 두글자 + '***'
-- 정답의 예 : ward -> wa** , martin -> ma****

select 
    ename ,
    rpad( substr( ename , 1 , 2),
    length(ename),
    '*')
from emp;   
    
-- 문제 3    아까에서 앞글자만 *
select 
    ename,
    replace(ename,substr(ename , 1 , 1),'*')
from emp;


-- 문제 4    두번째 글씨만 *
select 
    ename,
    replace(ename,substr(ename , 2 , 1),'*')
from emp;

select 
    ename, 
    substr(ename, 1 ,1),
    rpad( substr(ename, 1 ,1),2,'*'),
    substr(ename, 3 ),
    rpad((rpad( substr(ename, 1 ,1),2,'*')),length(ename),substr(ename, 3 ))
from emp;

-- 문제 5    가운데 글씨만 *

select 
    ename,
    substr(ename , (length(ename)+1)/2 , 1),
    substr(ename , 1 , length(ename)/2 ),
    rpad(
        substr(ename , 1 , length(ename)/2 ),
        length(substr(ename , 1 , length(ename)/2 ))+1,
        '*'),
    rpad(
        rpad(
        substr(ename , 1 , length(ename)/2 ),
        length(substr(ename , 1 , length(ename)/2 ))+1,
        '*'),
        length(ename),
        substr(ename , 
        length(ename)/2)) as 실습5
from emp;

select 
    substr(ename , 1, length(ename)/2-0.5),
    --substr = splice처럼 뽑아냄 1~2 까지 
    rpad(substr(ename , 1, length(ename)/2-0.5),length(ename)/2+0.5,'*') ||
    -- rpad 사용해서 별을 가운데에 넣었고 || 이걸로 붙혀서
    substr(ename , length(ename) /2 +1.5)
    -- 나머지 부분을 붙힘 
from emp;

-- 선생님 예시 ----------------
select 
    length(ename)/2 + 1,
    substr(ename , 1 , length(ename)/2-0.5) || '*' || substr(ename , length(ename)/2 + 1.5 )
from emp;

--------- trunc , ceil / floor 함수---------
select  
    trunc (1234.5678),
    trunc (1234.5678 , 2),
    trunc (1234.5678 , -2),
    trunc (-12.34)
from dual;

select 
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

-- 날짜 계산 함수 sysdate 
-- sysdate : 지금 오라클의 접속된 pc의 시간 // 지금은 선생님 지정된 오라클의 시간 
-- 강사 pc 는 9시간 정도 차이 남 
-- 날짜 정보 중 일부만 select로 표시됨 
-- -1 과 + 1로 날짜에 더하기 빼기 가능 
select sysdate, sysdate + 1 , sysdate -1 from dual;  

-- add_month 로 몇 개월 더한 결과를 반환할 수 있다 
-- 오라클 자체의 날짜 계산 기능이 좋아서 + month - month 윤달 계산 등 할 수 있음 

-- month_between 을 통해 두 날짜 데이터 간의 날짜 차이를 알 수 있음 

-- next , last day의 함수도 있음 
-- 특정 날짜를 기준으로 돌아오는 요일의 날짜를 출력해주는 함수 
-- 날짜도 반올림/버림 도 가능함 

-- 컬럼에 +를 적으면 모두 "숫자"로 변경해서 적용 ---------
-- || 숫자도 "문자"로 적용 

--////// to_char , to _number , to_date ////////////
select to_char(sysdate+(9/24) , 'yyyy/mm/dd hh24:mi:ss') as 현재날짜시간
from dual;

-- 현재 날짜 - 학원 수강 처음 들었을 때의 날짜의 차이 
select 
    sysdate - to_date( '2024-05-07' , 'yyyy-mm-dd')
from dual;

-- 날짜만 넣고 시간을 넣지 않으면 시간이 나오지 않는다 

-- nvl : null value 함수 //////////////////////////////////
-- null에 값을 넣을 수 있음
-- 연산을 할 수 있다 
select 
    comm, 
    nvl(comm , -1),
    sal,
    sal + comm,
    sal + nvl(comm , 0)
from emp;

select * from emp
where comm = 0 or comm is null;
-- 이걸 아래로 다르게 표현하자면 

-- 이렇게도 표현 가능 
-- nvl 전달인자를 comm 과 0을 갖고있는 애도 0으로 바꿔주는 것 
select * from emp
where nvl(comm , 0) = 0;
-- nvl2 도 있다 // 열 또는 데이터를 입력하여 해당 데이터가 null이 아닐때와 null 일때 출력 데이터를 각각 저장 

-- decode와 case문 

-- decode /////////// 
-- if문 같음 
-- job인데 salesman 일 때 얼마 인상 , manager 일 땐 얼마 인상 이런식으로 사용할 수 있음 
-- ex) job ,  salesman , sal * 1.1 이런식 


-- case ////////////
-- 많이 쓰이고 중요함 
-- if문 같음 
select empno , ename , job , sal ,
    case job -- case 옆에 어떤 컬럼이 나올 수도 있고 안 나올 수도 있다 ,
             -- case에 실행되는 job에서 같은 직업이 있다면 수당을 올리라는 내용 
        when 'manager' then sal * 1.1 -- 조건이 맞으면 then이 실행됨 
        when 'salesman' then sal * 1.05 
        when 'analyst' then sal 
        else sal * 1.03 
    end as upsal -- end로 case문을 끝내줌 
from emp;
-- case 열고 end로 닫는다 
-- case 열고 나서 컬럼명을 안 줘도 사용가능 
select empno , ename , comm ,
    case 
        when comm is null then '해당없음'
        when comm = 0 then '수당없음'
        when comm > 0 then '수당 : '|| comm
    end as comm_text 
from emp;

select 
    case 
        when 
            comm is null
            then 
                -- 'N/A' 
                0  -- = null을 0으로 설정하고 
        else 
          --  to_char(comm)
          -- '' || comm 이렇게도 사용가능 
          comm -- 위엔 comm이 문자로 변환됐으니 comm 숫자로 만들면 출력 가능 
    end new_comm -- 컬럼명 설정 
from emp;
-- 숫자와 문자를 같이 case에서 비교할 수 없음 

-- // 실습문제 
-- q2 

select empno , ename , sal, 
    trunc( sal / 21.5, 2) as day_pay,
    round( sal / 21.5 / 8 , 1) as time_pay
from emp;       

-- q3 
select empno , ename , to_char(hiredate,'yyyy/mm/dd')as hiredate,
    to_char(add_months(hiredate , 3) , 'yyyy/mm/dd')as r_job ,
    nvl(to_char (comm) , 'N/A') as comm -- null 을 N/A로 바꾸려면 
from emp;
-- 월요일이 기준이 되게끔 하려면 
-- next_day ( add_month(hiredate , 3 ) , 2 ) r_job // next day의 함수를 사용 
-- 일요일은 1 , 월요일은 2 ... 


-- q4
select empno , ename , mgr ,
    case
        when mgr is null 
            then 0000 
        when mgr like '75%'
            then 5555
        when mgr like '76%'
            then 6666
        when mgr like '77%'
            then 7777
        when mgr like '78%'
            then 8888
        else mgr 
    end as chg_mgr
from emp;


-- ///////////////// 하나의 열에 출력 결과를 담는 다중행 함수 
select sum(sal), count(sal), count(*), count(comm) from emp;
-- sum : 컬럼 병합 
-- count 몇 줄 인지 파악 
-- count ( comm ) 출력 했을 때 기본적으로 null을 제거하고 보여줌 
-- count는 *을 많이 씀 

select * from emp where ename like '%A%' ;

select count (*) from emp where ename like '%A%' ;
-- count를 통해서 a이 포함이 된 이름 갯수 찾기

select max (sal) , max(ename) , min(hiredate) , min(comm) from emp;


-- 부서별 급여 총합 표시
select sum (sal) , avg(sal) from emp
where deptno = 10
union all
select sum (sal) , avg(sal) from emp
where deptno = 20
union all
select sum (sal) , avg(sal) from emp
where deptno = 30;
-- 급여의 평균값 
-- 급여의 총합 


select deptno, avg(sal), sum(sal), count(*)from emp
group by deptno;
-- 그룹화 시켜중 group by 함수 
-- distinct 처럼 중복을 제거해줌 , 분류해줌
-- select 에는 group by 한 것이나 다중행 함수 (집계함수) 만 올 수 있음 


select deptno, empno from emp
group by deptno , empno;
-- deptno 와 empno 의 값을 다른 컬럼으로 구분되게 합쳐줌 
-- 문법 순서는 select - from - where - group by - order by 

select deptno ,job , count(*)
from emp
group by deptno , job
order by deptno , job;
-- 그룹화한 후에 order by 로 정렬 

-- ////// having : group by절에서만 사용된다 
-- 집계함수를 조건으로 걸고 싶을 때 
-- having이 들어가려면 1.group by와 2.order by 사이에 들어감 

select deptno , job , avg(sal)
from emp 
group by deptno , job
    -- having avg(sal) >= 2000
    -- having count(*) >= 2
    having deptno = 20
order by deptno , job;


-- q1 
select deptno ,trunc( avg(sal)) , max(sal) , min(sal) ,count(*) as cnt
from emp
group by deptno;

--q2 
select job , count(*) 
from emp 
group by job
having count(job) >= 3;

--q3
select to_char(hiredate,'yyyy'), deptno , count(*)
from emp
group by to_char(hiredate,'yyyy'), deptno;

--q4 
select nvl2(to_char(comm) , 'o','x') , count(*)
from emp
group by nvl2(to_char(comm) , 'o','x');


--///////////////////////////////////////////
-- join

select job , count(*) cnt
from emp 
where sal > 1000
group by job
having count(*) >= 3
order by cnt desc;

select * from emp , dept 
order by empno;

select 14 * 4 from dual;

-- .은 소유격을 뜻함 emp.loc , deptno 같은 게 select에 들어가면 
-- 구체적이지 않기 때문에 오류남 
select emp.ename , dept.loc from emp , dept
where emp.deptno = dept.deptno 
order by empno;
-- 테이블 두 개 이상 조회할 때 관계를 꼭 알려줘야 원하는 정보만 출력된다 
-- 전체 테이블 수 - 1개의 조건이 적당하다 

select * 
from emp e , dept d
where e.deptno = d.deptno;
-- emp e 이처럼 별칭을 정해서 안에 넣고 그걸 e.deptno처럼 줄여쓰는게 가능 
-- 만일 별칭을 지정했으면 지정한 별칭만 써야함 


select ename ,e.* , d.* 
from emp e , dept d
where e.deptno = d.deptno;
-- *와 컬럼을 같이 쓰는 경우 
-- *에 테이블을 지정해 줘야 한다

select * from salgrade;

select * 
from emp e, salgrade s 
where e.sal >= s.losal and e.sal <= s.hisal ;
-- 등급이나 급여 다른 테이블에서 찾아내기
-- where 문으로 e와 s 별칭을 사용해서 급여와 등급을 비교해서 찾아냄 

select * from emp;

select e1.empno , e1.ename , e1.mgr , e2.empno , e2.ename 
from emp e1 ,emp e2
where e1.mgr = e2.empno;
-- // 첫번째 줄 e1이 갖고 있는 empno , ename , mgr 을 갖고 
-- // e2가 empno , ename 을 갖고있고 
-- // 그리고 둘쨋줄 갖고있었던 애들의 e1 과 e2를 갖고 오고 
-- // 셋쨋줄 그 e1 ,e2 를 비교해서 겹치는 부분을 출력 ? 이런 내용인듯 

select * 
from emp join dept
    using(deptno);
-- using 에 둘 다 같은 컬럼명이 있는 경우만 쓸 수 있다 
-- join ~ using 

-- // join on 방식 
select * 
from emp join dept on(emp.deptno = dept.deptno);

select *
from emp e1 join emp e2 on(e1.mgr = e2.empno);


select *
from emp e1 left outer join emp e2 on(e1.mgr = e2.empno);
-- left ,right outer join 
-- null 값도 출력하는 ? 
-- 왼쪽 테이블을 모두 출력하는 걸 보장해준다 

-- quiz 1
-- empno , ename , dname , loc 출력 : 결과 14줄 
select empno , ename , dname , loc
from emp , dept 
where emp.deptno = dept.deptno;
-- 일단 모든 것에서 출발 
-- emp 필요 , dept 라는 테이블도 필요 
-- emp 에 deptno 랑 dept 에 deptno가 필요 같은 줄에 나오게 
select empno , ename , dname , loc
from emp join dept using(deptno);
-- join 방식 
-- 위 셀렉에서 고른게 같으면 사용 가능 

-- quiz 2 
-- 사원번호 , 이름 , 부서명 , 급여등급을 출력 : 결과 14줄 
select e.empno , e.ename , d.dname , s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno -- 관계를 알려줌
    and e.sal >= s.losal 
    and e.sal <= s.hisal;


select e.empno , e.ename , d.dname , s.grade
from salgrade s , emp e join dept d using (deptno)
where (e.sal >= s.losal and e.sal <= s.hisal);
-- join 방식 


-- quiz 3 
-- 매니저보다 월급이 높은 사원의 이름 , 급여 , 매니저 이름 , 매니저 급여 

select e1.ename , e1.sal, e2.ename , e2.sal 
from emp e1 ,emp e2
where e1.mgr = e2.empno
    and e1.sal > e2.sal;
    
    
-- 교제 1 
select e.deptno , d.dname , e.empno , e.ename , e.sal 
from emp e, dept d
where e.deptno = d.deptno
    and e.sal > 2000
order by d.dname asc;


-- 교제 2 
select e.deptno , d.dname , trunc(avg(e.sal)) AVG_SAL, max(e.sal) MAX_SAL, min(e.sal) MIN_SAL , count(d.deptno) CNT
from emp e , dept d
where 
    e.deptno = d.deptno
      
group by e.deptno, d.dname; -- e.sal 을 낀다면 sal의 값이 다 다르니깐 그룹화 시켜도 출력이 다 된다 

-- 선생님 방법 2번 
select e.deptno , d.dname , floor(avg(e.sal)) , max(e.sal) , min(e.sal) , count(*)
from emp e left outer join dept d on (e.deptno = d.deptno)
group by e.deptno , d.dname;
-- 나랑 다른 점 : join , floor 


-- 교제 3 
select d.deptno , d.dname , e.empno, e.ename , e.job , e.sal 
from emp e right outer join dept d on (e.deptno = d.deptno)
order by deptno , ename;

-- ////////// 정리 ////////////////////////////////////////////////////
/*
    - 출력순서 -
    5. select // 출력할 것들        
    1. from    // 테이블(들)       
    2. where // 조건문 and , or 
    3. group by // 같은 것끼리 묶어줌 
      4. -> having // group by 된 조건을 이용하는 where 같은 것 
    6. order by // 정렬하는 함수 - 정렬 1이 중복되는게 있을 때 정렬 2가 적용되는 원리 
    
    
    //////////////////////////////////////////////////////////////////
    
    not // 결과를 반대로 만들어줌 
    in // 일치하면서 or 조건 
    like // % - 뭐든지 ( 심지어 없어도 ) ok 
            _ - 어떤 글자든 딱 한 글자 
            
    is null - 'null'은 = 으로 구별할 수 없다 
    is not null 
    
    union all 위와 아래 sql을 합쳐준다 (컬럼의 타입이 위 아래 같아야 한다)
    union 은 중복되는 걸 '제거'하고 출력 
    
    upper 대문자 lower 소문자 바꿔주는 함수 (like에서 대소문자 구분없이 검색할 때 좋다)
    length 
    substr // 글씨 자르기 (원본 , 시작점 , 개수 )
    replace // 바꾸기 (원본 , 바꿀대상 , 바꿀글씨)
    l,r pad // 채우기 (원본 , 글씨길이 , 채울문자)
    trim // 앞뒤 공백 제거 
    ceil // 올림
    floor // 내림 ( 음수일 때 주의)
    
    sysdate 현재시간 
    
    to_char // 문자로 변경 (형식을 줄 수 있다)
    to_date // 글씨를 날자로 (전달인자를 줘야함)
    nvl // 오라클 전용 null 처리
    case when then else end  // 조건절 
    
    sum - 합 , count - 개수 세기 , avg - 평균값 

    join // 1. from 에 테이블 , 테이블
            2. join using (동일한 컬럼명일 때만 가능)
            3. left , right outer join (합성 조건, 왼쪽이나 오른쪽에 정보를 전부 보여줌) 
   
   지금까지의 정리  
*/ 

--------------------------- 서브쿼리 -------------------------------------
select sal from emp where ename = 'JONES';

select * from emp 
where sal > (select sal from emp where ename = 'JONES');
--          값을 여기다가 넣어두고 불러오는 약간 콜백함수 느낌 // 테이블을 하나 더 만든 느낌 

-- 단일행 서브쿼리 = 값처럼 사용할 수 있다 
select * from emp
where sal > (select avg(sal) from emp);

select * from emp 
where sal > (select sal from emp where ename = 'BLAKE');

select * from emp
where job = (select job from emp where ename = 'JONES');


-- 다중행 서브쿼리 = 실행결과가 여러개인
-- where 문에 들어가는 연산자 
/*
    in  - 메인쿼리의 데이터가 서브쿼리의 결과 중 하나라도 일치한 데이터가 있다면 true 
    any , some - 메인쿼리의 조건식을 만족하는 서브쿼리의 결과가 하나 이상이면 true 
    all - 메인쿼리의 조건식을 서브쿼리의 결과 모두가 만족하면 true 
    in을 조금 많이 씀 , any 나 some은 비교적 적게 씀
*/
select * from emp
where sal in(
    select max(sal) 
    from emp 
    group by deptno
    );


-- from 절에 사용하는 서브쿼리 
select * 
from(
    select * from emp where deptno = 10
    );
    
-- 줄 번호 출력 rownum 
select rownum , emp.*
from emp
-- where rownum = 3;
order by ename;
-- 위 문제는 rownum을 먼저 적용 시키고 
-- order by가 적용되니깐 
-- 줄 번호가 엉망진창 되니깐 밑에처럼 변경해주기 
-- where엔 rownum xx 

select rownum , e.*
from(
    select * from emp order by ename
) e;   
-- from 에 서브쿼리의 값을 넣어줘서 
-- 실행되는 순서를 바꾸는 아이디어 
-- 근데 *엔 별칭이나 테이블 이름을 알려줘야하니깐
-- from 서브쿼리 뒤에 별칭을 넣어줘서 *에 e.*이 될 수 있도록 

select job , count(*) from emp
group by job
having count(*) >= 3;


select *
from (select job , count(*) cnt from emp
      group by job) -- count에 cnt라는 별칭을 준 이유 where에서 쓰기 위해서 
where cnt >= 3;     -- where에서 못 쓰는 이유 count는 숫자를 세는 함수기 때문 ?

with e10 as (   -- e10 이 select 문의 별칭으로 
    select * from emp where deptno = 10
    ) 
select * from e10;

select ename , (select empno from emp) from e10;
-- 이렇게 출력하게 되면 값이 한칸에 붙어있는 옆줄에 값이 너무 많기 때문에 출력이 안됨 
-- 딱 하나의 값이 들어가게끔 ?
-- from에 들어갈땐 상관 없다 ?

-- q1
select e.job , e.empno , e.ename, e.sal , e.deptno , d.dname from emp e ,dept d
where job = (select job from emp where ename = 'ALLEN')
and e.deptno = d.deptno
order by sal desc;

-- q2
select e.empno , e.ename , d.dname , e.hiredate , d.loc ,e.sal, grade
from emp e join  dept d using(deptno) left outer join salgrade s on(
e.sal >= s.losal and e.sal <= s.hisal) 
where sal > (select avg(sal) from emp)
order by sal desc , empno asc;
-- 여기서 못 풀었던 join을 이해하기 
-- group by로도 할 순 있겠지만 
-- join을 완벽히 이해 못함 join using으로 emp 와 dept 를 묶고 
-- left outer join으로 조건을 줘서 salgrade를 또 묶어줌 
-- // 선생님 방법은 조인 안 쓰고 비교만 해서 합쳐줌 

-- q3 
select empno , ename , job , deptno , dname , loc 
from emp join dept using (deptno)
where deptno = 10 -- deptno 가 10번인 애들만 뽑고 
and not job in(select job from emp where deptno = 30); -- job이 없는 걸 뽑기 위해 job not in 


-- // q4 선생님이 풀어주신 
select empno , ename , sal , grade 
from emp e
left outer join salgrade s
on (e.sal >= s.losal and e.sal <= s.hisal)
where sal > (select max(sal) from emp where job = 'SALESMAN');

-- 12장 /////////////////////////////////////////////////////////////////
-- DDL / 데이터 정의어 : 데이터베이스 데이터를 보관 및 관리 하기 위해 제공되는 여러 객체를
--                  생성 , 변경 , 삭제 관련 기능을 수행 

desc emp;

create table emp_ddl (
    empno number(4), -- 0~ 9999 까지 4자리까지 넣을 수 있게 만들겠다는 제약 
    ename varchar2(10), -- 이름은 10byte 까지 
    job varchar2(9),    -- 제한보다 적은 글씨가 적히면 글씨 만큼의 공간만 차지 / 효율적 
    mgr number(4),  -- empno와 같아야 함 연결이 되기 때문에 
    hiredate date,
    sal number(7,2),    -- 여기에 들어가는 숫자 2는 소수점 둘쨋자리까지 기록할 수 있다 
    comm number(7,2),   
    deptno number(2)
);

select * from emp_ddl;
desc emp_ddl;

create table dept_ddl
as select * from dept;

select * from dept_ddl;

-- 다른 테이블의 일부를 복사하여 테이블 생성 
create table emp_ddl_30
as select empno , ename , sal from emp where deptno = 30;
    
select * from emp_ddl_30;


-- emp 테이블을 복사하여 emp_alter 테이블 생성하기 
create table emp_alter 
as select * from emp;

select * from emp_alter;

alter table emp_alter 
add hp varchar(20);
-- hp 라는 컬럼을 생성해주는 

alter table emp_alter 
    rename column hp to tel; 

select * from emp_alter;
-- hp였던 이름을 가진 컬럼의 이름을 바꿔주기 
    
alter table emp_alter 
modify empno number(5);

desc emp_alter;
-- modify 로 empno의 number 길이를 5자리까지 쓸 수 있게 
-- 다만 길이를 키우고 다시 줄어들게 하는 건 불가능 

alter table emp_alter 
drop column tel;
select * from emp_alter;
-- tel column을 지우는 방법   

rename emp_alter to emp_rename;

select * from emp_rename;
-- 테이블 명 바꾸기 

-- 테이블 삭제하기 ///////////////////////////////////
truncate table emp_rename; 

drop table emp_rename;

---- 10장 dml select문으로 테이블에 데이터를 추가, 변경 , 삭제할 때 사용하는 명령어  ------
create table dept_temp
as select * from dept;

-- 테이블에 데이터를 추가해주는 ( 한 줄을 더 만들어주는 ) 
-- 입력을 계속 해줄 수록 계속 한 줄이 추가된다 // 생성 
select * from dept_temp;

insert into dept_temp ( deptno , dname , loc )
values (50 , 'DATABASE' , 'SEOUL');

insert into dept_temp
values (60 , 'network' , 'Busan') ;
-- 대소문자 쓰는 대로 들어가고 차례를 지켜야함 
-- 테이블 명에 괄호를 생략하면 모든 컬럼 

insert into dept_temp(deptno , dname , loc )
values (70 , '웹' ,null);
-- 한글도 들어가고 null도 들어간다 '' 이렇게 넣어도 null 표시
-- 그치만 자바에선 '' 이것은 null이 아니다 

insert into dept_temp (deptno , loc)
values (90 , '인천');
-- 컬럼을 생략하게 되면 자동으로 널이 들어간다 ex) 90 , null , 인천 // 이렇게 나옴 

select * from dept_temp where loc is null;

-- 교제 272P 날짜 데이터 입력하기 ----------

create table emp_temp
as select * from emp;

select * from emp_temp ;

-- 날짜 지정해서 삽입 
insert into emp_temp ( empno , ename , hiredate )
values (9999, '홍길동' , '2001/01/01');

insert into emp_temp ( empno , ename , hiredate )
values (1111, '성춘향' , '2001/01/05');

select empno , ename , hiredate from emp_temp ;
-- 날짜 데이터는 문자 그대로 넣을 순 있지만 년월일 과 일월년의 차이가 있을 수 있음으로 
-- to_date로 쓰는게 좋고 보편적으로 sysdate를 많이 쓴다 
insert into emp_temp ( empno , ename , hiredate )
values (2111 , '이순신' , to_date('2001-01-07')) ; -- to date 로 삽입 

insert into emp_temp ( empno , ename , hiredate )
values (3111 , '심청이', sysdate);  
-- sysdate 로 삽입하기 

insert into emp_temp
select * from emp where deptno = 10;
select * from emp_temp ;
-- emp 테이블에 emp_temp 정보 넣기 

-- ddl 은 데이터베이스를 정의 하고 실행하면 바로 커밋 

-- //////////////////////////// update ///////////////////////////////////
-- update 와 delete 는 where 가 가장 중요함 
create table dept_temp2 
as select * from dept;
-- dept의 정보를 다시 만들고 
update dept_temp2 
    set loc = 'SEOUL';
-- loc 컬럼이 '전부' 서울로 바뀜 
-- 한 컬럼을 전부 바꿔 주는 듯 ?
select * from dept_temp2;

-- ///////////////////////// rollback ////////////////////////////////
-- 수정된 내용을 되돌리고 싶을 때
-- ex ) dept_temp2 가 전부 서울로 바뀌었으니 update 하기 전으로 rollback 됨 
rollback;
-- 서울로 바꾸기 이전 값으로 다시 rollback 

update dept_temp2 
set loc = 'SEOUL' ,
    dname = 'DATAbase'
where deptno = 40;
-- 한 줄을 업데이트 해서 바꿔줌 
-- where로 부서 번호 라인을 바꾸겠다는 문법인듯 

-- /////////// 안전하게 하는 업데이트 순서 
-- update 하기전에 
-- select 로 where 조건이 정확한지 확인하고 
-- where를 그대로 복사해서 update에 붙여넣기로 하기 
select * from dept_temp2 
where deptno = 40; -- 셀렉에서 내가 원하는 정보 추출해서 맞는 지 

create table emp_temp2 
as select * from emp;

select * from emp_temp2 
where job = 'MANAGER';

-- emp_temp2 에서 
-- 급여가 1000이하인 사원의 급여를 3프로 인상 
select 
    ename , sal , sal * 1.03
from emp_temp2
where sal <= 1000;

update emp_temp2 
set sal = sal * 1.03 ;

select ename , sal from emp_temp2
where sal <= 1000;

delete emp_temp2;

select * from emp_temp2;
rollback;

-- 이쯤에서 정리 -- 
/*
    with //
    select 문을 미리 만들어서 별칭을 붙이고 테이블 처럼 사용한다 
    서브쿼리 // 
    select 안에 또 다른 select를 사용할 수 있다 
    select 의 결과를 활용할 수 있는 곳에서는 아무데나 사용 가능하다 
    
    <ddl 자료 정의어 - 테이블의 구조 자체를 조작> // 
    create | 만들기 , 
    alter | 수정하기 - add : 컬럼 + 타입 추가 , rename : 컬럼명 수정 , modify : 컬럼 타입 수정 , drop : 컬럼 삭제 
    drop | 지우기 , 
    rename | 테이블 명 변경 
    truncate | 테이블 내용 지우기 
    commit이 자동으로 된다 
    
    <dml 자료 조작어>
    (select도 dml임)
    insert | 자료 추가 (삽입)
    update | 자료 수정 where 주의 
    delete | 자료 삭제 where 주의 
*/

-- //////////////////////// 트랜잭션 transaction ///////////////////////////// 
/*
    create 하고 insert 하고 update 하고 해서 마음에 안 들면 rollback 하고 
    마음에 들어서 계속 유지하고 싶다면 commit을 하면 된다 그럼 영구적으로 rollback 하면 
    commit 했던 구간으로 다시 돌아간다 
    // 다시 한 번 강조하면 ddl의 명령어는 무조건 커밋 truncate drop create alter 등 
*/

-- /////////////////////////// 세션 session ////////////////////////////////
-- 어떤 활동을 위한 시간이나 기간을 뜻함 , 오라클 데이터베이스 접속을 시작으로 관련 작업을 수행한 후 
-- 접속을 종료하기 전까지 전체 기간을 의미 
-- ex ) 세션만료 인터넷을 들어가는데 30분 이상 걸리면 세션만료 되듯

-- ////////////////// lock ////////////////////////
-- insert 나 update나 delete 등 하고 commit이나 rollback 을 해야 lock 이 안 걸린다 ?
-- java 에서 연결해서 출력할 때 오류가 걸릴 수 있다 ? 
-- 트랜잭션을 종료하지 않으면 락이 걸린 테이블의 작업수행에 제한을 받을 수 있음 

select * from dict;
-- 오라클이 설치될 때 이미 있는 메뉴얼 같은 것 
select * from user_tables;
-- 이렇게 하면 내가 만든 테이블 정보 

-- index 색인  
-- 오름차순 , 내림차순 따로 관리 
-- 데이터베이스의 속도는 index를 쓰면 조금 더 빠르다 
create index idx_emp_sal 
       on emp(sal);
    
select * from user_indexes;
drop index idx_emp_sal;
-- index 삭제 

-- 강제 hint 
select  /* + index (idx_emp_sal */
* from emp e 
order by empno desc;

-- plan
-- sql developer에서는 상단 세번째 아이콘 '계획설명'
-- cost : 비용 - 조회하는데에 있어서 들어가는 시간적 비용 50이하 정도가 빠르다 
-- index를 적용시키면 보통 cost 가 낮아져서 빠르게 되는 것 

-- view 
-- 가상테이블 
-- select 문을 계속 쓰면 힘드니깐 view 에 저장해놓고 사용할 수도 있고 (편리성)
-- 한정된 정보만 볼 수 있게 제한을 걸어놓을 수도 있다 (보안성)
-- create view 로 view 생성 
-- view 로 where 나 그런 것들을 적용할 수 있음 

-- /////////////////////seqeunce /////////////////////////////////
-- 번호표 발행기 같은 역할 
-- 아래 코드를 조금 편하게 해주는 역할이 sequence
select max(empno)+1 from emp_temp2;
insert into emp_temp2 (
            empno , ename
    )values (
        ( select max(empno)+1 from emp_temp2) , '신입이2'
    );
select * from emp_temp2;
-- 시퀀스는 증가하는 변수라고 생각하면 됨 

create table tb_user (
    user_id number ,
    user_name varchar(30)
);
select * from tb_user;

-- 시퀀스 기본값이 1씩 올라감 
create sequence seq_user;
select seq_user.nextval from dual;
-- 조회할 때마다 +1 씩 증가됨 nextval

select seq_user.currval from dual;
-- 생성된 시퀀스의 현재 값을 보는 currval

insert into tb_user(user_id , user_name)
values ( seq_user.nextval , '유저명1');
insert into tb_user(user_id , user_name)
values ( seq_user.nextval , '유저명2');
insert into tb_user(user_id , user_name)
values ( seq_user.nextval , '유저명3');
select * from tb_user;
-- 만약 값이 마음에 안 들어서 바꾸고 싶으면 지우고 다시 해야함 

create sequence seq_test 
start with 10000 -- 시작숫자 (기본값 1) / 10000 에서부터 시작 
increment by 100; -- 증감 숫자 (기본값 1) / 100씩 증가

-- 생성한 sequence에 nextval 를 사용하지 않은 경우 currval 을 사용 못 함 
select seq_test.currval from dual;
select seq_test.nextval from dual;

-- //////////////////// 제약 조건 /////////////////////////////
/*
    not null - null을 허용하지 않음 , null을 제외한 데이터의 중복은 허용 
    unique - 지정되지 않고 유일한 값을 가져야함 , 중복될 수 없고 null은 딱 한 번 허용 중복 x
    primary key - 유니크랑 비슷함 대신 null 허용 안 하고 테이블에서 하나만 지정 가능 
    foreign key - 다른 테이블의 어떤 컬럼을 참조하여 존재하는 값만 입력 가능 ex) dept 에 deptno 와 같은 
    check - 설정한 조건식을 만족하는 데이터만 입력 가능 
    굳이 안 해도 되는데 실수를 방지해주는 게 제약조건 
*/

------------ 무결성 
/*
    결함이 없는 성질 
    ex ) int a = 1 이거을 a를 출력하면 1이 계속 나오듯 
    
    영역 무결성 - 열에 저장되는 값의 적정 여부를 확인 . 자료형 , 적절한 형식의 데이터 , null 여부 같은 정해 놓은 
                범위를 만족하는 데이터임을 규정 
    개체 무결성 - 테이블 데이터를 유일하게 식별할 수 있는 기본키는 반드시 값을 가지고 있어야 하며 
                null 이 될 수 없고 중복될 수도 없음을 규정 
    참조 무결성 - 참조테이블의 외래키 값은 참조 테이블의 기본키로서 존재해야 하며 null 가능 
*/

-- ///////// primary key \\\\\\\\\\
/*
    primary key , pk , 주요키 , 중요키 , 기본키
    not null + unique 조건 
    생성과 동시에 index도 생성해줌 
    create table 에서는 primary key를 딱 하나만 지정 
    두 개 이상의 컬럼을 primary key 지정 하려면 alter 사용 
*/
create table table_pk(
    login_id  varchar(20) constraint pk_login primary key ,
    login_pwd varchar(20) constraint nn_login not null,
    tel       varchar(20) 
);
create table table_pk2(
    login_id  varchar(20) constraint pk_login primary key ,
    login_pwd varchar(20) constraint nn_login not null,
    tel       varchar(20) 
);

insert into table_pk2 (login_id , login_pwd , tel)
values (null , null, null);

insert into table_pk2 (login_id , login_pwd , tel)
values ('id' , null, null);
-- pw 가 null 이라서 안 됨 
insert into table_pk2 (login_id , login_pwd , tel)
values ('id' , 'pwd', null);
-- 이렇게 하면 되지만 밸류에 있는 값이 위 아이디 , 패스워드 , 텔 과 갯수가 다르면 오류 

select * from user_constraints
-- user_constraints : 사용자가 추가한 모든 제약 조건 확인 
where table_name = 'TABLE_PK2';

select * from user_indexes;
-- user_indexes 내가 만든 index의 정보가 담겨져있음 

create table table_pk3(
    login_id  varchar(20) ,
    login_pwd varchar(20) ,
    tel       varchar(20) , 
    
    primary key ( login_id , login_pwd ) -- primary key 이렇게 사용하면 한 개 이상 고를 수 있음 
);
insert into table_pk3 
values ('id1','pw1',null); -- id1 , pw1 이 들어갔지만 
insert into table_pk3 
values ('id1','pw2',null); -- 이것도 가능한 이유는 둘이 조합해서 유니크 한 것은 가능함 
select * from table_pk3;

select * from user_constraints
where table_name = 'TABLE_PK3';

create table dept_fk(
    deptno1 number primary key ,
    dname varchar2(14)
);
////////// foreign key  \\\\\\\\\\\\\\
-- fk , 외래키 , 참조키 
-- 대상이 되는 테이블의 컬럼과 같은 타입으로 지정해야 한다 
-- 컬럼명은 서로 달라도 관계 없다 (보통은 같게 한다)
-- 대상이 되는 컬럼은 pk이여야 한다 
create table emp_fk(
    empno number primary key ,
    ename varchar2(10) ,
    deptno number references dept_fk (deptno1) 
--  deptno number reference dept_fk 만약 컬럼이 같다면 컬럼명 생략 가능 
);
// 폴링키 넣는 두 번째 방법 
create table emp_fk2(
    empno number primary key ,
    ename varchar2(10) ,
    deptno number , 
    
    foreign key (deptno)
    references dept_fk (deptno1) 

);

insert into dept_fk 
values (100 , '1강의실');

insert into emp_fk 
values ( 1 , '이름', 100); // 101로 쓴다면 101은 없으니깐 에러 

update emp_fk set deptno = 101;
// emp fk에서 100을 참조하고 있어서 수정 , 삭제 불가 

update dept_fk set deptno1 = 101;
delete dept_fk;
truncate table dept_fk;
// 위 세 줄은 싹다 오류 

delete emp_fk;
update dept_fk set deptno1 = 101;
// 지우고 다시 업데이트를 실행하면 된다 

create table table_default(
    login_id  varchar(20) ,
    login_pwd varchar(20) ,
    tel varchar2(20) default '000-0000'
);
insert into table_default 
values ('id','pw','010-1233-4567');
insert into table_default (login_id , login_pwd)
values('id2','pw2');
select * from table_default;

//////////////// 스키마 \\\\\\\\\\\\\\\\\\\\\\\\\\
/*
    구조 , 테이블들을 스키마라고 부름 대충 범위 ? 다른 사용자도 사용할 수 있음 
    오라클 데이터베이스에 접속한 사용자와 연결된 객체 
    index , sequence , table 등 들어감 
    사용자가 즉 스키마 
    사용자 생성은 create user 필수 
    패스워드 생성 identified by 필수 
    사용자 정보 변경은 alter user 
    오라클 사용자 삭제는 drop user 
    사용자와 객체 (스키마 ) 등 다 지우기 drop user ~ cascade 
*/
/////////// 권한 \\\\\\\\\\
/*
    사용자에 따라 사용 가능한 데이터가 달라지도록 설정할 수 있음 
    오라클에서는 시스템 권한과 객체 권한로 분류 
    권한 주는 방법 / grant ~ to ~ 
    권한 취소 / revork ~ from ~ 
*/




