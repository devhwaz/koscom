package day10.lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<String> s = () -> "test";
		System.out.println(s.get());
		
		IntSupplier intS = ()-> (int)(Math.random()*6)+1;
		System.out.println(intS.getAsInt());
	}

}
