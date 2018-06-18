package interfaceExam;

public class InterfaceTest implements InterfaceA, InterfaceB {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		InterfaceB.super.test();
	}
	
	public static void main(String[] args) {
		InterfaceTest t = new InterfaceTest();
		t.test();
		//t.m1();
		InterfaceB.m1();
		int[] iarr = new int[4];
		iarr[4] = 10;
		System.out.println(iarr[4]);
	}
	



}
