package chat05;

public class ArrayExam {

	public static void main(String[] args) {

		//기본타입에는 null을 넣을 수 없다
		// null은 int , string , double 등에 저장할 수 없다
		// ex) int a = null;
		
		//배열 
		// 한 번에 여러 변수를 선언할 수 있음
		// 같은 타입만 선언할 수 있음
		// 생성된 여러 변수들은 index로 관리할 수 있음
		
		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
		intArray[2] = 70;
		
		// 맨 뒤의 []는 배열을 뜻하고 , 그 앞에 있는 모든건 배열의 내용물
		
		int[][] test = new int[3][2];
		int[][] test2 = {
					{5, 6},
					{12, 15},
					{93, 87}
				};
		

		String [] study = {
				"박규태",
				"이제섭",
				"김아영",
				"박경민",
				"정근승",
				"현준수",
				"남현우",
				"김승환",
				"조민정",
				"이정은"
		};
		System.out.println("총 "+ study.length + "명");
		
//		//배열에서 random으로 뽑기
//		double rand = Math.random() * study.length;
//		//0~ 9.999999
//		int index = (int)rand; // 0~9
//		System.out.println("실험 : "+ study[index]);
				
		// 랜덤으로 뽑는 걸 1000번 해서 가장 많이 나온 사람을 선택
		
		int[] vote = new int[study.length];
		for(int i=0; i <1000; i++) {
			double rand = Math.random() * study.length;
			//0~ 9.999999
			int index = (int)rand; // 0~9
			
			vote[index] +=1;
		}
		
		for(int i=0; i < vote.length; i++) {
			
			System.out.println("index "+ i +", 득표수 : "+ vote[i]);
			
		}
		for(int i=0; i < vote.length; i++) {
			
			System.out.println("index "+ i +", 이름 : "+ study[i]);
		}	
		 
		
	}

}
