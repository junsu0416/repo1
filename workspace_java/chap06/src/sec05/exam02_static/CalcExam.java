package sec05.exam02_static;

public class CalcExam {

	// 자바가 즉 java.exe 가 특정 클래스를 실행할 때 
	// 예를 들어 CalcExam 클래스를 실행할 때 
	// CalcExam.main (스트링 배열)을 실행한다 
	// new CalcExam()하지 않는다 
	public static void main(String[] args) {
		System.out.println(Calc.pi);
		System.out.println("-----------");
		// new 를 안 해도 static 영역에 있는 걸 꺼내옴 
		// 메인이 실행되기도 전에 calc라는 존재가 이미 있기 떄문에 
		// 알아서 가지고 있다가 실행해줌 
		
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();

		calc1.color = "빨강";
		calc1.color = "파랑";
		
		// new를 해놔야 이제 메모리에 위 정보들이 올라감으로써 
		// 불러오기가 가능 ? 
		// 편하게 쓰기 위해서 , 빠르게 쓰기 위해서 
		
		System.out.println(calc1.pi);
		System.out.println(Calc.pi);
		
		calc1.pi = 3;
		System.out.println(calc1.pi); // 스태틱영역에서 힙스택으로 가서 calc를 찾고 스택으로 안 가고 다시 스태틱으로 빠짐 / 이렇게 된다면 비효율적 
		System.out.println(calc2.pi);	// 그렇다면 차라리 System.out.println(Calc.pi); 이렇게 찾는게 효율적 ? 
		
		
		Calc.test();	// new 하기전에 사용가능 static void test() 는 static 이 선발대 같은 느낌이기 때문 
		
		print();		
	}

	static void print() {
		
	}

}
