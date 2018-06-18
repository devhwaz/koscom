package interfaceExam;

public interface InterfaceB {
	default void test() {
		System.out.println("tettt");
	}
	
	static void m1() {
		System.out.println("static");
	}
}
