<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${ cmd eq 1 }">	
	
		<a href="update?empno=${ empDetails.empno }">수정</a> <br>
		
			회원번호 : ${empDetails.empno }<br>
			회원이름 : ${empDetails.ename }<br>
			업종 : ${empDetails.job }<br>
			급여 : ${empDetails.sal }<br>
			입사날짜 : ${empDetails.hireDate }<br>
		
		
	</c:if>
	
	<c:if test="${ cmd eq 2 }">
		<form action="update" method="post">
			<input type="text"name="empno" value="${empDetails.empno }"><br>	
			<input type="text"name="ename"  value="${empDetails.ename }"><br>	
			<input type="text"name="job"  value="${empDetails.job }"><br>	
			<input type="text"name="sal"  value="${empDetails.sal }"><br>	
			<input type="Date"name="hireDate" value="${empDetails.hireDate }"><br>	
			
			
<%-- 			<input type="hidden" name="empno" value="${empDetails.empno }"> --%>
<%-- 			<input type="hidden" name="ename" value="${empDetails.ename }"> --%>
<%-- 			<input type="hidden" name="job" value="${empDetails.job }"> --%>
<%-- 			<input type="hidden" name="sal" value="${empDetails.sal }"> --%>
<%-- 			<input type="hidden" name="hireDate" value="${empDetails.hireDate }"> --%>
			<input type="submit" value="수정">
		</form>
	</c:if>
	
	
</body>
</html>