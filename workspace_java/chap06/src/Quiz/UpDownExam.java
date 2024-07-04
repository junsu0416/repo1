package Quiz;

public class UpDownExam {

	public static void main(String[] args) {

		UpDown ud = new UpDown();
		ud.initNumber();
		ud.hint();
		// TODO return 이 있었다면 더 재미있고 정교하게 할 수 있었겠다 
		ud.answer(5);
		ud.answer(7);
		ud.answer(9);
		ud.answer(3);
		ud.answer(2);

	}

}
