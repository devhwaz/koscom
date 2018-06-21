package javaexam.thread.exam05.exam02_yield;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();	
		threadA.start();		
		threadB.start();

		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		// threadA에서 yield, threadA는 작업중을 출력하지 않는다.
		threadA.work = false;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		// threadA는 작업중을 출력한다.
		threadA.work = true;
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
