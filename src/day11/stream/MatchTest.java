package day11.stream;

import java.util.Arrays;

public class MatchTest {

	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		
		boolean result;
				result = Arrays.stream(intArr)
				.allMatch(a -> a%3 == 0);
		
		System.out.println("모두 3의 배수입니까?? "+result);
		
		result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		
		System.out.println("하나라도 3의 배수입니까?? "+result);
		result = Arrays.stream(intArr)
				.noneMatch(a -> a%5 == 0);
		
		System.out.println("하나라도 3의 배수입니까?? "+result);
	}

}
