package day09.generic;

public class BoxRawTest {

	public static void main(String[] args) {
		GenericBox gbox = new GenericBox<>();
		
		gbox.setObject("hello");
		
		GenericBox<Integer> gbox2 = gbox;
		Integer intobj = gbox2.getObject();
		System.out.println(intobj);
	}

}
