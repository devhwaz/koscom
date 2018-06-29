package day11.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceTest {

	public static void main(String[] args) {
		int sum = Arrays.stream(new int[5] )
				.sum();
		
		System.out.println(sum);
		
		List<Member> memberList = Arrays.asList(
				new Member("kang",100),
				new Member("kim", 90),
				new Member("hong",98)
				);  /*new ArrayList<>();*/
		int sum2 = memberList.stream()
				.mapToInt(Member::getScore)
				.sum();
		System.out.println(sum2);
		
		
		int sum3 = memberList.stream()
				.mapToInt(Member::getScore)
				.reduce((a,b)->a+b)
				.getAsInt();
		System.out.println(sum3);
		
		int sum4 = memberList.stream()
				.mapToInt(Member::getScore)
				.reduce(0,(a,b)->a+b);
		System.out.println(sum4);
				
				
	}

}
