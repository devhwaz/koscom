package day05.test;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int[] iarr = new int[4];
		System.out.println("test");
		try {
		iarr[4] = 10;
		System.out.println(iarr[4]);
		} catch (ClassCastException e) {
			// TODO: handle exception
		}
		System.out.println("end!!");
	}

}
