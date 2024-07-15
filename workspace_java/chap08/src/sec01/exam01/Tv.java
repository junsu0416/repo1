package sec01.exam01;

public class Tv implements RemoteControl {
	int vol;

	@Override
	public void turnOn() {
		
		System.out.println("tv 켭니다");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("tv 끕니다");
		
	}

	@Override
	public void setVol(int vol) {
		if(vol > RemoteControl.MAX_VOL) {
			vol = RemoteControl.MAX_VOL;
		} else if (vol < RemoteControl.MIN_VOL) {
			vol = RemoteControl.MIN_VOL;
		} this.vol = vol;
		
		System.out.println("tv 현재 볼륨은 : " + this.vol);
		
	}

}
