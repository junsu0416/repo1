package sec01.exam01;

public class TryExam {

	public static void main(String[] args) {
		
		try {
		
		String s1 = null;
		
//		System.out.println(s1.length());	// NullPointerException
		System.out.println(s1);
		
		int[] a = new int[2];
//		a[100] = 3;		//  Index 100 out of bounds for length 2
		

//		String s2 = "20a";
		String s2 = "20";
		int age = 0;
		
		
			
		age = Integer.parseInt(s2);	// 글자를 숫자로 // NumberFormatException
		System.out.println(age + 1);
		
		ThrowsTest tt = new ThrowsTest();
//		tt.throwException();
		
		tt.human(3);
		
		} catch (HumanException he) {
			
			String message = he.getMessage();
			if("EC05".equals(message)) {
				System.out.println("5미만을 입력하셨습니다. 확인해주세요");
			} else if ("EC10".equals(message)) {
				System.out.println("10초과를 입력하셨습니다. 확인해주세요");
			}
		
		} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e);
			System.out.println("------------");
			
			e.printStackTrace();	// 안 쓰면 오류가 나도 지나감 왜 오류가 안 났는지 모른다 
			
			System.out.println("------------");
			System.out.println(e.getMessage());

			
		}
		
		System.out.println("완료");
		

	}

}
