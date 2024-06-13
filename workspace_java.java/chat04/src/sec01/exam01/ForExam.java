package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1씩 증가 하는 걸 5 번 할 거임 
		// 1 + 1 + 1 + 1 + 1
		int sum = 0;
		sum = sum + 1;
//		sum += 1;
//		sum++;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println(sum);
		
		// n* (n+1) / 2		1 ~ n 까지 더한 값 
		// 1 + 2 + 3 + 4 + 5
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		System.out.println(sum);
		
		// 이번에는 1,2,3 ''' 에 해당 하는 걸 변수에 넣어보자
		sum = 0;
		
		// 초기화식
		int i = 0;	
		
		//증감식
		i++; // i == 1 
		
		// 실행문
		sum = sum + i; 
		i++; // i == 2
		sum = sum + i; 
		i++; // i == 3 
		sum = sum + i; 
		
		System.out.println(sum);
		
		
		/*		반복문 만드는 원리
		 * 반복 되는 것 찾기 ctrl + c ,v 해도 바뀌지 않는 것 
		 * 
		 * 반복 되지 않는 것
		 * 		패턴 (규칙)을 찾을 수 있다면 반복문으로 만들 수 있음
		 *		변수를 활용해서 반복되게 만들기 
		 * 
		 * 반복 되지 않는 것의 
		 * 		시작 조건 찾기
		 * 		종료 조건 찾기
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 */ 
		
		// 맨 처음 한 번만 초기화식 실행
		// 조건이 참이면
		// 실행블럭 실행하고 
		// 증감식 실행하고 
		// 다시 조건 보기 반복
		
		//for(초기화식; 조건; 증감식) {
		//		실행블럭
		//	}
		
		int sum2 = 0;
		for( int e = 1; e <= 5; e++ ) {
			 sum2= sum2 + e; 
		 }
		System.out.println("for문 사용 sum2 : "+ sum2);
		
		
		int sum3 = 0;
		for(int t = 1;  t <= 10; t++ ) {
			sum3 = sum3 + t;
		}
		System.out.println("sum3 : "+ sum3);
		
		System.out.println("------------------");
		
		// 문제 1 
		// 1- 10까지 짝수만 출력하기 
		// 1.증감식 이용하기 2.if문 이용하기 두가지 방법 
		
		// 문제 2
		// 조금 어려운 문제.
		// 1 ~ 10까지 한 줄에 3개씩 출력되게 
		
		
		int sum4 = 1;
		for(int p = 1; p <= 5; p++) {
		
			sum4 = p * 2;
				System.out.println("sum4 : "+ sum4);
			
		}
		
		int i5 = 1;
		for(int w = 1; w <= 10; w++) {
			
			i5 = w;
			if (i5 % 2 == 0)
			// 숫자가 짝수인지 확인하기 위해 나누었을 때 나머지가 0인지 확인 하려고.
				System.out.println("i5 : "+ i5);
				
		}
		
		
		
//		int h1 = 0;
//		for(int q = 1; q <= 10; q++) {
//			
//			h1 = h1 + q;
//			
//			
//		}
//		System.out.println(h1);
		
		//선생님 예시
		// 1~ 10까지 짝수만 출력하기 
		// 1.증감식 이용하기
		System.out.println(2);
		int i4 = 4;
		System.out.println(i4);
		i4 = i4 + 2; //6
		
		System.out.println(i4);
		i4 = i4 + 2; //8
		
		System.out.println(i4);
		
		System.out.println("-----------------");
		for(int i6 = 2; i6 <= 10; i6 = i6 + 2) {
			
			System.out.println(i6);
		}
		
		
		//if 문 이용하기 선생님 예시
		int num = 0;
		if(num % 2 == 0) {
			System.out.println(num);
		}
		num = 1;
		if(num % 2 == 0) {
			System.out.println(num);
		}
		num = 2;
		if(num % 2 == 0) {
			System.out.println(num);
		}
		num = num + 1;
		
		
			System.out.println(num);
			
			//위 방법을 쉽게 풀어서 아래 적용 
			
		for(int num2 = 1; num2 <= 10; num2++) {
			if(num2 % 2 == 0) {
				System.out.println(num2);
				
			}
		}
		
//		문제 3줄씩 선생님 예시 
		System.out.println(123);
		System.out.println(456);
		
		System.out.print(1);
		System.out.print(2);
		System.out.print(3); // 3
		System.out.println();
		
		int num3 = 3;
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3); // 6
		if(num3 % 3 == 0) {
			System.out.println();
		}
		
		num3++;
		System.out.print(num3); //7
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3); 
		if(num3 % 3 == 0) {
			System.out.println();
		}
		
		for(int num4 = 1; num4 <= 10; num4++) {
			System.out.print(num4 + ","); 
			if(num4 % 3 == 0) {
				System.out.println();
		}
			
//		int j;
//		for(j = 0; j<=10; j++) {
//			
//		}
//		System.out.println("j : "+ j);
		
		
		
		// 1 ~ 100까지 3의 배수가 몇 개 있는가 
		
		//선생님 예시
		
		int count = 0;
		for(int t = 1; t <=100; t+=1) {
			if(t % 3 == 0) {
				count++;
			}
		}
		System.out.println("3의 배수의 갯수는 : "+ count);
		
		
//		for(int ww = 1 ; ww <=100; ww++) {
//			if(ww % 3 == 0) {
//				System.out.println(ww);
//								//여기서 나누기 3 ??
//			}
//			
//			
//		} 내가 한 거 ,,,,,
			
			
		//구구단 
		//2단 출력
		
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		
		int cnt = 3;
		cnt++;
		System.out.println("2 * "+  cnt  + (2*cnt));
		
		System.out.println("3 * 1 = 3");
		System.out.println("3 * 2 = 6");
		System.out.println("3 * 3 = 9");
		
		System.out.println("----------------");
		for(int k = 1; k <= 9; k++) {
			System.out.println("2 * "+  k  + " = " + (2*k));
		}
			
			
		System.out.println("----------------");
		for(int k = 1; k <= 9; k++) {
			System.out.println("3 * "+  k  + " = " + (3*k));
		}
		
		int dan = 3;
		dan++;
		
		System.out.println("----------------");
		for(int k = 1; k <= 9; k++) {
			System.out.println("dan * "+  k  + " = " + (dan*k));
		}
		
		
		dan++;
		
		System.out.println("----------------");
		for(int k = 1; k <= 9; k++) {
			System.out.println("dan * "+  k  + " = " + (dan*k));
		}
		
		for(int dan2 = 2; dan2 <= 9; dan2++ ) {
			
			System.out.println("---"+ dan2 + "단 ---");
			for(int k = 1; k <= 9; k++) {
				System.out.println(dan2 +" * "+  k  + " = " + (dan2*k));
			}
		
		
		
//		int e = 1;
//		for(int e = 1; e <= 9; e++) {
//			for()
//		}
		
		
	
			
			
		
		}
	}

}
}

