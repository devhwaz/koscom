package day08.thread;

public class DeamonThread extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("음악 재생!!!");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
