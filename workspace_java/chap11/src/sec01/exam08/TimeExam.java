package sec01.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {
		
		// TimeStamp 
		// Unix Time 
		long now = System.currentTimeMillis();
		System.out.println(now);

		for(int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		
		System.out.println(System.currentTimeMillis() - now);
		
		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy년 MM월 dd일 HH : mm : ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate = sdf.format(date);
		System.out.println(strDate);
		// 날짜 및 시간 format에 양식을 넣어두고 그 양식대로 출력 
		
	}

}
