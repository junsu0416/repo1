package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar.model);
		
		myCar.model = "흑팔라";
		
		System.out.println(myCar.model);
		
		System.out.println(myCar2.model);
		
		System.out.println(myCar.speed);
		// class Car에서 speed 의 값을 넣지 않았기 떄문에 출력 : 0

	}

}
