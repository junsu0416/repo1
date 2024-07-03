package sec04.exam01;

public class Calc {

	// 계산기 전원 상태 
	boolean isOn = false;		
	
	// class 와 method 사이가 필드 
	// 필드에선 선언과 초기화만 가능해서 따로 출력은 불가능 
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다");
		isOn = true;
	}
	/*
	 * 더하기 
	 * 두 수를 입력해서 더한 결과를 돌려줌 
	 * 
	 *  메소드 명 : plus 
	 *  전달인자 : int ,int 
	 *  리턴 타입 : int ( 두 수를 더한 결과 )
	 *  
	 *  @author : email@naver.com
	 *  @param : int x, int y
	 *  @return : int 
	 * 
	 */
		// 위에 설계한 후 작성 
//		전달인자 , 지역변수는 
//		선언되고 메소드 또는 }가 끝나면 사라짐 
	int plus(int x , int y) {
		System.out.println("x :" + x);
		System.out.println("y :" + y);
		
		return x + y;
		
	}
	//////////////////////////////////////////////////////
	
	double divide (int x , int y) {
		
		System.out.println("x : "+ x );
		System.out.println("y : "+ y );
		if(y == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0; // 0은 int 
		} else {
			double result2 = (double)x / y; 
			return result2;
		}
		
		// return x / y;
		// = 을 기준으로 오른쪽이 먼저 실행 되는데 이는 int / int 여서 결과가 int 
		// 이미 소수점이 없어진 int를 double 에 다 담는게 의미가 없다 
		// double / int 는 double 로 자동 형변환 
		// double result2 = (double)x / y;  
		// 하나만 double로 해도 강제 형변환 
	
	}
	/////////////////////////////////////////////////////
	/*
	 * 더하기 2 
	 * 전달인자 : int 배열 
	 * 리턴타입 : int 
	 */
	int plus2(int[] num) {
		int x = num[0];
		int y = num[1];
		
		return x + y;
	}
	////////////////////////////////////////////////////////
	/*
	 * 전달인자의 개수를 지정하지 않고 
	 * 전달 받은 만큼 처리하는 방법 
	 * "..." 가변인자 , 가변 길이 파라메터 
	 * 전달 받은 모든 전달인자를 배열로 처리 
	 */
	int plus3(int ... num) {
		System.out.println("num : " + num);
		
		int sum = 0;
		for ( int i = 0 ; i < num.length ; i++ ) {
			sum += num[i];
		}
		return sum;
	}
	
	
}
