package sec01.exam01;

public class 연산자Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * 변수 명을 정하는 규칙
		 * 
		 * 1. 숫자로 시작하면 안됨
		 * 2. 예약어 사용금지 (int, double)
		 * 3. 특수문자는 _,$만 사용가능 Ex. (int_a;, int my_name;, int $a)
		 * 4. 소문자로 시작 하는 게 좋
		 * 
		*/
		
		int a = 10;
//		a = 11; 
//		a = 10 + 1; 
		int b = a + 1;
		// a = 10 + 1; 
		a = a + 1; // a = 1 + a
		a += 1; 	// a = a + 1과 같다
		a++; 		// a += 1과 같다 	/위와 같다
		++a;
		
		a = 10;
		a++;
		System.out.println("a : "+ a);
		
		a = a - 2;
		a -= 2;
		a -= 1;
		a--; 		// a = a - 1과 같다.
		--a;
		
		a = 10;
		a--;
		System.out.println("a : "+ a);
		//현재 a가 9
		System.out.println("++a : "+ ++a); //출력 : 10
		//현재 a가 10 
		System.out.println("++a : "+ a++); // 출력 : 10
		System.out.println("a++ : "+ a); // 출력 : 11
		//현재 a가 11
		
		System.out.println(a++  +  ++a); 
		// 11 + (a가 12가 된 상태)에다가 1 더하기 : 11 + 13
		//위 내용을 풀어쓰기
		a = 11;
		int result = a; // a
		a = a + 1; 		// a 다음에 오는 ++
		a = a + 1;		// 두번째 a 앞에 오는 ++
		result = result + a;
		System.out.println(result);
		
		boolean c = true;
		System.out.println("c : "+ c);
		c = !c;
		System.out.println("!c : "+ c);
		
		double d = 7.0;
		System.out.println(d/3);
//		System.out.println(3/0); // double일때는 infinity , int 일 때는 / by zero 
		
		int f = 15;
		int p = 5;
		System.out.println("몫 : " + (f / p));
		System.out.println("나머지 : " +(f % p));
		
		// 10000원이 있음 
		// 커피 4500원 몇 잔
		
		int q = 10000;
		int c1 = 4500;
		
		int count = q / c1;
		System.out.println(count + "잔");
		int change = q % c1; 
		System.out.println("q : "+ change);
		
		// 올영에서 전품목 15% 행사
		// 1. 꿀홍차 5000원을 샀는데 얼마를 내야 하나요
		// 2. 꿀홍차 5000원과 립스틱을 10000원을 샀어요 얼마를 내야할까요 
		
		double percent = 0.15;
		int tea = 5000;
		double discount = tea * percent;
		System.out.println("할인받은 금액 : "+ discount);
		double pay = tea - discount;
//		double pay = tea -(tea * percent);
//		double pay = (tea * 1) -(tea * percent);
		
		System.out.println("내야 하는 돈 : "+ pay);
		
		// 7234원이 있어요
		// 5000 , 1000 , 500 , 100 , 50 , 10 , 1
		// 각각 최대 몇 개까지로 표현할 수 있나요 .
		
//		int money = 7234;
//		int k1 = money / 5000;
//		System.out.println("오천원 : "+ k1 + "장");
//		int k2 = 2000 / 1000;
//		System.out.println("천원 : "+ k2 + "장");
//		int k3 = 0 / 500; 
//		System.out.println("오백원 : "+ k3 + "개");
//		int k4 = 200 / 100;
//		System.out.println("백원 : "+ k4 + "개");
//		int k5 = 0 / 50; 
//		System.out.println("오십원 : "+ k5 + "개");
//		int k6 = 30 / 10; 
//		System.out.println("십원 : "+ k6 + "개");
//		int k7 = 4 / 1;
//		System.out.println("일원 : "+ k7 + "개");
		
		
		
		int money = 7234;
		int k1 = money / 5000;
		System.out.println("오천원 : "+ k1 + "장");
		int k2 = money % 5000 / 1000;
		System.out.println("천원 : "+ k2 + "장");
		int k3 = money % 200 / 500;
		System.out.println("오백원 : "+ k3 + "장");
		int k4 = money % 200 / 100;
		System.out.println("백원 : "+ k4 + "개");
		int k5 = money % 200 / 50;
		System.out.println("오십원 : "+ k5 + "개");
		int k6 = money % 30 / 10;
		System.out.println("십원 : "+ k6 + "개");
		int k7 = money % 4 / 1;
		System.out.println("일원 : "+ k7 + "개");
		
		// 틀림
		
		
		
		


//		System.out.println("장 : "+ (money % k1));
		
//		System.out.println("장 : " + (money / k1 ));
//		System.out.println("나머지 : " + (money % k2 ));
		
//		String left = "수박";
//		String right = "멜론";
		
		//단 , left = "멜론" 금지 
//		System.out.println(left);// 결과 : 멜론
//		System.out.println(right);// 결과 : 수박
		
		
//		
//		String left = "수박";
//		String right = "멜론";
//		
//		String tray = "left";
//		left = right;
//		right = tray;
//		
//		System.out.println("left : " + left);
//		System.out.println("right : "+ right);
		
		
		
		String left = "수박";
		String right = "멜론";

		String tray = right; 
		right = left; 
		left = tray; 

		System.out.println("left : " + left); 
		System.out.println("right : "+ right); 

		// 그릇이 있다 가정하고 메론을 접시 칸에 저장
		// 수박을 비어 있는 오른손에 저장 
		// 왼손이 비어 있으니 그릇에 담긴 메론을 왼손에 저장

		
		System.out.println(3 > 5);
		boolean bool = 3 > 5;
		System.out.println(bool);
		
		System.out.println(0.1 == 0.1f); // 결과 false 
		// 같은 타입으로 변경해서 비교 하는 게 좋다.
		
		System.out.println((float)0.1 == 0.1f);
		
		System.out.println("3 == 3 : "+ (3 == 3));
		System.out.println("3 != 3 : "+ (3 != 3));
		
		String str1 = "현준수";
		String str2 = "현준수";
//		System.out.println(str1 == str2);
//		글씨 비교는 == 사용금지
//		String 변수나 ""에 .equals( ) 붙여서 사용 ( ) 안에 글씨와 비교 
		System.out.println(       str1.equals(str2)      );
		
		System.out.println(  10 & 3  );
		System.out.println(  10 | 3  );
		
		int o1 = 7;
		int o2 = 5;
		int o3 = 17;
		
		System.out.println( "o3이 가장 큰 값인가 ? "
					+ ( (o3 >= o1) && (o3 >= o2)  )   );
		
		
		boolean o4 = o3 > o2;
		System.out.println(  o4 ? "o3이 크다" : "o3이 작거나 같다"   );
		
		
		// 10의 자리 이하는 버리는 코드 , value 값을 300이 나오게 
		int value = 356;
		System.out.println(value / 100 * 100 );
		
		
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;	//예상 2.5
		System.out.println("var3 : " + var3); 	//출력 2.0
		int var4 = (int) (var3*var2);	
		System.out.println("var4 : " + var4);
		
		
		//위에 int var1 ,var2를 double로 바꿔야함 
	
		
		
		
		
		
		
		
		
		
	}

}
