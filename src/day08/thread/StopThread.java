package day08.thread;

public class StopThread extends Thread {
	private boolean stopflag;

	public void setStopflag(boolean stopflag) {
		this.stopflag = stopflag;
	}

	@Override
	public void run() {
		while (!stopflag) {
			if (Thread.interrupted()) {
				break;
			}
			System.out.println("myThread 실행중!!!! ");
		}
		System.out.println("myThread 종료!!!");
	}

}
