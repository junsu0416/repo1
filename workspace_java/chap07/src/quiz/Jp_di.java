package quiz;

public class Jp_di extends Dictionary {
	
	@Override
	String korea(String word) {
		for(int i = 0; i < kr.length; i++) {
			if(word.equals(kr[i])) {
				System.out.println(jp[i]);
				return jp[i];
			}
		}
		System.out.println("ㅗ");
		return "단어가 맞지 않음";
	}

}
