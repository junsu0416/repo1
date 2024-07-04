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
	
	
//	Calculator(int x , int y){
////		System.out.println("생성자 실행 ");
//		System.out.println(x - y);
//	}
	
	
	
}
