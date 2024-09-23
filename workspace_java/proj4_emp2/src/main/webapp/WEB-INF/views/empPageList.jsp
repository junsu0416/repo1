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

	<a href="/proj4_emp2/page"><input value="추가" type="button"></a>
 
	<table border="1">
	
		<tr>
			<th> rnum </th>
			<th> ename </th>
			<th> job </th>
			<th> hireDate </th>
			<th> deptno </th>
		</tr>
		
		<c:forEach var="emp" items="${map.list }">
			<tr>
				<td><a href="/proj4_emp2/emp/read?empno=${emp.empno }">${emp.rnum }</a></td>
				<td>${emp.ename }</td>
				<td>${emp.job }</td>
				<td>${emp.hireDate }</td>
				<td>${emp.deptno }</td>
			</tr>
		</c:forEach>
	</table>
	
	<%
		Map map = (Map)request.getAttribute("map");
		int totalCount = (int)map.get("totalCount");
		
		String str_countPerPage = (String)request.getAttribute("countPerPage");
		int countPerPage = Integer.parseInt(str_countPerPage);
		
		String str_pageNo = (String)request.getAttribute("page");
		int pageNo = Integer.parseInt(str_pageNo);
		
		// 더블로 형변환 뒤 올림처리 해주고 int로 형변환 
		int lastPage = (int)Math.ceil( (double)totalCount / countPerPage );
		
		// 한 번에 보여줄 페이지의 개수
		int countPerSection = 3;	 
		// page section 위치
		int position = (int)Math.ceil((double)pageNo / countPerSection);
		int sec_first = ( (position-1) * countPerSection) + 1;
		int sec_last = position  * countPerSection;
		
		if(sec_last > lastPage){
			sec_last = lastPage;
		}
		
	%>
	
	<c:set var="lastPage2" value="<%= lastPage %>" scope="page"/>
	
	
	<c:if test="<%= sec_first == 1 %>">
		[이전]
	</c:if>
	<c:if test="<%= sec_first != 1 %>">
		<a href="page?page=<%= sec_first - 1 %>">[이전]</a>
	</c:if>
	
	<%-- <c:forEach var="i" begin="1" end="${ lastPage2 }"> --%>
	<c:forEach var="i" begin="<%= sec_first %>" end="<%=sec_last %>">
		<c:choose>
			<c:when test="">
			
			</c:when>
			<c:otherwise>
			
			</c:otherwise>
		</c:choose>
	
	<c:if test="${i eq param.page}">[<a href="page?page=${i }"><strong>${i }</strong></a>] </c:if>
	<c:if test="${i != param.page}">[<a href="page?page=${i }">${i }</a>] </c:if>
	
	</c:forEach>
	
	
	<c:if test="<%= sec_last == lastPage %>">
		[다음]
	</c:if>
	<c:if test="<%= sec_last != lastPage%>">
		<a href="page?page=<%= sec_last + 1 %>">[다음]</a>
	</c:if>
	
	

	
	
		
	


</body>
</html>