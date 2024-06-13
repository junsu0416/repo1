package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 91;		//if 는 참일때만 동작함
		
		if (score >= 90) { 
			System.out.println("90점 이상입니다.");
			
			if (score >= 95) {
				System.out.println("95점 이상입니다.");
			}
			
		}
		if (score < 90) {
			System.out.println("90점 미만입니다.");
		}
		
		//참고로
		boolean up90 = score >= 90;
		if ( up90 ) {
			System.out.println("up90");
		}
		if ( !up90 ) {
			System.out.println("!up90");
		}
		
		if ( up90 ) {
			System.out.println("참");
		} 
		else {
			//위의 조건이 하나도 만족하지 않는 경우 무조건 실행 
			System.out.println("거짓");
		}
		
		if( score >= 90) {
			System.out.println("학점은 A");	// 윗 줄이 안 맞으면 다음 else를 찾고 맞으면 그 문장 사용, 안 맞으면 다음 줄 else를 찾음
		} else if (score < 90 && score >= 80 ) {
			System.out.println("학점은 B");
		} else {
			System.out.println("학점은 C");
		}
	
		// if , else if , else 이런식으로 묶여있으면 
		// 그 중에서 하나만 실행된다.
		if( score >= 90) {
			System.out.println("90점 이상입니다.");	// if만 쓰면 91점 이상일 때 90점 이상입니다 , 80점 이상입니다 둘 다 출력되지만
			System.out.println("학점은 A");			// else if를 쓰면 그 중 맞는 걸 찾아서 그 문장만 출력됨.
		}
		
		if ( score < 90 && score >= 80) {
			System.out.println("90점 미만 80점 이상입니다.");
			System.out.println("학점은 B");
		}
		
		//3은 짝수인가 ?
//		int num = 3;
//		Scanner input = new Scanner(System.in);
//		num = input.nextInt();
	//		if (num % 2 == 1) {
	//			System.out.println("홀수");
	//		} else {
	//			System.out.println("짝수");
	//		}
		
//		String a = "abc";
//		String b = "abc";
//		
//		b = input.nextLine();
//		if( a.equals(b)) {
//			System.out.println("a와 b가 같다");
//		}	else {
//			System.out.println("a와 b가 다르다");
//		}
		
		double rand = Math.random();
		System.out.println("rand :"+ rand);
		// 0 이상 1미만 
		
		
		int number =(int)(rand * 3);
		number = number + 1;
		number = (int)(rand *3)+ 1;
		
		System.out.println(number);
		
		if(number == 1) {
			System.out.println("가위");
		}
		if(number == 2) {
			System.out.println("바위");
		}
		if(number == 3) {
			System.out.println("보");
		}
		
//		 여기까지 내가 한 것 
		

		
		
		
		
		
		
		

	}
}
