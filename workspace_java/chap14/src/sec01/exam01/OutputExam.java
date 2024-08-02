package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {

		String path = "/Users/hyeonjunsu/Desktop/workspace/sourcerepo1/repo1";
		String fileName = "text.txt";
		
		OutputStream os = null;
		try {
			// stream 열기 
			os = new FileOutputStream(path + "\\" + fileName);
			
			
			String data = "abc\n한글\n123";	// 영어 한글 숫자가 다 잘 되는지 , \n 으로 3줄 다 되는지 확인 
			byte[] datas = data.getBytes(); // String이 byte 계열로 바꾸는 함수 get.Bytes();
		
			// 쓰기
			os.write(datas);
			// 남은 것 내보내기 
			os.flush();
//			// 닫기 
//			os.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block	// 첫번째 트라이에서 문제가 생기면 이쪽에 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block	// 두번째 트라이에서 문제가 생기면 이쪽에
			e.printStackTrace();
		} finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		}
		
		// try - with - resources
		// () 안에 AutoClosable interface 를 구현한 class 를 선언하면 
		// 알아서 close() 실행해줌 
		try( OutputStream os2 = new FileOutputStream(path + "\\" + fileName) ){
			
			String data = "abc\n한글\n123";	// 영어 한글 숫자가 다 잘 되는지 , \n 으로 3줄 다 되는지 확인 
			byte[] datas = data.getBytes(); // String이 byte 계열로 바꾸는 함수 get.Bytes();
		
			// 쓰기
			os2.write(datas);
			// 남은 것 내보내기 
			os2.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
