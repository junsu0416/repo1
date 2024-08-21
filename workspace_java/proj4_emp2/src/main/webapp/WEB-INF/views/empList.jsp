<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ page import="java.util.List" %>
<%@ page import="emp2.dto.EmpDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
	
	
	
</style>

<body>

	<a href="/proj4_emp2/join"><input value="추가" type="button"></a>
 
	<table border="1">
	
		<tr>
			<th> empno </th>
			<th> ename </th>
			<th> job </th>
			<th> hireDate </th>
			<th> deptno </th>
		</tr>
		
		<c:forEach var="emp" items="${list }">
			<tr>
				<td><a href="/proj4_emp2/emp/read?empno=${emp.empno }">${emp.empno }</a></td>
				<td>${emp.ename }</td>
				<td>${emp.job }</td>
				<td>${emp.hireDate }</td>
				<td>${emp.deptno }</td>
			</tr>
		</c:forEach>
		
	</table>
<hr>

	
	
		<!-- <tr>
			<th> empno </th>
			<th> ename </th>
			<th> job </th>
			<th> hireDate </th>
		</tr> -->
		 
		<%-- <%
		
		List<EmpDTO> list = (List)request.getAttribute("list");
		/* for(int i =0; i<list.size(); i++){
			EmpDTO dto = (EmpDTO)list.get(i);
			
			int empno = dto.getEmpno();
			out.print(empno + " , ");
		} */
		for( EmpDTO dto : list ){
			int empno = dto.getEmpno();
			String ename = dto.getEname();
			out.print("[" + empno + " , ");
			out.print(ename + "]");
		}
		
		%>
		 --%>
		
	


</body>
</html>