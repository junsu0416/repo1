<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	action 의 기본값 : 내 주소 
	method 의 기본값 : get 
 -->
	
	<!-- <form action="/proj2_calc_MVC/calc/makeResult">
		<input type= "number" name= "num1">
		<input type= "number" name= "num2">
		<button type="submit">SEND</button>
	</form>
	 -->
	 
	<form action ="/proj2_calc_MVC/Calc/makeResult" method="post">
		<input type= "number" name= "num1">
		<input type= "number" name= "num2">
		<button type="submit">SEND-post</button>
	</form>
	
	<form action ="/proj2_calc_MVC/Calc/makeResult" method="get">
		<input type="text" name="text1" value="text2"><br>
		<input type="button" name="btn1" value="btn2"><br>
		<button type="button" name="btn2" value="btn3">button2</button><br>
		<input type="password" name="pw1" value="pw2"><br>
		
		<input type="hidden" name="hidden1" value="hidden2"><br>
		<input type="radio" name="radio1" value="radio2">radio2<br>
		<input type="radio" name="radio1" value="radio3">radio3<br>
		
		<input type="checkbox" name="chk1" value="chk2">check2<br>
		<input type="checkbox" name="chk1" value="chk3">check3<br>
		<input type="checkbox" name="chk1" value="chk4">check4<br>
		
		<input type="date" name="date1">
		
		<input type="text" name="text2" value="text3" style="display:none;"><br>
		
		<select name="select1">
			<option value="op1">option 1</option>
			<option value="op1">option 2</option>
			<option value="op1">option 3</option>
			<option value="op1">option 4</option>
		</select>
		<textarea name="textarea1">초기값
		엔터
		엔터</textarea>
		
		
		
		<button type="submit">SEND-get</button>
	</form>
	
</body>
</html>