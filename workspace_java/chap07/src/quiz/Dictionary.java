package quiz;

public class Dictionary {
	
	String kr[] = new String[] { "사랑" , "우정" } ;
	String en[] = new String[] { "love" , "friendship" } ;
	String jp[] = new String[] { "愛" , "友" } ; 
	
	String korea(String word) {
		for(int i = 0; i < kr.length; i++) {
			if(word.equals(kr[i])) {
				System.out.println(en[i]);
				return en[i];
			}
		}
		System.out.println("단어가 틀립니다");
		return "단어가 맞지 않음";
	}
	

	
	
}
