package sec02.exam01_Quiz;

public class Me {

	
	void coffeeorder (Coffee c){
		
		if(c.isDT()) {
			System.out.println("드라이브 쓰루를 이용합니다");
			c.order("아아");
		} else {
			System.out.println("사용 안 함");
			c.order("뜨아");
		}
		
	}
	
	
}
