package chat05;

public class ArrayCopyExam0000 {

	public static void main(String[] args) {


		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}		
		};
		
		int sum = 0;
		double avg= 0.0;
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j =0; j< array[i].length;j++) {
				sum = sum + array[i][j];
//				avg = (double)sum / array[i][j];
				System.out.println(array[i][j]);
				count++;
				
			}
		}
		
		// count 변수를 줘서 루프가 돌때마다 셀 수 있게끔 
		
				
		
		System.out.println("개수 : "+ count);
		
		System.out.println("총합 : "+ sum);
		System.out.println("avg : "+ avg);
		
		count = 0;
		for(int i=0; i < array.length; i++) {
			count += array[i].length;
		}
//		System.out.println("개수2 : "+ count);
		
		// 평균 출력 (합계를 개수로 나누기)
		System.out.println("평균값 : " + (double)sum / count);
		
		System.out.println("-------------------------------");
		
		int max = 0; //int가 가질 수 있는 최소값 MIN_VALUE, 최대값은 MAX 
		int[]array2 = {1, 5, 3, 8, 2};
	
		for(int i=0; i < array2.length; i++) {
			if( array2[i] > max ) {
				max = array2[i];
			}
		}
		
		System.out.println("max : "+ max);
		
		
		//전략 : 배열의 첫번째 값부터 혹은 절대 나올 수 없는 최저치를 기준으로 
		// 기준값과 비교해서 큰 값을 새로운 기준으로 정한다 
		
		
		// 1. 배열 뒤집기 : 1 5 2 4 --> 4 2 5 1 로 출력
		// 2. 첫 번째 자리에 0 넣기 : 0 1 5 2 4
		// 3. 마지막 숫자를 첫번째에 넣기 : 4 1 5 2
		
		// 배열 개수를 늘려서 { 3, 4, 7, 5, 1, 4, 6, 4, 5}
		// 4. 홀수와 짝수의 각각 개수를 출력 
		// 5. 주어진 수 ex) 4보다 큰 숫자의 개수 
		// 6. 두번째 최대값 
		// 7. 내림차순으로 정렬 (큰 수부터 작은 수 순으로 )
		
		// Lotto 6개 번호 ( 1부터 ~ 45까지 ) 
		// 8. 중복되지 않게 숫자 선정 
		
		// 9. 자리가 10개 있는 소극장 예약 시스템 
		// 1~10번까지 번호의 자리가 있음 
		// 예약할 자리는 ? 하고 입력 받음 예약이 가능하면 "예약했습니다" 
		// 예약 불가능 하면 "이미 예약 되어있습니다 "
		// 모든 자리의 예약 가능 여부 출력
		// 예약 가능한 자리만 출력
		
		// 임시 비밀번호 8자리 만들기 
		// 모두 다 숫자로 
		// 모두 소문자 (hint : char ascii code )
		// 숫자 두개 이상 , 대문자 1개 이상 , 소문자 1개 이상 조합 
		
		
		int [] num = { 1, 5, 2, 4 };
			for(int i= num.length; i > 0;) {
				i--;
				System.out.print(num[i]);
			}
			
			System.out.println("------------1번문제끝 -------------");
			
			int[] a = {1, 5, 2, 4 };

			// 배열 b를 생성하고 초기 상태를 출력
			int[] b = new int[a.length + 1];
			for(int i = 0; i < b.length; i++) {
			    if(i == 0) {
			        b[i] = 0; // 첫 번째 요소에 0 할당
			    } else {
			        b[i] = a[i - 1]; // 배열 a의 값을 배열 b로 복사
			        				
			    }					
			    System.out.println("b[" + i + "]=" + b[i]);
			}
			// 서로 다른 index 값을 위치 시키기 위해 
			// b = [0] 의 값에 위치 시켰고 
			// a [0] 의 값 1번을 b[0] index 값 뒤로
    		// 위치 시켜야 했기 떄문에  b[i] = a[i - 1];이 나옴 
			
			System.out.println("2번 문제 끝---------------------");
			// 3. 마지막 숫자를 첫번째에 넣기 : 4 1 5 2
			
			// 2 4 1 5 로 만들기 위한 전략 
			 int [] c = { 4, 1, 5, 2};
			
			 int [] d = new int[c.length + 1];
			 	for (int i = 0; i < d.length; i ++) {
				 if(i == 0) {		// 인트값이 0일 때 
					 d[i] = 2;		// d 인덱스 자리 첫번째에 2를 할당 
				 } else { d[i] = c[i - 1]; // c의 index 값의 자리를 -1만큼 뒤로 미룸 
					 
				 }
				 if( i < d.length -1) // 처음에 24152 5자리가 나왔는데 -1을 통해 제외시
				 System.out.println(d[i]); 
			 }
			 	
			 System.out.println("3번 문제 끝 -------------------");
			 
			// 배열 개수를 늘려서 { 3, 4, 7, 5, 1, 4, 6, 4, 5}
			// 4. 홀수와 짝수의 각각 개수를 출력 
			 
