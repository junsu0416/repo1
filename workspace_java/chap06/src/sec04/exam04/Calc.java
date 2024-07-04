package sec04.exam04;

public class Calc {
	
	// 정확히 int , int 를 보내면
	// 즉 , 자료형이 동일한 것을 우선으로 찾아서 실행 
	// 만약 없으면 자동 형변환 해서 들어갈 수 있는 
	// 메소드 찾아서 실행 
	int plus (int x , int y) {
		System.out.println("int int");
		int result  = x + y;
		return result;
	}						
	// 오버로딩
	// 위는 int값으로 받고 지금 이 코드는 double로 값을 받는 함수
	// 두 개를 아무거나 사용가능
	double plus (double x , double y) { 
		System.out.println("double double");  
		double result  = x + y;			
		return result;
	}
	//////////////////////////////////////////////////////
	
	double avg( int x , int y ) {
		double sum = plus( x, y);
		double result = sum / 2;
		return result;
		
	}
	void execute() {
		double result = avg( 7 , 10 );
			println("실행결과 : "+ result);
		}
	void println(String message) {
		System.out.println(message);
	}
	
	/*
	 * 오버로딩 
	 * 1. syso 처럼 전달인자를 신경쓰지 않게 하기 위한 배려 
	 * 2. 전달인자가 너무 많고 기본값을 입력하는 경우가 빈번할 때 
	 * 	  전달인자를 줄이는 목적으로도 사용함 
	 */
	
	void join(String id , String pw , String address , int age , int gender) {
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		
	}
	void join (String id , String pw) {
		join(id , pw , null , -1 , -1);
	}
	
	
	
}
