package sec03.exam01;

public class Car {

	String name;
	String color; 
	int cc; 
	
	
	// 생성자 : new 할 때 무조건 실행되는 메소드의 일종 
	// return은 쓰지 않음 : 무조건 생성된 주소를 돌려주기 때문 
	// 메소드 명에 해당하는 이름은 무조건 클래스 명이어야 함 
	
	// 만약에 생성자를 적지 않으면 
	// 기본 생성자가 자동으로 만들어짐 (기본 생성자는 생략가능) 
	// 기본 생성자 : ex) Car(){}
	// 생성자는 java에게 중요해서 무조건 있어야함 
	
	// 내가 생성자를 적은 경우 
	// 기본 생성자는 만들어지지 않음 
	
	// 생성자 사용 이유 
	// 1. 귀찮으니깐 무조건 실행하게 만들어줌 
	// 2. 생성을 위한 필수값 관리 - 필수값이 없으면 생성을 막음 / ex ) 밑에 있는 car에 있는 String , int 값을 줘야함 
	Car(){
		
		// this를 사용할거면 생성자 무조건 첫 줄에 작성 
		// 오버로딩된 다른 생성자 호출 
		this("회색" , 1000);
		System.out.println("생성자 실행");
		name = "자동차";	// 필드가 먼저 선언되고 생성자 실행 
		System.out.println(name);
		test();
		
//		color = "회색";
//		cc = 1000;
//		this("회색" , 1000);
		
	}
	
	Car(String color2 , int cc2){
		System.out.println("color : " + color2);
		System.out.println("cc : " + cc2);
		
		color = color2;
		cc = cc2;		
	}
	
	void test() {
		System.out.println("테스트");
	}
	
	void print() {
		System.out.println("===================");
		System.out.println("color : " + color);
		System.out.println("cc : " + cc);
		System.out.println("===================");
	}
	
	
}
