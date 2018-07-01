package javaexam.designpattern.exam01.singleton;

public class MyObject {
	private static MyObject instance = new MyObject();

	private MyObject() {
	}

	public static MyObject getInstance() {
		return instance;
	}

	public static void main(String args[]) {
		MyObject obj1 = MyObject.getInstance();
		MyObject obj2 = MyObject.getInstance();
		if (obj1 == obj2)
			System.out.println("obj1 == obj2");
		else
			System.out.println("obj1 != obj2");

	}

}
