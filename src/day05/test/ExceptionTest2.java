package day05.test;

public class ExceptionTest2 {
	public static void main(String[] args) {

		int a = 0;
		double b;
		try {
			b = 100 / a;
			System.out.println("Some more codes in try block");
		} catch (ArithmeticException e) {
			System.out.println("Exception occurred : " + e);
			e.printStackTrace();
		} catch (Exception e2) {
			System.out.println("One more catch block");
		} finally {
			System.out.println("Some more codes in finally block");
		}
		System.out.println("end!!!");
	}
}
