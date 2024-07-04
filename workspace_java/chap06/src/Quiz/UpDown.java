package Quiz;

public class UpDown {
	
	// random으로 하는 방식 
	int number = (int) (Math.random() * 100) % 10;
	
	// number 의 숫자를 지정하는 기능 
	void setNumber (int num ) {
		number = num; 
	}
	
	// 임의의 수로 교체 
	void initNumber() {
	    number = (int)(Math.random() * 100) % 10;
	}
	
	void hint() {
		System.out.println("number : " + number );
	}
	
	// updown 정답을 판단하는 기능 
	// 전달인자 : int(사용자가 추측한 숫자) 
	// 리턴타입 : 없음 
	void answer(int num) {
		if(number == num) {
			System.out.println("정답");
		} else if (number > num){
			System.out.println("up");
		} else if (number < num) {
			System.out.println("down");
		}
	}

}
