package quiz;

public class CafeExam {

	public static void main(String[] args) {
		
		Cafe c = new Cafe();
		Paik p = new Paik();
		Mega m = new Mega();
		
		p.order("사라다빵");
		p.pay(3000);
		System.out.println(p.pay);
		
		System.out.println("-------------------");
		
		m.order("할메가");
		m.pay(2000);
		System.out.println(m.pay);

	}

}
