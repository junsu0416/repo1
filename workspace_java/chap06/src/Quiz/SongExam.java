package Quiz;

public class SongExam {

	public static void main(String[] args) {
		
		// 지금은 한 곡만 했지만 더 많은 작업을 처리하려면 
		// 배열을 만듬 ArrayList list = new ArrayList(); 를 만들고 
		// ArrayList는 import를 따로 해줘야함 
		// 그 후 list.add(안에 s1,s2,s3); 넣어서 정리해줌 
		// song s4 = (song)list.get(0);	list앞에 강제 형변환 해줌 이것은 상속에 관한 내용 때문 
		
		Song song = new Song();
		
		song.change("수퍼노바");
		song.change2("에스파");
		song.change3("kpop");
		song.change4("수수수수수수수수수수");
		song.change5(123123123);
		song.info();
		

	}

}
