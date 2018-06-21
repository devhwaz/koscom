package javaexam.thread.exam05.exam04_wait_notify;

// 공유객체
public class WorkObject {
	// ThreadA가 계속 호출하는 메소드
	public synchronized void methodA() {
		System.out.println("ThreadA가 methodA() 를 실행합니다.");
		notify();
		try {
			// wait()를 만나면 모니터링락을 풀어서 synchronized로 대기하고 있던 다른쓰레드가 진입이된다.
			wait();
		} catch (InterruptedException e) {
		}
	}

	// ThreadB가 계속 호출하는 메소드
	public synchronized void methodB() {
		System.out.println("ThreadB가 methodB() 를 실행합니다.");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
}
