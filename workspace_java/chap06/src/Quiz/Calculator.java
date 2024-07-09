package Quiz;

public class Calculator {
	
	
	Calculator(int x , String y , int z){
		
		mmm(x,y,z);
		
	}
	
	void mmm(int x , String y , int z) {
		if(y == "+") {
			System.out.println("결과는 : " + (x + z));
		} else if(y == "-") {
			System.out.println("결과는 : " + (x - z));
		} else if(y == "/") {
			System.out.println("결과는 : " + (x / z));
		} else if(y == "%") {
			System.out.println("결과는 : " + (x % z));
		} else if(y == "*") {
			System.out.println("결과는 : " + (x * z));
		} 
	}
	
	// equals 를  써야했음 
	// null 의 값이 들어갈 걸	 생각했어야 했음
	
	
	
//	Calculator(int x , int y){
////		System.out.println("생성자 실행 ");
//		System.out.println(x - y);
//	}
	
	
	
}
