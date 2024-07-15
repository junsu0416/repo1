package sec03.exam02._abstract;

// 추상클래스 
// 추상 메소드를 가질 수 있다 
//abstract 를 써버리면 new 를 못함
public abstract class Animal {	
	
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	abstract void sound();
	// 양식만 주고 자식이 반드시 구현해야함 Override 
		
	

}
