package sec05.exam05_final;

public class Person {

	// final을 넣게 되면 korea의 값을 usa로 바꿀 수 없다
	final String nation = "Korea";	 	
	// final로 선언하는 동시에 초기화하지 않은 경우
	// 생성자에서  한번 값을 초기화 할 수 있다 
	// 선언만 불가능 
	final String ssn; 
	String name;
	
	// 상수 static final 대부분 대문자로만 돼있음 
	
	Person(String name , String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	
	void test() {
//		nation = "USA";
		System.out.println(Math.PI);
	}
	
}
