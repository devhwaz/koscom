package day11.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 test","lambda stream");
		list.stream()
		.flatMap(s -> Arrays.stream(s.split(" ")))
		.forEach(System.out::println);
		
		List<String> list2 = Arrays.asList("1, 2,3, 4,5,6,7,8");
		list2.stream()
		.flatMapToInt(data ->{
			String[] strArr = data.split(",");
			int[] intarr = new int[strArr.length];
			for(int i=0; i< strArr.length; i++) {
				intarr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intarr);
		})
		.forEach(System.out::println);
	}

}
