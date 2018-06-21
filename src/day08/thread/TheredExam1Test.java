package day08.thread;

public class TheredExam1Test {

	public static void main(String[] args) {
		ThreadExam1 th1 = new ThreadExam1("철수");
		th1.start();
		ThreadExam1 th2 = new ThreadExam1("영희");
		th2.start();
		ThreadExam1 th3 = new ThreadExam1("순희");
		th3.start();
		
		System.out.println("main 종료!!");
	}

}
