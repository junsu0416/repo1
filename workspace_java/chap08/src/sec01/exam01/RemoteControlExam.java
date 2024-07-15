package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		RemoteControl tv = new Tv();
		Audio audio = new Audio();
		RemoteControl audio2 = audio;
		
//		RemoteControl rc = new RemoteControl(); 당연히 안 됨 
		
		tv.turnOn();
		audio.setVol(12);
		
		List list = new ArrayList();

	}

}
