package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {
		
		Avante avante = new Avante();
		Driver driver = new Driver();
		Spark spark = new Spark();
		
		driver.run(avante);	// 자동 형변환 
		driver.run(spark);	// 자동 형변환 
		
		Car car = (Car) avante;	// (Car) 생략 가능 
		Car car2 = (Car) spark;	// 형변환을 선언 한 것 
		
		driver.run(car);
		driver.run(car2);
		
		
		

	}

}
