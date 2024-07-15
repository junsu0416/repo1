package sec01.exam01;

public class Audio implements RemoteControl {
	int vol;

	@Override
	public void turnOn() {
		
		System.out.println("audio 켭니다");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("audio 끕니다");
		
	}

	@Override
	public void setVol(int vol) {
		if(vol > RemoteControl.MAX_VOL) {
			vol = RemoteControl.MAX_VOL;
		} else if (vol < RemoteControl.MIN_VOL) {
			vol = RemoteControl.MIN_VOL;
		} this.vol = vol;
		
		System.out.println("audio 현재 볼륨은 : " + this.vol);
		
	}

}
