package day11.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) throws Exception{
		String[] strArr = {"강경미", "국경훈", "임정표", "이상준", "강경미", "국경훈", "임정표", "이상준"};
		
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(a -> System.out.println(a));
		
		int[] iarr = {3,1,5,6,2,8};
		IntStream intStream = Arrays.stream(iarr);
		intStream.forEach(a -> System.out.println(a));
		System.out.println("========================");
		Path path = Paths.get("src/");
		Stream<Path> stream = Files.list(path);
		stream.forEach( p -> System.out.println(p.getFileName()) );
		stream.close();
		System.out.println("==============");
		Path path2 = Paths.get("src/day11/stream/streamTest.java");
		Stream<String> stream2 = Files.lines(path2);
		stream2.forEach( p -> System.out.println(p) );
//		stream2.forEach(System.out::println);
		stream2.close();
		
	}

}
