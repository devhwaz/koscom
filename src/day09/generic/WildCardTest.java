package day09.generic;
class Car{
	public String toString() {
		return "자동차";		
	}
}
class Bus extends Car{
	public String toString() {
		return "버스";			
	}
}
class DoubleDeckBus extends Bus{
	public String toString() {
		return "이층버스";
	}
}
public class WildCardTest {
	public static void print(GenericBox<? super Bus> box) {
		System.out.println(box.getObject());
	}
	public static void main(String[] args) {
		GenericBox<Car> carBox = new GenericBox<>();
		carBox.setObject(new Car());
		
		GenericBox<Bus> busBox = new GenericBox<>();
		busBox.setObject(new Bus());
		
		GenericBox<DoubleDeckBus> doubleDeckBusBox = new GenericBox<>();
		doubleDeckBusBox.setObject(new DoubleDeckBus());
		WildCardTest.print(carBox);
		WildCardTest.print(busBox);
//		WildCardTest.print(doubleDeckBusBox);
	}

}
