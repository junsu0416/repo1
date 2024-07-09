package sec01.exam01;

public class Parent {
	
	String name = "parent의 name";
	
//	Parent(){
//		System.out.println("parent 기본 생성자");
//	}
	Parent(String name){
		System.out.println("parent 기본 생성자");
	}
	
	String getName() {
		System.out.println("parent의 getName 실행");
		return this.name;
	}

}
