package day11.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("강경미", "국경훈", "임정표", "이상준", "강경미", "국경훈", "임정표", "이상준");

		/*
		 * Iterator<String> iter = list.iterator(); while (iter.hasNext()) { String name
		 * = iter.next(); System.out.println(name); }
		 * 
		 * Stream<String> stream = list.stream(); stream.forEach(name ->
		 * System.out.println(name));
		 */
		// 순차 처리
		Stream<String> stream3 = list.stream();
		stream3.forEach(StreamTest::print);

		System.out.println();

		// 병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(StreamTest::print);
	}

	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
