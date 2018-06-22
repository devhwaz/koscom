package day09.generic;
class Pen{
	String color="red";
}
public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject(new Pen());
		box.setObject("pen");
		Pen pen = (Pen)box.getObject();
		System.out.println(pen.color);
		
		
	}

}
