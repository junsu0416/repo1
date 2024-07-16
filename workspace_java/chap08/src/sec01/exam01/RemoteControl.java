package sec01.exam01;

public interface RemoteControl {
	
	// 상수 : static final , 변수명을 모두 대문자로 
	// interface에서는 public static final 생략가능 
	public static final int MAX_VOL = 10; 
	int MIN_VOL = 0;
	
	// 추상 메서드 
	// pubilc abstract 생략가능	
	public abstract void turnOn();
	void turnOff();
	void setVol(int vol);
	
	// 메서드 구현까지 해놓기 위해서는 default 키워드를 적어준다 
	// 추상메서드인 경우 기존에 사용하던 클래스에서 무조건 구현해야하는 번거로움이 생기는데 
	// 실행블럭을 구현해 놓으면 사용하고 싶은 클래스만 사용할 수 있다 
	default void search(String word) {
		System.out.println(word);
	}
	
	

}
