package quiz;

public class Mega extends Cafe {
	
	

	void order(String bill) {
		super.bill = bill;
		System.out.println(bill + " 주문 ");
	}
	
	int pay(int money) {
		this.pay -= money;
		return pay;
	}
	

}
