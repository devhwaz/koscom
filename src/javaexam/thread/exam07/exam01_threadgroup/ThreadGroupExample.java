package javaexam.thread.exam07.exam01_threadgroup;

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");

		// 쓰레드에 쓰레드 그룹을 설정했다.
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 메소드에서 list() 를 호출하기 전. ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		// 해당 그룹에 속한 쓰레드 정보를 출력한다.
		mainGroup.list();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("[ myGroup 의 interrupt()메소드를 호출합니다. ]");
		myGroup.interrupt();
	}
}
