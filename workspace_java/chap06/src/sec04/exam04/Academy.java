package sec04.exam04;

import java.util.ArrayList;

public class Academy {
	
	String name; 	// 학원이름 
	int idx = 0; 	// 
	
	Student[] list1 = new Student[10];
	ArrayList list2 = new ArrayList();
	
	Academy(String name){
		this.name = name;
	}
	// join : 학원생을 필드에 등록 
	// 전달인자 : Student 
	// 리턴타입 : 없음 
	
	void join(Student s) {
		this.list1[0] = s;
		
//		for(int i = 0; i < list1.length; i++) {
//			if(list1[i]==null) {
//				list1[i] = s;
//				break;
//			}
//		}
		
		// 배열의 길이를 넘지 않도록 
		if(idx < this.list1.length) {
//			this.list1[idx] = s;
//			idx++;
			this.list1[idx++] = s; // 위를 좀 더 단축시키는 방법 
		} else {
			System.out.println(" 만석입니다 ");
		}
		list2.add(s);
		
		
	}
	// viewList : 모든 학생들의 이름과 나이만 출력 
	// 전달인자 : 없음 
	// 리턴타입 : 없음 
	void viewList() {
		System.out.println("학원이름 : "+ this.name);
		
		// 배열출력 
		for(int i = 0; i < list1.length; i++) {
			Student s = list1[i];
			if(s != null) {
				System.out.println("이름 : "+ s.name + " 나이 : "+ s.age);
			}
		}
		// ArrayList 출력
		for(int i = 0; i < list2.size(); i++) {
			Student s = (Student)list2.get(i);
		}
		
		
	}
	
	Student getStudent(int index) {
		return list1[index];
	}

}
