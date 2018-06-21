package day08.thread;

public class MyThreadTest {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		my.start();
		synchronized (my) {
			System.out.println("my 쓰레드가 완료 될때 까지 잠든다!! ");
			try {
				my.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Total is :" + my.total);
	}

}
