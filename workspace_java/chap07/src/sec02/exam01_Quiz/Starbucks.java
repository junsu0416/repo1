package sec02.exam01_Quiz;

public class Starbucks extends Coffee {
	
	@Override
	boolean isDT() {
		return true;
	}
	
	@Override
	void order(String menu) {
		System.out.println(menu + " (을)를 주문 받았습니다 ");
	}
	

}
