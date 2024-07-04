package Quiz;

public class Tv {
	int vol2;
	int cha;
	
	
	
	
//	TV 만들기
//	전원
//	볼륨 up/down 0~10
//	>> 볼륨의 범위를 벗어나지 못하게 해주세요
//	채널 up/down/직접입력
//	정보보기 : 현재 전원상태, 볼륨, 채널 정보 출력
	
	
	
	void power(int a) {
		if(a == 1) {
			System.out.println("tv 실행");
		} else {
			System.out.println("tv 꺼짐");
		}
		
	}
	
	void vol(int b) {
		System.out.println("볼륨이 변경 : " + b);
		vol2 = b;
		
	}
	
	void ch (int c) {
		System.out.println("채널변경 : " + c);
		cha = c;
	}
	void chup() {
		System.out.println("채널이 올라갔습니다");
		cha++;
		System.out.println("현재 채널 : " + cha);
	}
	void chdown() {
		System.out.println("채널이 내려갔습니다");
		cha--;
		System.out.println("현재 채널 : " + cha);
	}
	
	void up() {
		System.out.println("소리가 1 올라갔습니다");
		vol2++;
		System.out.println(vol2);
	}
	void down() {
		System.out.println("소리가 1 내려갔습니다");
		vol2--;
		System.out.println(vol2);
	}
	
	void info() {
		System.out.println("현재볼륨은 :" + vol2);
		System.out.println("현재 채널은 : " + cha);
	}
	

	


}
