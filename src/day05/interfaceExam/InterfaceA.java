package day05.interfaceExam;

public interface InterfaceA {
	default void test() {
		System.out.println("test");
	}
}
