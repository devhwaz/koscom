package day09.generic;

public class GenericBox<T> {
	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	public static void main(String[] args) {
		GenericBox<Pen> penBox = new GenericBox<>();
		penBox.setObject(new Pen());
	//	penBox.setObject("hello");
	}
}
