package sec02.exam01_Quiz;

public class CoffeeExam {

	public static void main(String[] args) {
		
		Starbucks starbucks = new Starbucks();
		Coffee coffee = new Coffee();
		Me me = new Me();
			
		me.coffeeorder(starbucks);
		me.coffeeorder(coffee);
		

	}

}
