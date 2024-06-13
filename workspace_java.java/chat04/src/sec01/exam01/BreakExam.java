package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {
		
		
		System.out.println("게임을 시작합니다");
		int count = 0;
		
		while(true) {
			count++;	// 무조건 세는 것 
			int num = (int)(Math.random() * 6)+1;
			System.out.println(num);
			
			if(num==6) {
				break;	 // 가장 가까운 반복문을 종료 조건에 관계없이
			}
//			여기에 count++를 넣으면 break를 안 만났을때만 세는 것 
		}
		System.out.println("게임종료 : 총 "+ count);
		
		
		
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			if (i >= 7) { // == 로 표현하면 도중에 홀수 나 짝수의 경우의 수라면 넘어갈 수 있다 위험방지를 위해 >=,<=
				break;
			}
			System.out.println("한 턴 종료");
		}
		System.out.println("for문 종료");
		
		for(int i=0; i < 5; i++) {
			System.out.println("i: "+ i);
			
			for(int j=0; j < 3; j++) {
				System.out.println("j: "+ j);
				
				if(j >= 1) {
					break; // j에 대한 for문만 종료한다
				}
			}
			System.out.println();
		}
		
		
		for (int i=0; i < 10; i++) {
			if(i % 2 !=0 ) {
				continue;	// 이후 실행문은 무시 
			}
			System.out.println("짝수 ? : "+ i);
		}
		
		// continue : 다음 쇼츠로 넘어가기
		// break : 유튜브 끄기
		
		
		
		
		
		
		

	}

}
