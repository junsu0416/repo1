package sec05.exam02_static;

public class Calc {
	
	String color;
//	static double pi = 3.141592;
	static double pi;
	
//	static {
//		pi = 3.141592;
//		System.out.println(123);
//	} // 실행블럭 빠르게 출력할 수 있는 
	
	// 지역변수 : 해당 블럭에서만 사용 가능 , 블럭이 끝나면 사라짐
	// 필드변수 : new 가 된 순간(인스턴스)부터 사용가능 , 클래스 소멸시 사라짐 
	// static 변수 == 클래스 변수 == 공용변수 
	// 			java 실행시 사용가능 
	// 			java 종료시 사라짐 
	
	Calc(){
		System.out.println(pi);
	}
	
	// static 에서는 
	// static 밖에 못 쓴다 
	// this 못 씀 
	static int test() {
		System.out.println(pi);
//		this.color = "흰색"; 이렇게 사용 불가능 왜냐면 this 는 후발대 같은 느낌 생성자(후발대)의 사용 가능하기 떄문 
//						선발대는 선발대가 사용가능한 것만 사용가능 
//		color = "흰색";
//		test();
		return 1;
	}
	
	// static이 아닌 것은 
	// static을 마음대로 사용할 수 있다 
	// 혹시라도 static이 붙으면 사용가능
	void test2() {
		test();
	}
	
	
}
