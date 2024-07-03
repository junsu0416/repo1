package sec04.exam01;

public class CalcExam {	// 클래스 

	public static void main(String[] args) { // 클래스 안 메소드 
		powerOn(); 
		
		Calc calc = new Calc();
		calc.powerOff();
		System.out.println(calc); // heap 영역에 들어간 게 나옴 
		Calc calc2 = new Calc();
		System.out.println(calc2); // 위 calc 출력한 값과 같아질 수가 없음 주소기반 
		
		// power off를 가져올 건데 
		// new calc 로 만들어서 
		// calc의 담고 다시 calc.powerOff 의 메소드를 가져오기 
		////////////////////////////////////////////////////////////////////////////
		
		Calc calc3 = new Calc();
		calc3.powerOn();
		calc3.isOn = true;
		
		int result = calc3.plus(3 , 8);		// calc 더하기를 하는 메소드를 만들어서 그 메소드를 끌고 옴 
		// int result = calc3.plus(3 ,calc3.plus(3 , 2)); 의 결과 값은 8 더하고 결국 또 더하는 
		System.out.println("plus 결과 : " + result);
		/////////////////////////////////////////////////////////////////////////////
		
		// 두 정수(int)를 받아서 나누기한 결과를 
		// 실수(소수점)로 돌려줌 
		// 전달인자 : int , int 
		// 리턴타입 : double 
		// 두번째 전달인자가 0인 경우에 대한 방어 코딩 
		// 0 이라면  "0으로 나눌 수 없습니다 " 출력 
		// return 값은 0으로 고정 
		double result2 = calc3.divide(10 , 4);
		System.out.println("divide 결과 : " + result2);
		//////////////////////////////////////////////////////////////////////////////
		
		int[] a = {2 , 7};
//      int[] a = new int[] {2,7};
//		int[] a = new int[2];
//		a[0] = 2;
//		a[1] = 7;
//		다 같은 방식 
		System.out.println( calc3.plus2(a) );	
//	    배열 0 , 1 index 의 값을 더하는 메소드를 가져와서 사용 
		///////////////////////////////////////////////////////////////////////////////
		
		int num = calc.plus3(1,2,3,4);
		System.out.println("plus3 결과 : "+ num);
//		1부터 원하는 숫자까지 다 더해줄 수 있는 그런 함수인듯 
		///////////////////////////////////////////////////////////////////////////////
		
	}
	
	static void powerOn() {	// 클래스 안 메소드 2 
		System.out.println("전원을 켭니다");
	} // void poweron 메소드 종류 
	
} // class 종류 
