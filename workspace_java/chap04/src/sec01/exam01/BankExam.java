package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		
		
		//은행 계좌의 잔고 관리 시스템
		// 1번 입금 2번 출금 3번 조회 4번 종료
		// 입금 :잔고에서 더하기
		// 출금 : 잔고에서 빼기
		// 조회 : 잔고 출력
		// 종료 : 종료

		
		Scanner scan = new Scanner(System.in);
		
		int ye = 0;
		int menu = -1;	
		while(menu != 0) {	
		System.out.println("처리 업무 고르기");
		System.out.println("1 : 예금 , 2번 : 출금 , 3번 : 잔고 , 0: 종료");
		menu = scan.nextInt();
			if(menu > 0 && menu <= 3) {
				if(menu == 1) {
					System.out.println("예금 금액을 입력해주세요");
					menu = scan.nextInt();						
					System.out.println("완");
					
				} else if(menu == 2) {
					System.out.println("찾으시려는 금액을 입력해주세요");
					menu = scan.nextInt();
					System.out.println("출금완");
					
				} else if(menu == 3) {
					System.out.println("잔액 표시");
					menu = scan.nextInt();
					System.out.println("00원 남음");
					
				} else if (menu == 0) {
//					System.out.println("종료");	
				} 
	
			}
			System.out.println("종료");
			if (menu == 0)break;
		} 
		
		
		
		
		
		
		
	}

}

		