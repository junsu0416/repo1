package sec01.exam13;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "영일이삼사오육칠팔구";
		
		char c = s1.charAt(3);			// (0,1,2,3) 3의 값을  
		System.out.println("c : "+ c);	// char c 에 문자를 담아서 출력
		int i = s1.length();
		System.out.println("길이 : "+ i);
		
		int i2 = s1.indexOf("이");
		System.out.println("i2 : " + i2);
		
		// 정확하게 일치 하는 게 없으면 -1 
		System.out.println("없는 것 : "+ s1.indexOf("아"));
		
		i2 = s1.indexOf("사오");
		System.out.println("i2 : " + i2);
		
		String blog = "blog.naver.com";
		String cafe = "cafe.naver.com";
		
		// 왼쪽에서부터 첫번째 일치하는 것의 인덱스를 돌려줌
		// 정확하게 일치하는 게 없으면 -1
		if(blog.indexOf("blog") != -1) {
			System.out.println("블로그 주소");
		} else {
			System.out.println("블로그 아님");
		}
		
		if(cafe.indexOf("blog") != -1) {
			System.out.println("블로그 주소");
		} else {
			System.out.println("블로그 아님");
		}
		
		//@와 .이 없으면 이메일 주소 형식이 아님을 판단 
		String email = "junsu0416@naver.com";
		
		if(email.indexOf(".") != 1 && email.indexOf("@")!= -1) {
			System.out.println("이메일 주소를 입력 받았습니다");
		} else {
			System.out.println("정확한 이메일을 적어주세요");
		}
		
		// indexOf 구현 
		char c3 = 'm';
		boolean flag = false;
		for(int i3 = 0; i3 < email.length(); i3++) {
			char c2 = email.charAt(i3);
			if(c2 == c3) {
				flag = true;
				System.out.println(i3);
				break;
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
		
		// 한글 삼사를 숫자 34로 바꿔주는 함수 replace 
		// 첫번째 전달인자를 두번째 전달인자로 "모두" 바꿔줌 
		// 원본은 유지가 됨 
		String s2 = s1.replace("삼사" , "34");
		System.out.println("s1 : "+ s1);
		System.out.println("s2 : "+ s2);
		
		String s3 = "123123123";
		System.out.println(s3.replace("12", "다른글씨"));
		
		// 첫번째 index 부터 4번째 index 까지 보여줌 
		// 첫번째 index 부터 두번째 index 바로 전까지 추출 
		String s4 = s1.substring(1 , 4);
		System.out.println("s4 : "+ s4);
		
		String ssn = "213456-3123694";
//		String s5 = ssn.substring(7, 8);
		String s5 = ssn.substring(ssn.indexOf("-")+1 , ssn.indexOf("-")+1 + 1);
		
		if(s5.equals("1") || s5.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// 전달인자가 하나인 경우 끝까지 다 보여줌 
		System.out.println(ssn.substring(7));
//		System.out.println(ssn.substring(7, 100)); 에러 발생 StringindexOutOfBoundsException
		
		String oldstr = "  글씨  중간띄어쓰기  ";
		System.out.println("[ "+ oldstr.trim() + "]");
		
		String id = "    ";
		String tirm_id = id.trim();
		if(id.trim().length()== 0 ) {
			System.out.println("아이디를 입력해주세요");
		}
		
		// split "," 로 되어있는 것들을 배열로 돌려주기 	
		String menu = "돼지국밥 , 마라탕 , 제육 , 냉면";
		String[] menus = menu.split(",");
		for(String m : menus) {		// 향상된 for문 
			System.out.println(m);
		}
	
		// split 은 정규표현식으로 글씨를 잘라서 배열로 만들어준다 
		// .은 정규표현식에서 사용하는 예약문자라서 
		// [.] or \\. 은 가능  
//		String[] urls = blog.split(".");
		String[] urls = blog.split("[.]");
		System.out.println(urls.length);
		System.out.println(urls[1]);
		
		System.out.println("----------------------------------");
		
		// query string 의 key 와 value를 구분해서 출력하세요 
		String search = "https://search.naver.com/search.naver?ie=UTF-8&query=마라탕&sm=chr_hty";
		String[] params = search.split("&");
//		System.out.println(params[2].split("=")[0]);
//		System.out.println(params[2].split("=")[1]);
		
		int ss = search.indexOf("?");
		System.out.println(ss);
		String sss = search.substring(ss +1);
		System.out.println(sss);
		
		String[] ssss = sss.split("&");
		
		for(String S : ssss) {
			
			System.out.println(S.replace("=",":"));
			
		}
		
//		String search = "https://search.naver.com/search.naver?ie=UTF-8&query=마라탕&sm=chr_hty";
//		String query = search.substring( search.indexOf("?")+ 1);
//		String[] params = query.split("&");
//		for(int i3 = 0; i3<params.length; i3++) {
//			String key = params[i3].split("=")[0];
//			String value = params[i3].split("=")[1];
//			
//			System.out.println("key : "+ key , "value : "+ value);
//		}
		
		
		
		
		
	
	}

}
