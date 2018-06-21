package day08.thread;

public class GirlFriend extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("클럽으로 뛰어감!!");
		}
	}
}
