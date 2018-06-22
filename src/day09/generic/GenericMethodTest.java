package day09.generic;

public class GenericMethodTest {
	public static <T> GenericBox<T> boxing(T t){
		GenericBox<T> box = new GenericBox<>();
		box.setObject(t);
		return box;
	}
	public static <T> String concat(GenericBox<T> box1, GenericBox<T> box2) {
		return box1.getObject().toString()+""+box2.getObject().toString();
	}
	public static void main(String[] args) {
		GenericBox<String> box1 = new GenericBox<>();
		box1.setObject("hello!!!");
		GenericBox<String> box2 = new GenericBox<>();
		box2.setObject(" hahah");
		
		String result = GenericMethodTest.concat(box1, box2);
		System.out.println(result);
		
		GenericBox<String> box = GenericMethodTest.boxing("hello");
		
		GenericBox<Number> numberBox = new GenericBox<>();
		numberBox.setObject(5);
		Integer intObj =(Integer)numberBox.getObject();
		System.out.println( intObj);
	}

}
