package sec04.exam04;

public class StudentExam {

	public static void main(String[] args) {
		
		System.out.println("===========s1========");
		Student s1 = new Student("김승환", 26);
		// 필드는 초기화 없는 경우 0 ,null , false 로 
		// new 하는 순간 자동 초기화 됨 
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
//		s1.name = "현준수";
//		s1.age = 26;
		s1.hasGlasses = false;
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.hasGlasses);
		
		String name = "아무거나";
		
		// s1.name 과 지금 여기에 String name을 쓰면 그 name은 아무관계 없음 
			
		// 지역변수는 초기화 없이 사용 불가능 
//		int a;
//		System.out.println(a);
		
		System.out.println("===========s2========");
		
		Student s2 = new Student("현준수");
		
		System.out.println(s2.name);
//		s2.name = "박춘보";
//		s2.age = 50;
		System.out.println("===============xxxxxxxxxxxxxx");
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println("===============xxxxxxxxxxxxxx");
		
		System.out.println("==========study의 값 불러오기========");
		// 값을 저장하고 가져오는 과정 
		System.out.println(s1);
		int intel = s1.study("java 클래스");
		// 리턴 받은 값을 intel에 / 리턴 받은 intel 변수에 값을 저장하고 다시 출력 
		System.out.println("공부했더니 지식 : " + intel);
		System.out.println(s1);
		
		System.out.println("==========hungry의 값 불러오기========");
		int h = s1.meal("음식");
		System.out.println("s1의 공복감은 : " + h);
		System.out.println(s1);
		
//		System.out.println("==========game의 값 불러오기========");
//		
//		int stress = s1.game("롤", -1);
//		System.out.println("스트레스 수치 : " + stress);
//		System.out.println(s1);
		
		System.out.println("==========game의 값 불러오기========");
		
		double stress = s1.game("롤", 2);
		System.out.println("스트레스 수치 : " + stress);
		System.out.println(s1);
		
		int asd = s1.study("d " , 20000000);
		System.out.println(asd);
		System.out.println("----------------------------------");
		Student s3 = new Student("아이디" , "패스워드");
		s3.login("아이디" , "패스워드");
		
	
		
		
	}


}
