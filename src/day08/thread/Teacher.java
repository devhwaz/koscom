package day08.thread;

public class Teacher {
	public void answer1() {		
		for(int i = 0; i < 10; i++){
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("질문1에 대답해준다.");
		}
	}
	public void answer3(){
		for(int i = 0; i < 10; i++){
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("질문3에 대답해준다.");
		}
	}
	public synchronized void answer2(){
		for(int i = 0; i < 10; i++){
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("질문2에 대답해준다.");
		}
	}
}
