package day11.stream;

import java.util.Arrays;

public class AggregateTest {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1,2,3,4,5,6})
				.filter(n -> n%2==0)
				.count();
		System.out.println("배열의 요소 수:"+count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5,6})
				.filter(n -> n%2==0)
				.sum();
		System.out.println("배열의 합계:"+sum);
		
		int min = Arrays.stream(new int[] {1,2,3,4,5,6})
				.filter(n -> n%2==0)
				.min()
				.getAsInt();
		System.out.println("배열의 최소값:"+min);
		
		double avg = Arrays.stream(new int[] {1,2,3,4,5,6})
				.filter(n -> n%2==0)
				.average()
				.getAsDouble();
		System.out.println("배열의 최소값:"+min);
	}
}
