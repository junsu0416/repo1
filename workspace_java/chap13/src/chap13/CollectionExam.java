package chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {
		System.out.println("-------------list------------");
		// 순서에 따라 자료가 쌓임 
	
		List list = new ArrayList();
		System.out.println(list.isEmpty());
		
		// 추가 
		list.add("10");
		int a = 20;
		list.add(a);
		list.add(true);
		System.out.println(list.isEmpty());
		
		list.add(1,123); // 1번 자리에 123이 껴서 들어감
						 // 중간에 삽입 
		
		// 삭제 
		list.remove(1);
		
		int b = (Integer)list.get(1);  // 강제 형변환 int , Integer 
		System.out.println(b);
		System.out.println(list.size());
		System.out.println(list);		// toString 이 override 가 자동으로 되어있음 
//		list.get(100);  java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 3
		
		// 초기화 
		list.clear();
		list = new ArrayList();
		
		System.out.println("-------------map------------");
		// key value 로 꺼내올 수 있음 
		
		Map map = new HashMap();
		// 추가 
		map.put("k1", 10);
		map.put("abc", list);
		
		int k1 = (int) map.get("k1");
		System.out.println(k1);
		
		// null  k2엔 값이 없어서
		// key 가 없으면 null 
		// 실제로 key 가 있지만 value 를 null 을 넣었을 경우도 있다
		System.out.println(map.get("k2"));	 
		
		// 다시 초기화 
		list = new ArrayList();
		map = new HashMap();
		map.put("제목", "사건의 지평선");
		map.put("가수", "윤하");
		map.put("가수", "yun ha");
		list.add(map);
		System.out.println(list); // list [] , map {} 로 정렬이 돼서 출력됨 
		
		map = new HashMap();		// new 하는 순간 번지가 새로 추가 됨  얉은 복사 
		map.put("제목", "바람이 분다");
		map.put("가수", "이소라");
		list.add(map);
		System.out.println(list);
		
		// 제네릭 generic	 - 제한 <>
		// 추가할 자료형을 제한하는 용도로 쓰인다
		// 리턴타입이나 전달인자의 타입을 선언할 때 변경할 수 있게하는 기술 
		List<String> list2 = new ArrayList<String>();
		list2.add("글씨");
//		list2.add(2);	// String 제한을 뒀기 때문에 숫자 int 안됨 
		String str = list2.get(0);	// 제네릭이 있는 경우 형변환이 필요없음 
		System.out.println(str);	
		
		// 제네릭에 int 는 사용할 수 없음 , 클래스만 가능
		Map<String , Integer> map2 = new HashMap<String , Integer>();
		map2.put("키값",1);
		int a2 = map2.get("키값");
		System.out.println("key 의 value : " + a2);
		
	}

}
