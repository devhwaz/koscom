package day08.thread;

public class BoyFriend {

	public static void main(String[] args) {
		GirlFriend friend = new GirlFriend();
		friend.start();
		
		try {
			friend.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("클럽입장!!!");
	}

}
