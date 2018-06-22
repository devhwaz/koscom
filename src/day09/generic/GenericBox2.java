package day09.generic;

public class GenericBox2<T extends Number> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	public static void main(String[] args) {
		GenericBox2<Integer> intBox = new GenericBox2<>();
		intBox.setObject(new Integer(10));
		intBox.setObject(11);
		int i = intBox.getObject()/*.intValue()*/;
		System.out.println(intBox.getObject().intValue());
		System.out.println(intBox.getObject());
	//	penBox.setObject(new Pen());
	//	penBox.setObject("hello");
	}
}
