package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		double rand = Math.random();
		// 0 이상 1 미만 
		// 0 <= rand && rand < 1
		// 0 ~ 0.9999999999
		
		// 0 * 45 <= rand * 45 < 1*45 
		// 0 ~ 45 * 0.9999999999 == 44.999999999
		// int 로 바꾸면
		// 0 ~ 44까지 나오고 1을 더하면 
		// 1 ~ 45 까지 random한 숫자가 나온다.
		
//		int number = (int)(rand * 45); // 0 ~ 44까지
//		number = number + 1;			// 1 ~ 45까지
//		number = (int)(rand *45)+ 1;	// 그냥 위에 것을 한 번에 쓴 것 
//		
//		number = ( (int)(rand * 10000) ) % 45 + 1;
//		System.out.println(number);
//		
//		
//		rand = Math.random();
//		number = (int)(rand *45)+ 1;
//		System.out.println(number);
		
		// 주사위 
		
//		int number = (int)(rand * 6); // 0 ~ 44까지
//		number = number + 1;			// 1 ~ 45까지
//		number = (int)(rand *6)+ 1;	// 그냥 위에 것을 한 번에 쓴 것 
//		
//			number = ( (int)(rand * 10000) ) % 6 + 1;
//			System.out.println(number);
//		
//		
//		rand = Math.random();
//		number = (int)(rand *6)+ 1;
//		System.out.println(number); 
		
		
//		double rand2 = Math.random();
//		
//		int dice2 = (int)(rand2 * 6) + 1;
//		System.out.println("주사위 숫자는 :"+ dice);
//		
//		if( dice2 == 1 ) {	
//			System.out.println("주사위 1 나왔습니다");
//		} else if (dice2 == 2) {
//			System.out.println("주사위 2 나왔습니다");
//			
//		}
//		
//		switch(dice2) 
		
		
		
		int month = 1	;
		
		if ( month >= 3 && month <= 5) {
			System.out.println("봄");
		}	else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		}	else if ( month >= 9 && month <= 11) {
			System.out.println("가을");
//		}	else if ( month == 12 || month == 1 || month == 2) {
//		}	else if ( month == 12 || (month >= 1 && month <= 2) ) {
		}	else  {
			System.out.println("겨울");
		}
		
		
		
		switch(month) {
		case 3 : 
		case 4 :
		case 5 :
			System.out.println("봄2");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름2");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을2");
			break;
		default :
			System.out.println("겨울2");
			break;
		
		
		
		
		
		
		
		// - 여기부터 가위바위보 
//		rand = Math.random();
//		int rsp = (int)(rand * 3); // 0~ 2
//		if(rsp == 0) {
//			System.out.println("가위");
//		} else if (rsp == 1) {
//			System.out.println("바위");
//		} else {
//			System.out.println("보");
//		}
//		
//		int my = 1; //바위
//		
//		if( rsp == my ) {
//			System.out.println("비김");
//		} else {
//			
//		}
//		
//		
//		
//		if( rsp == 0 && my == 0) {
//			System.out.println("비김");
//		}	else if (rsp == 0 && my == 1) {
//			System.out.println("내가 이김");
//		}	else if (rsp == 0 && my == 2) {
//			System.out.println("내가 짐");
//		}
		
		
		
	}
		//char , byte , short , int (즉, int 이하 ) , string만 허용됨
		//boolean , long , float , double 은 못 씀
		
		// 6개의 lotto 번호를 저장하고 싶다
		int[] lotto = new int[6];
		for(int i =0; i <lotto.length ; i++) {
			lotto[i] = (int)(Math.random() *45) + 1;
			
		}
		
		for(int i =0; i <lotto.length ; i++) {
			System.out.println(i + " 번호  : "+ lotto[i]);
		}
		
		
		
	}
}


