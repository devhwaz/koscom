package day08.thread;

public class ThreadExam2 implements Runnable {
	String name;
	public ThreadExam2(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name+"안녕^^");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
