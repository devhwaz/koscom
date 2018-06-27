package day10.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

class Car{
	String name;
	String speed;
	Car(){
		
	}
	Car(String name){
		this.name = name;
	}
	Car(String name, String speed){
		this.name=name;
		this.speed=speed;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +","+speed;
	}
}
public class ConstructTest {

	public static void main(String[] args) {
		Function<String, Car> function = (name) -> new Car(name);
		Car car = function.apply("tico");
		System.out.println(car.name);
		
		Function<String, Car> function2;
		function2 = Car :: new;
		Car car2 = function.apply("test");
		System.out.println(car2.name);
		
		BiFunction<String, String, Car> bfunction = Car :: new;
		Car car3 = bfunction.apply("그랜져", "300");
		System.out.println(car3);
		
		
	}

}
