<!-- 디렉티브 태그 -->
<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"	
    import="java.util.ArrayList"	
    %>
<!--  import를 하는 방법 위와 같이, import를 따로 다른 페이지에 모아둬도 됨 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 밑에 스크립틀릿  -->
	<%
	// 스크립틀릿 자바영역 
	System.out.println("test");
	%>
	<table border="1">
	<%for (int i=0; i<5; i++) { %>	<!-- 자바 for문 돌리는 방법 -->
		<tr>
			<td>제목</td>
			<td>내용</td>
		</tr>
	<%} %>
	
	</table>
	<%
		out.println("<h1>hello</h1>");
	%>
	
	<%
	for (int i=0; i<5; i++) {
		out.println( i + "번째 <br>");
	}
	%>
	
	<%
		int a = 10;
		request.setAttribute("b", 123);
	%>
	el은 scope영역과 파라메터를 가져올 수 있다 <br>
	el은 java 변수만 가져올 수는 없다 <br>
	a의 값은 : \${a } : ${a }
	<%= a %><br>				 <!-- 표현식 int a=10의 값을 바로 출력-->
	<% out.print( a ); %>		 <!--  위랑 같은 방식 --> 
	<hr>
	<% 
		out.print( request.getAttribute("b") );
	%><br>
	<%= request.getAttribute("b") %>
	${b }<br>
	<% 
// 		java.util.List list = new ArrayList(); import 대신 사용하는 방법 
		List list = new ArrayList();
	%>
	<hr>
	<%@ include file="header.jsp" %>	<!-- header.jsp 불러오는 방법  -->
	
	<!-- 필드와 메소드를 선언할 수 있는 -->
	<%!
		// 선언문 
		// 필드 
		String str="글씨";
	
		// 메소드 선언 
		String getStr(){
			return this.str;
		}
	%>
	<jsp:include page="header.jsp">
		<jsp:param name="id" value="idid"></jsp:param>
	</jsp:include>
	
	
	

</body>
</html>