package day11.stream;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class OptionalTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
	/*	double avg = list.stream()
		.mapToInt(Integer::intValue)
		.average()
		.getAsDouble();*/
		
		
		OptionalDouble optionalAvg = list.stream()
		.mapToInt(Integer::intValue)
		.average();
		
		if(optionalAvg.isPresent())
			System.out.println("평균1 :"+optionalAvg.getAsDouble());
		else
			System.out.println("평균1 : "+0.0);
		
		double avg = list.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
		System.out.println("평균2 : "+ avg);
		
		list.stream()
		.mapToInt(Integer::intValue)
		.average()
		.ifPresent(a ->System.out.println("평균3 : "+ avg));
				
	}

}
