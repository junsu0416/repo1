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








