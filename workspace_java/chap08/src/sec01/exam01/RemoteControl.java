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
	
	

}
