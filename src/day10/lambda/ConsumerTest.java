package day10.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<Integer> consumerTest = a -> System.out.println(a);
		consumerTest.accept(10);
		
		BiConsumer<String, String> biConsumber = (a,b)->System.out.println(a+","+b);
		biConsumber.accept("tset", "java");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("java"+d);
		doubleConsumer.accept(1.8);
		
	}

}
