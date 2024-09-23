<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>

	<h1>회원 수정</h1>

<form method="post" action="emp0">
	empno : ${emplist.empno }<br>
	ename : <input type="text" name="ename" value="${emplist.ename }"><br>
	hireDate : <input type="Date" name="hireDate" value="${emplist.hireDate }"><br>
	<br>
	<input type="submit" value="회원수정">
	<input type="hidden" name="cmd" value="update">
	<input type="hidden" name="empno" value="${emplist.empno }">
</form>


</body>
</html>