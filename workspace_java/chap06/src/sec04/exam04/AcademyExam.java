package sec04.exam04;

public class AcademyExam {

	public static void main(String[] args) {
		
		Academy a1 = new Academy("천안휴먼센터");
		
		Student s1 = new Student("현준수" , 26);
		Student s2 = new Student("정근승" , 25);
		
		a1.join(s1);
		a1.join(s2);
		a1.viewList();
		
		Student ss1 = a1.getStudent(0);
		ss1.study("클래스");

	}

}
