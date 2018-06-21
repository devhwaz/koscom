package day08.thread;

public class SynchronizedTest {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Student kim = new Student(1, teacher);
		Student kang = new Student(2, teacher);
		Student hong = new Student(3, teacher);
		kim.start();
		kang.start();
		hong.start();
	}

}
