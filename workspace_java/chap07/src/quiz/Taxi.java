package quiz;

public class Taxi extends Car {
	
	@Override
	void drive(String name) {
		super.name = name;
		System.out.println(name + " 을(를) 운전합니다");
	}
	
	@Override
	void carcolor(String color) {
		super.color = color;
		System.out.println( name + "의 색은 " + color +  "입니다");
	}
	
}
