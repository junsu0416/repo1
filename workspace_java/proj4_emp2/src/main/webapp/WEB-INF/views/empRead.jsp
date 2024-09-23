<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	

<form method="post" action="update">
	<table border="1">
        <thead>
            <tr>
                <th>empno</th>
                <th>ename</th>
                <th>job</th>
                <th>hireDate</th>
                <th>deptno</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${empDTO.empno }</td>
                <td>${empDTO.ename }</td>
                <td>${empDTO.job }</td>
                <td>${empDTO.hireDate }</td>
                <td>${empDTO.deptno }</td>
            </tr>
        </tbody>
    </table>
    <a href="/proj4_emp2/emp/update?empno=${empDTO.empno }"><input type="button" value="수정"></a>
 </form>
 
 <form method="post" action="delete">
 <input type="submit" value="삭제">
 </form>

</body>
</html>