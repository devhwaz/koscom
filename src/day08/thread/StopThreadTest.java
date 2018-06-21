package day08.thread;

public class StopThreadTest {

	public static void main(String[] args) {
		StopThread st = new StopThread();
		st.start();
		
		try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		
		//st.setStopflag(true);
		System.out.println("interrupt 메소드 실행!!");
		st.interrupt();
		System.out.println("main 종료!!");
	}

}