//			 if (num % 2 == 1) {
//					System.out.println("홀수");
//				} else {
//					System.out.println("짝수");
//				}
			 
			 
			int [] e = { 3, 4, 7, 5, 1, 4, 6, 4, 5 };
			int count1 = 0;
			int count2 = 0;
				for(int i = 0; i < e.length; i++) {
					if(e[i] % 2 == 1 ) {
//						System.out.println("홀수");
						count1++;
					} else {
//						System.out.println("짝수");
						count2++;
					}
				} 
				System.out.println("홀수 갯수 :"+ count1);
				System.out.println("짝수 갯수 :"+ count2);
		
				System.out.println("4번 문제 끝 -------------------");
				
				
				// { 3, 4, 7, 5, 1, 4, 6, 4, 5} 4보다 큰 숫자의 개수
				
			int [] f = { 3, 4, 7, 5, 1, 4, 6, 4, 5 };
			int count3 = 0;
				for(int i = 0; i < f.length; i++) {
					if(f[i] > 4) { 
						count3++;
					}
				}
				System.out.println("4보다 큰 갯수 : " + count3);
				
				System.out.println("5번 문제 끝 -------------------");
				
//				int max = 0; //int가 가질 수 있는 최소값 MIN_VALUE, 최대값은 MAX 
//		int[]array2 = {1, 5, 3, 8, 2};
//	
//		for(int i=0; i < array2.length; i++) {
//			if( array2[i] > max ) {
//				max = array2[i];
//			}
//		}
//		
//		System.out.println("max : "+ max);

				
			int [] g =	{ 3, 4, 7, 5, 1, 4, 6, 4, 5 };
			int max1 = 0;
			int max2 = 0;
			
			for(int i = 0; i < g.length; i++) {
				if(g[i] > max1) {
					max2 = max1;
					max1 = g[i];
				} else if (g[i] > max2 ) {
					max2 = g[i];
				}
			}
		
			System.out.println("두번째 최대값 :"+ max2);
			
			//max 변수를 두 개로 설정하여 초기값을 0으로 설정 
			// max 1에 최대값을 넣어두고 max2로 이동시킨다 
			// max 1에 새로운 최대값을 설정 
			// max 2에 현재까지의 최대값을 두번째 최대값인 max2에 이동하고 
			// 새로운 최대값을 max 1로 저장 
			// else if 로 현재까지의 최대값보단 작지만 두번째 최대값보다 크다면 
			// 이 요소를 두번째 최대값 " max2" 로 옮긴다 
			// 이런식으로 반복문이 끝난다면 두번째 최대값은 max2 로 값이 저장되게됨 .
			
			System.out.println("-------------6번 끝-----------");
			
			// 7. 내림차순으로 정렬 (큰 수부터 작은 수 순으로 )
			
			
			int [] h =	{ 3, 4, 7, 5, 1, 4, 6, 4, 5 };
			int num1 = 0;
			
			for(int i = 0; i < h.length; i++) {
				for(int j = 0; j < h.length; j++) {
					if(h[i] > h[j]) {
						num1 = h[i];
						h[i] = h[j];
						h[j] = num1;
					}
				}
			} 
			for(int i = 0; i < h.length; i++) {
				System.out.println(h[i]);
			}
			
			
			System.out.println("-----------------7번끝 ");
			
			// Lotto 6개 번호 ( 1부터 ~ 45까지 ) 
			// 8. 중복되지 않게 숫자 선정 
			
			
			
			
			
			
		
	}

}
