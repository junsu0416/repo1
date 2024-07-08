package sec05.exam01_this;

public class Car {

	String model;
	int speed;
	
//	Car(String m){
//		model = m;
//	}
//	Car(String model){
//		model = model;	// 의미 없는 
//	}
	Car(String model){
		
		this.model = model;	// 필드에 있는 model을 가르키기 위한 this  
//		Car c1 = new Car(); 위와 같은 의미 ? 의 코드인듯 
//		c1.model = model; 
		
	}
	
	void setSpeed(int speed) {
		this.speed = speed;	// 위 받은 전달인자가 speed의 값일테니깐 맨 위 필드값을 바꾸려면 this를 사용한다 라고 이해하면 될듯 
	}
	
	// static :고정된 멤버로서 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다 , 정적 메소드 / 정적 필드 
	
	
}
