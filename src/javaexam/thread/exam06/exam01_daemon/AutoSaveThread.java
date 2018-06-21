package javaexam.thread.exam06.exam01_daemon;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("save메소드 실행!");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
