package javaexam.thread.exam05.exam03_join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			// sumThread가 종료될때까지 기다린다.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합계: " + sumThread.getSum());
	}
}

