package sec01.exam01;

import java.util.Scanner;

public class For연습Exam {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
//		int a = 0;
//		System.out.println("숫자를 입력하세요");
//		int a =scan.nextInt();
//		if(a >= 0) {
//			System.out.println(a +" : 양수 ");
//		} else {
//			System.out.println(a +" : 음수 ");
//		}

		/*
		// 입력을 3번 반복
		for(int i= 1; i<=3; i++) {
			System.out.println("숫자를 입력하세요");
			int a =scan.nextInt();
			if(a >= 0) {
				System.out.println(a +" : 양수 ");
			} else {
				System.out.println(a +" : 음수 ");
			}
		}
		*/
		
		// 입력받은 숫자가 0이 아닌 동안 계속 반복
//		for(int a= 1; a != 0;) {
//			System.out.println("숫자를 입력하세요 (종료 : 0 )");
//			a =scan.nextInt();
//			if(a >= 0) {
//				System.out.println(a +" : 양수 ");
//			} else {
//				System.out.println(a +" : 음수 ");
//			}
//		}
//		System.out.println("종료되었습니다");
		
		
		
		for(int b=1; b <= 5; b++) {	// 0단계
			System.out.println("+");
		}
		
		for(int c =1 ; c <= 5; c++) {	// 1단계
			System.out.print("+");
			
		}
		System.out.println();
		
		System.out.println("----------------");
		
		
		// 2단계 내가 한 
		 
		for(int c =1 ; c <= 3; c++) {	
			for(int d=1; d <= 5; d++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		
		
		
		
		// 2-1단계
		
		for(int a=1; a <= 5; a++) {
			System.out.print("+"); {
				System.out.print(" ");
			}
		}
			
		System.out.println();
		System.out.println("-----------------");
		
		// 3단계
		
		//  선생님 예시
		
		// 첫번째 줄
		// + 출력 
		// 한 번 출력 
//		System.out.print("+");
//		System.out.println();
//		
//		// 두번째 줄
//		// + 출력
//		// 2번 출력
//		System.out.print("+");
//		System.out.print("+");
//		System.out.println();
//		
//		for(int i = 1; i <= 2; i++) {
//			System.out.print("+");
//				
//		}
//		System.out.println();
//		int j= 2;
//		
//		j++; //3
//		
//		for(int i = 1; i <= j; i++) {
//			System.out.print("+");
//				
//		}
//		System.out.println();
//		
//		j++; //4
//		for(int i = 1; i <= j; i++) {
//			System.out.print("+");
//				
//		}
//		System.out.println();
		
		for(int k =1; k<= 5; k++) {
			for(int i = 1; i <= k; i++) {
				System.out.print("+");
					
			}
			System.out.println();
		}
		
		System.out.println("------선생님 예시 끝 ---------");
		
		
		// 방법 1
			
			
		for(int a =1 ; a <= 5; a++) {
				for(int b=1; b <= 5 -a; b++) {
					System.out.print("");
				}	
				
		for(int b= 1; b <= a; b++) {
			System.out.print("+");

		}
		System.out.println();
	}
		
		// 이해된 방법 2
		System.out.println("---------------");
		
		// a 가 늘면 b가 줄어들 수 있도록 b <= 5 -a의 값을 줌
		// 첫 줄을 print로 출력해서 가로줄 
		
		for(int a =1 ; a <= 5; a++) {
			for(int b=1; b<= a; b++ ) {
			System.out.print("+");
		} 
		System.out.println(" ");
		}
		
		System.out.println("--------------");
		
		// 4단계
		
		for(int a= 1; a <= 5; a++) {
			for( int b = 1; b <= a ; b++) {
				System.out.print("+");
			}
				System.out.print("");
			for(int c= 1; c <= 5-a; c++) {
			System.out.print(".");
		}
			System.out.println(" ");
			
		}	
		
		System.out.println("------------------");
			
		// 5단계
	
		for(int a= 1; a <= 5; a++) {
			for( int b = 1; b <= a-5 ; b++) {
				System.out.print("+");
			}
				System.out.print("");
			for(int c= 1; c <= 5-a ; c++) {
			System.out.print(".");
		}
			System.out.println(" ");
			
		}	
		
		System.out.println("----------------");
		
		for(int a= 1; a <= 5; a++) {
			for( int b = 1; b <= a ; b++) {
				System.out.print("+");
			}
				System.out.print("");
			for(int c= 1; c <= 5 - a; c++) {
			System.out.print(".");
		}
			System.out.println("+");
			
		}	
		
		System.out.println("--------------------");
		
//		System.out.print("....");
//		System.out.print("+");
//		System.out.println();
//		
//		
//		System.out.print("...");
//		System.out.print("++");
//		System.out.println();
//		
//		System.out.print("..");
//		System.out.print("+++");
//		System.out.println();
		
		//5단계 
		// 또한 자력으로 하지 못함
		// 부모 밑에 자식을 활용을 잘 못함
		// 층수 개념으로 하니깐 좀 이해 되는듯 ?
		
		
		for(int i= 1; i <= 5; i++) {
			for(int j= 1; j<= 5-i; j++) {
				System.out.print(".");	
			}
			for(int k=1;k<=i;k++) {
				System.out.print("+");
			}
			
			
			System.out.println("");
			
		}
		
		System.out.println("5단계 끝 ----------------");
		
		// 6
		
		int 층 = 5;
		for(int a=1; a<=층; a++) {
			for(int b=1; b<=층-a; b++) {
				System.out.print(".");
		}
			for(int c= 1; c<=2*a-1; c++) {
				System.out.print("+");
			}
			System.out.println("");
		}

		System.out.println("---");
		
		//7
		
		 층 = 5;
		for(int a=1; a<=층; a++) {
			for(int b=1; b<=층-a; b++) {
				System.out.print(".");
		}
			for(int c= 1; c<=2*a-1; c++) {
				System.out.print("+");
			}
			
			for(int d= 1; d<=층 -a; d++) {
				System.out.print(".");
			}
				
			System.out.println("");
		}
			
		System.out.println("------------예외 ");
		
		
		
		
		
		
		
		
		
		
		
}
}
			
