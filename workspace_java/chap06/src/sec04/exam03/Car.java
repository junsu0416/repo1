package sec04.exam03;

public class Car {
	
	int gas = 10;
	// 필드 
	// 클래스 생성(new 하는 순간에)과 함께 생성되고 
	// 클래스 소멸시까지 생존 
	// 메모리를 차지함 
	// 계속 저장된다 , 메소드에서 변경하는 경우 다음번 실행까지 저장해둠 
	// 그래서 계속 초기화 해야하는 상황이 있을 수 있다 
	// 클래스 안의 모든 곳에서 사용 가능하다 
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다 ");
			return false;
		} 
			System.out.println("gas가 있습니다 ");
			return true;
		}
		
		void run() {
			while (true) {
				if(gas > 0) {
					System.out.println("달립니다(gas잔량 : " + gas + ")");
					gas -= 1;
				} else {
					System.out.println("멈춥니다(gas잔량 : "+ gas + ")");
					// 리턴타입이 void이므로 
					// 아무값도 돌려주면 안 된다 
					// return을 만나면 그 즉시 
					// 메소드 종료 
					return;
				}
			}
	}
		
		String name;
		// name의 값을 변경하는 메소드 
		// name 길이가 0인 경우 변경하지 않음 
		// 전달인자 : string 
		// 리턴타입 x 
		void setName(String nick) {
			if(nick.length() != 0 ) {
				name = nick;
			} else {
				System.out.println("이름을 입력하세요");
			}
			
		}
		
		

}
