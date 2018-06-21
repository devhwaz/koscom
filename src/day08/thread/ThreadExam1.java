package day08.thread;

public class ThreadExam1 extends Thread {
	String name;
	public ThreadExam1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name+"안녕^^");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
