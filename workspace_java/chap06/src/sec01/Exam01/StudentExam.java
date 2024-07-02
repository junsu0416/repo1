package sec01.Exam01;

public class StudentExam {

	public static void main(String[] args) {
		
		// 만든 클래스를 다른 클래스에 불러온다 
		// 실행한 건 아니고 , 메모리에 올린거다 new를 써서 
		Student s1 = new Student(); // 새로운 Student 객체를 생성해서 s1에 담기 
		
		Student s2 = null; // Student 타입의 변수만 만들고 연결은 안 함

		s2 = s1;
		System.out.println(s2 == s1); // true 가 출력 되는데 이건 값이 같은게 아니라 힙영역을 참조하는 번지수 같은 것 
	
	}

}
