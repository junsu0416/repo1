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
    substr(ename , length(ename) /2 +1.5 ,100)
    -- 나머지 부분을 붙힘 
from emp;











