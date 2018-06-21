package day08.thread;

public class DeamonThreadTest {

	public static void main(String[] args) {
		DeamonThread deamonThread = new DeamonThread();
		deamonThread.setDaemon(true);
		deamonThread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("main 할일 수행중!!! ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		System.out.println("main 종료!!");
	}

}
