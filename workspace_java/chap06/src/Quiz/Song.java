package Quiz;

public class Song {

	String title;
	String singer;
	String cate;
	String lyr;
	int time;
	
	void change (String x){
		title = x;
		
	}
	void change2 (String x){
		singer = x;
		
	}
	void change3 (String x){
		cate = x;
		
	}
	void change4 (String x){
		lyr = x;
		
	}
	void change5 (int x){
		time = x;
	}
	void info (){
		System.out.println(title + "," + singer  + "," + cate  + ","  + lyr + "," + time );
	}
	
}
