package sec02.exam05._typeCase;

import java.util.ArrayList;

public class ChildExam {

	public static void main(String[] args) {

		Child child = new Child();
		child.method1("차일드");
		System.out.println("차일드의 feild1 : "+ child.field1);
		System.out.println(" ------------  ");
		
		Parent p = new Child();
		p.method1("부모");
		System.out.println("부모의 feild1 : "+ p.field1);
		// p.feild1은 부모 클래스의 필드를 가르킨다
		// Override는 메소드만 된다 
		System.out.println(" ============ ");
		
		Child child2 = (Child) p;
		System.out.println("부모의 feild1 : "+ child2.field1);
		
		System.out.println(" =-=-=-=-=-=-=-=-=-=-= ");
		
		Parent p1 = new Child();
		Parent p2 = new Child101();
		
//		p1 = p2
		Child c = (Child)p1;
//		
//		// p2가 child에서 왔는가 ?
//		// p2는 child의 인스턴스인가 ?
//		boolean isChild = p2 instanceof Child;
//		Child c2 = (Child)p2;	// 문제는 없다고 경고는 안 뜨지만 오류가 난다 
//								// 본래에 child101 클래스 타입인데 결국 child로 바꿨기 때문 형제끼리 형변환이 안 됨 
		
		boolean isChild = p2 instanceof Child;
		System.out.println(isChild);
		if(isChild) {
			Child c2 = (Child)p2;
		}
		if(p2 instanceof Child) {
			Child101 c3 = (Child101)p2;
		}
		
		Object obj = new Parent();
		
		ArrayList list = new ArrayList();
		list.add(p1);
		Object obj1 =list.get(0);
		Parent p3 = (Parent) obj1;
		p3.equals(obj1);
		
		System.out.println(123);
		

	}

}
