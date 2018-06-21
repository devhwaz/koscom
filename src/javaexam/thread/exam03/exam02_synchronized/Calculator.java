package javaexam.thread.exam03.exam02_synchronized;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 공유객체를 쓰레드가 이용할 때, 다른 쓰레드는 대기한다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
}

