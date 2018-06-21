package javaexam.thread.exam06.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		// main메소드가 종료되면, 해당 쓰레드도 종료된다.
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("main메소드 종료합니다.");
	}
}
