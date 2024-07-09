package sec06.exam06_get_set;

public class Car {
	
	int speed;
	boolean stop;
	
	// getter 는 필드값을 읽어서 return 하는 기능 
	// get + 필드명 (첫글자만 대문자 )
	// 전달인자 없음 
	// 리턴타입 : 필드의 타입 
	public int getSpeed() {
		return this.speed;
	}
	
	// setter 는 필드값을 수정할 수 있는 기능 
	// 메소드명 : set + 필드명 ( 첫 글자만 대문자 )
	// 전달인자 : 필드의 타입으로 된 변수 ㅌ₩
	// 리턴타입 : 없음 
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// getter 중에서 boolean 타입일 경우 
	// get + 필드명 대신에 is + 필드명도 가능하나 
	// 오류가 발생하는 라이브러리도 있으니 가능하면 get을 쓰자 
	
	public boolean isStop() {
		return this.stop;
	}

}
