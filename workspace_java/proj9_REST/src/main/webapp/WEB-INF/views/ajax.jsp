<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	
// 	window.onload = function(){}
	window.addEventListener("load" , function(){
		const btn = document.querySelector("#btn");
		btn.addEventListener("click" , function(){
			
			console.log("click !");
			
			const xhr = new XMLHttpRequest();
// 			const url = "ajax";
			const url = "human/test1";
			 
		   /*
				var: 어디서든 재선언과 재할당이 가능한 변수.
				let: 블록 안에서만 유효하고, 재할당은 가능하지만 재선언은 불가능.
				const: 블록 안에서만 유효하며, 값을 한 번만 정할 수 있는 상수.
				

				"블록"은 중괄호 {}로 묶인 코드 부분을 말해. 예를 들어, 조건문이나 반복문 안에 있는 코드가 블록에 해당해. 
				블록 안에서 선언된 변수는 그 블록 내에서만 사용할 수 있어.
				
			*/
				// 아래 data 값은 key value  
			const data = {
					"ename" : "이름" ,
					sal : 3200 
				}
			
				xhr.open("post" , url)
				xhr.setRequestHeader("Content-Type","application/json");
				
				const strData = JSON.stringify(data);	// 객체를 스트링으로 바꿔주는 stringify 함수
				console.log(data);		// 객체 출력 - 네트워크는 객체를 전달할 수 없다 그래서 stringify
				console.log('' + data);	// "[object Object]" 출력됨 
				console.log(strData);	// 스트링 출력
				
				xhr.send(strData);
				
				xhr.onload = function(){
					console.log( xhr.responseText );
					try {
						let result = JSON.parse(xhr.responseText);
						console.log(result);
						
						console.log( result.ename );
						console.log( result["ename"] );
						
					} catch (e){
						console.log("JSON 아님");
					}
				}
				
			
		});
	});
	
</script>

</head>
<body>

	<button id="btn">ajax 실행</button>

</body>
</html>