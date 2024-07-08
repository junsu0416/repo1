package sec04.exam04;

public class Student {
	
	// 값 
	// 이름 , 나이 , 주소 , 성별 , 전공 
	String name;
	int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;
	String id;
	String pw;
	boolean suc = true;
	
	
	// 밑 study subject 에 저장값을 사용하기 위해 
	int intel = 0; 	// 지식 
	int stress = 0; // 스트레스 수치 
	int hp = 100; // 체력 
	int hungry = 0; // 공복감 

	// 행동 
	// 공부 , 식사 , 수면 , 게임 
	
	// 공부 
	// 공부한 내용을 출력하고 
	// 지식이 높아지고 스트레스 높아지고 체력이 떨어진다 공복감 높아지고
	// 전달인자 : String 공부한 내용 (과목)
	// 리턴타입 : 아직 없으니 return x ---> intel 의 값을 받기 위해 int로 바뀜 
	int study(String subject) {
		System.out.println(subject + " 을(를) 공부했다");
		
		intel += 5;
		stress += 10;
		hp--; 
		hungry++;
		
		return intel;
		// void에서 intel 값을 돌려받기 위한 과정 
		// return 을 받아야하니깐 return을 써주면 오류가 나게 되는데 void 를 int로 바꿔주는 과정이 필요하다 
	}
	// 식사 
	// 먹은 음식을 출력하고 
	// 체력 up , 스트레스 조금 down 
	// 공복감이 down 
	// 전달인자 : String 음식 
	// 리턴타입 : int 공복감  
	int meal(String food) {
		System.out.println("맛있는 " + food + " 먹었다 ");
		
		stress -= 5;
		hp += 3; 
		hungry -= 10;
		
		return hungry;
	
	}
	
	// 수면 
	// 전달인자 없음 
	// 리턴타입 없음 
	void sleep() {
		System.out.println("잠자기");
		hp += 3;
		stress -= 20;
		hungry += 5;
	}
	
	// 게임 
	// 단 , 게임 하면서 게임 공부도 했다치고 
	// study 메소드 활용 
	// 전달인자 : 게임이름 
	// 리턴타입 : int stress 
	
//	int game( String lol , int time ) {
//		
//		
//		// 방어 코딩 
//		// time이 0 이하인 경우 다시 입력해주세요 
//		// 시간이 정상인 경우 시간당 한 번씩 " 한판만 더 " 출력 
//		
//		
//		if(time <= 0) {
//			System.out.println("다시 입력해주세요");
//			
//		} else if(time <= 2) {
//			System.out.println("오늘 좀 안 된다 그만하자");
//			System.out.println(lol + " 시작 " + time + "시간");
//			stress += 5;
//			study(lol);
//			return stress;
//		} else if (time <= 4) {
//			System.out.println("간단하게 한 게임 했다 ");
//			System.out.println(lol + " 시작 " + time + "시간");
//			stress -= 10;
//			study(lol);
//			return stress;
//		} else {
//			System.out.println("오늘 신났다 ");
//			System.out.println(lol + " 시작 " + time + "시간");
//			stress -= 20;
//			study(lol);
//			return stress;
//		}
//		
//		hungry += 10;
//		
//	
//			
//	}
	
	int game( String lol , int time ) {
		System.out.println(lol + " 시작 " + time + "시간");
		
		for(double i = 0 ; i < time; i += 0.5) {
			System.out.println("한번만 더하자");
			System.out.println("게임한지 " + i + "시간이 지났다");
		}
	
		study(lol);
		hungry += 10;
		stress -= 10;
		return stress;
		
	}
	// 공부할 때와 게임할 때 스트레스의 수치를 다르게 
	// 스트레스를 전달할 수  있는 study 오버로딩한 메소드 만들기 
	
	int study(String subject , int x) {
		
		stress = x;
		
		return stress;
	}
	
	Student (String x , int y ){
		name = x;
		age = y;
	}
	// 생성자 오버로딩 하는데 나이는 안 받아도 된다 
	
	Student (String x ){
		this(x , 1);
		
	}

//	로그인
//	생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
//	login(아이디, 패스워드) 실행하면
//	login메소드 안에서...
//	만약 같으면 "메인페이지" 출력하고 true 돌려줌
//	다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
	
	Student(String a , String b){
		this.id = a;
		this.pw = b;
	}
	void login(String x, String y) {
		if(this.id == x && this.pw == y) {
			System.out.println("메인페이지");
			suc = true;
			System.out.println(suc);
		} else {
			System.out.println("로그인 화면으로 돌아감");
			 suc = false;
			 System.out.println(suc);
		}
		
	}
	
	
	// 내 정보 보기 얼마나 축적해왔는지 
	// 단축키인데 오른쪽 키 -> source -> Generate toString() 을 누르면 필드의 값을 다 가져와줌 
	// toString의 메소드는 나중에 배울 상속에 관련이 있다 
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + ", gender=" + gender + ", major=" + major
				+ ", hasGlasses=" + hasGlasses + ", intel=" + intel + ", stress=" + stress + ", hp=" + hp + ", hungry="
				+ hungry + "]";
	}
	
	
	
	

	
	
}
