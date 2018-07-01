package javaexam.designpattern.exam01.singleton;

public class StaticTest2 {
	private static int i;
	private int k;

	// static한 필드 i는 메모리에 객체를 여러개 생성해도
	// 하나만 잡힌다.
	public static void main(String[] args) {
		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();
		s1.i = 1;
		s1.k = 2;
		s2.i = 1;
		s2.k = 2;
		s1.i++;
		s1.k++;
		s2.i++;
		s2.k++;
		System.out.println(s1.i);
		System.out.println(s1.k);
		System.out.println(s2.i);
		System.out.println(s2.k);
		
		StaticTest2.i++;
	}

}
