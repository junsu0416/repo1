package sec01.exam01;

public class 연산자_퀴즈 {

	public static void main (String[] args) {
		
		
		//선생님 예시 
		
		// 7234원이 있어요
		// 5000 , 1000 , 500 , 100 , 50 , 10 , 1
		// 각각 최대 몇 개까지로 표현할 수 있나요 .
		
		int money = 7234;
//		
//		int m5000 = money / 5000; // int끼리 나누기라서 결과가 int 출력값 = 1
//		// 5천원
//		System.out.println("5천원 : "+  m5000);
//		
////		int m1000 = (money - 5000) / 1000; // 7천원일 때만 
//		// 1천원
//		
//		int m1000 = (money - (5000 * m5000)) / 1000;
//		System.out.println("1천원 : "+ m1000); // 결과 2  
//		
//		int m500 = (money - (5000 * m5000)- (1000 * m1000)) / 500; 
//		// 500원 원래 금액에서 5천원 빼고 , 1천원 빼고
//		System.out.println("500원 : "+ m500);
		
		// money 의 값을 = (5000 * m5000) 넣어서 다시 money의 값을 바꿈 / 응용
		
		//방법 2 
		
		int m5000 = money / 5000;
		System.out.println("5천원 : "+ m5000);
		
		money = money % 5000;
		int m1000 = money / 1000;
		System.out.println("1천원 : "+ m1000);
		
		money = money % 1000;
//		money % = 1000;
		
		int m500 = money / 500;
		System.out.println("500원 : "+ m500);
		
	}
	
	
	
}
