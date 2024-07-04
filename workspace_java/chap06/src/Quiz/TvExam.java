package Quiz;

public class TvExam {

	public static void main(String[] args) {
		
		Tv power = new Tv();
		power.power(1);
	
		Tv vol = new Tv();
		vol.vol(3);
		
		power.ch(10);
		power.up();
		power.up();
		power.up();
		power.up();
		power.up();
		
		power.vol(10);
		power.up();
		power.up();
		power.up();
		
		power.vol(10);
		power.down();
		power.down();
		power.down();
		power.down();
		
		power.info();
		power.chup();
		power.chdown();
		
		
		
	}
}

