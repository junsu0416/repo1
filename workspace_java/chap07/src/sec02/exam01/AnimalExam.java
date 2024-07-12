package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
//		dog = cat; 타입이 같지 않기 때문에 
		
		Animal aDog = new Dog();
		Animal aCat = new Cat();
		
		// aDog = aCat;  같은 타입이기 때문에 가능 
		
		aDog.sound(); 	// 실행은 된다 Animal class에 있기 때문에 그치만
//		aDog.walk();	// walk 는 실행이 안 된다 Animal class엔 walk가 없기 때문에 
						// 부모행세를 하는 자식객체가 생성 되었기 때문인듯 
		aCat.sound();
		
		Animal a3 = new Animal();
		a3.sound();
			
		
			

	}

}
