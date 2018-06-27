package day11.stream;

import java.util.Arrays;
import java.util.List;

public class FilterTest {

	public static void main(String[] args) {
		List<String> names = 
				Arrays.asList("강경미","전지현","고소영","송혜교","장동건","강동원","강경미");
		names.stream()
		.distinct()
		.filter(name->name.startsWith("강"))
		.forEach(System.out::println);
	}

}
