package day08.thread;

public class ThreadExam2Test {

	public static void main(String[] args) {
		ThreadExam2 th1 = new ThreadExam2("태희");
		ThreadExam2 th2 = new ThreadExam2("혜교");
		ThreadExam2 th3 = new ThreadExam2("지현");
		
		Thread t = new Thread(th1);
		t.start();
		Thread t2 = new Thread(th2);
		t2.start();
		Thread t3 = new Thread(th3);
		t3.start();
		
		System.out.println("main 종료!!");
		
	}

}
