package sec01.exam03;

public class Computer extends Calc {

	@Override	// 부모꺼에 같은 게 있는지 없는지 찾아준다 
				// 다르다면 오류를 내줌 ? 
	double areaCircle(double radius) {
		System.out.println("Computer 의 areaCircle 실행");
		plus (1,2);
		return Math.PI * radius * radius;
	}
	
	@Override
	int plus(int x , int y) {
		System.out.println("문의하신 정답은 ");
		int result = super.plus(x,y);
		System.out.println(result + "입니다");
		
		return result;
	}
	
	
}
