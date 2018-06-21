package javaexam.thread.exam05.exam06_stop;

public class PrintThread2 extends Thread {
	public void run() {	
		//how1
		/*try {
			while(true) {
				System.out.println("PrintThread2실행중입니다.");
				Thread.sleep(1);
			}	
		} catch(InterruptedException e) {		
		}*/
		
		//how2
		while(true) {
			System.out.println("PrintThread2실행중입니다.");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("PrintThread2 종료");
	}
}

