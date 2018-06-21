package javaexam.thread.exam04.exam01_state;

public class StatePrintThread extends Thread {	
	private Thread targetThread;

	// 설정된 targetThread는 실행이 되지 않는 상태다.
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			// Thread를 생성하고 아직 실행이 안되었다면 NEW상태다.
			// while문을 반복할 경우에는 RUNNABLE상태가 된다.
			Thread.State state = targetThread.getState();
			System.out.println("ThreadState : " + state);
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5초 sleep
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}

