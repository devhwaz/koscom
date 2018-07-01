package javaexam.designpattern.exam01.singleton;

// static 한 블럭은 한번만 실행된다.
public class StaticTest1 {
	static{
		System.out.println("static block");
	}
	public StaticTest1(){
		System.out.println("생성자");
	}

	public static void print(){
		System.out.println("hello!!");
	}
	
	public static void main(String[] args) {
		StaticTest1 st1 = new StaticTest1();
		StaticTest1 st2 = new StaticTest1();
		System.out.println("start");
		print();
		System.out.println("end");
	}
}
