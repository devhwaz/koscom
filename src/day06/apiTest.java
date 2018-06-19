package day06;

public class apiTest {

	public static void main(String[] args) {
		String str = new String("hello");
	//	str.intern();
		String str2 = "hello";
		System.out.println(str);
		System.out.println(str == str2);
		System.out.println(str2 == str.intern());
	}

}
