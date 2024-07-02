package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		powerOn(); 
		
		Calc calc =new Calc();
		calc.powerOff();
		System.out.println(calc); // heap 영역에 들어간 게 나옴 
		Calc calc2 =new Calc();
		System.out.println(calc2); // 위 calc 출력한 값과 같아질 수가 없음 주소기반 
		
		// power off를 가져올 건데 
		// new calc 로 만들어서 
		// calc의 담고 다시 calc.powerOff 의 메소드를 가져오기 
		
	}
	
	static void powerOn() {
		System.out.println("전원을 켭니다");
	} // void poweron 메소드 종류 
	
} // class 종류 
