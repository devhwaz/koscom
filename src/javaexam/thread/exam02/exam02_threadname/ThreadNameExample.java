package javaexam.thread.exam02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("메인쓰레드 이름 : : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ThreadA 이름 : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("ThreadB 이름 : " + threadB.getName());
		threadB.start();
	}
}
