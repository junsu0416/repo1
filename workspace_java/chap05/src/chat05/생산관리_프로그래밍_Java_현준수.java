package chat05;

import java.util.Scanner;

public class 생산관리_프로그래밍_Java_현준수 {

	public static void main(String[] args) {
		
		// 현준수
	
		// 커피 배열 
//		String[] coffee = new String[3];
//		
//		coffee[0] = "아메리카노";
//		coffee[1] = "카페라떼";
//		coffee[2] = "카페모카";
//		
//		String[] beverrage = new String[3];
//		
//		beverrage[0] = "아이스티";
//		beverrage[1] = "녹차라떼";
//		beverrage[2] = "블랙티";
		
		Scanner scan = new Scanner(System.in);
		

//		int coffee_int = 0;
//		int beverrage_int = 0;
		int menu = -1;
		int cash = 0;
		
//		String[] option = new String[2];
//		
//		option[0] = "HOT";
//		option[1] = "ICE";
		
		int z;
		
		while(menu != 0) {
			
			System.out.println("메뉴를 고르세요");
			System.out.println("1번 커피 , 2번 음료 , 3번 결제 , 4번 종료");
			System.out.println("------------------------------------");
			menu = scan.nextInt();
			if(menu == 1) {
				System.out.println("커피 메뉴를 골라주세요");
				System.out.println("1번 아메리카노 , 2번 카페라떼 , 3번 카페모카");
				System.out.println("------------------------------------");
				for(int i = 0; i < 1; i++) {
					menu = scan.nextInt();
					if(menu == 1) {
						System.out.println("아메리카노 4000원");
						System.out.println("------------------------------------");
						cash += 4000;
						System.out.println("옵션을 골라주세요");
						System.out.println("1.ice , 2.hot");
						System.out.println("------------------------------------");
						
						z = scan.nextInt();
						if(z == 1) {
							System.out.println("ice");
						} else {
							System.out.println("hot");
						}
					} else if (menu == 2) {
						System.out.println("카페라떼 4500원");
						System.out.println("------------------------------------");
						cash += 4500;
						System.out.println("옵션을 골라주세요");
						System.out.println("1.ice , 2.hot");
						z = scan.nextInt();
						if(z == 1) {
							System.out.println("ice");
						} else {
							System.out.println("hot");
						}
					} else if (menu == 3) {
						System.out.println("카페모카 5000원");
						System.out.println("------------------------------------");
						cash += 5000;
						System.out.println("옵션을 골라주세요");
						System.out.println("1.ice , 2.hot");
						z = scan.nextInt();
						if(z == 1) {
							System.out.println("ice");
						} else {
							System.out.println("hot");
						}
					} else {
						System.out.println("메뉴를 골라주세요.");
						System.out.println("------------------------------------");
					}
						
					
				}
			} else if(menu == 2){
				System.out.println("음료 메뉴를 골라주세요");
				System.out.println("1번 아이스티 , 2번 녹차라떼 , 3번 블랙티");
				System.out.println("------------------------------------");
				for(int i = 0; i < 1; i++) {
					menu = scan.nextInt();
					if(menu == 1) {
						System.out.println("아이스티 5000원");
						System.out.println("------------------------------------");
						cash += 5000;
					} else if (menu == 2) {
						System.out.println("녹차라떼 5500원");
						System.out.println("------------------------------------");
						cash += 5500;
						System.out.println("옵션을 골라주세요");
						System.out.println("1.ice , 2.hot");
						z = scan.nextInt();
						if(z == 1) {
							System.out.println("ice");
						} else {
							System.out.println("hot");
						}
					} else if (menu == 3) {
						System.out.println("블랙티 5000원");
						System.out.println("------------------------------------");
						cash += 5000;
						System.out.println("옵션을 골라주세요");
						System.out.println("1.ice , 2.hot");
						System.out.println("------------------------------------");
						z = scan.nextInt();
						if(z == 1) {
							System.out.println("ice");
						} else {
							System.out.println("hot");
						}
					} else {
						System.out.println("메뉴를 골라주세요.");
						System.out.println("------------------------------------");
					}
				} 
			
			} else if(menu == 3) {
				System.out.println("가격은 총 : " + cash + "원 입니다")	;
				
			} if(menu == 4) {
				System.out.println("종료되었습니다");
				break;
			} else {
				continue;
			}
			
		}
		
		
		
		
		}	
	}

