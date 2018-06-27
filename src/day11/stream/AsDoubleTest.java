package day11.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleTest {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,10,7,9,6};
		
		IntStream intStream = Arrays.stream(intArr);
		intStream.asDoubleStream()
		.boxed()
		.sorted()
		.forEach(data->System.out.println(data.doubleValue()));
		
		int sum = Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
//		.forEach(System.out::println);
		.peek(i -> i++)
		.sum();
	}

}
