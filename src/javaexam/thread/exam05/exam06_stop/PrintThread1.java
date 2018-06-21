package javaexam.thread.exam05.exam06_stop;

public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
	  this.stop = stop;
	}
	
	public void run() {	
		while(!stop) {
			System.out.println("PrintThread1실행중입니다.");
		}	
		System.out.println("PrintTrhead1종료합니다.");
	}
}

