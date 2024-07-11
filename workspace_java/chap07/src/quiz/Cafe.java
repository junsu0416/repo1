package quiz;

public class Cafe {
	
	int pay = 10000;
	String bill;
	
	void order(String bill) {
		this.bill = bill;
	}
	
	int pay(int money) {
		return pay - money;
	}

}
