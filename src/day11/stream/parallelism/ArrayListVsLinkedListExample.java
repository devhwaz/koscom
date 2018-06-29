package day11.stream.parallelism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {
	//요소 처리
	public static void work(int value) {
	}
	
	//병렬 처리
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a)-> work(a));
		long end = System.nanoTime();
	    long runTime = end - start;
	    return runTime;
	}
	//병렬 처리
		public static long testParallel(int[] iarr) {
			long start = System.nanoTime();
			Arrays.stream(iarr).parallel().forEach((a)-> work(a));
			long end = System.nanoTime();
		    long runTime = end - start;
		    return runTime;
		}
	
	public static void main(String... args) {
		//소스 컬렉션
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		int[] iarr = new int[1000000];
		for(int i=0; i<1000000; i++) {
			arrayList.add(i);
			linkedList.add(i);
			iarr[i]=i;
		}
		
		//워밍업
		long arrayListListParallel = testParallel(arrayList);
		long linkedListParallel = testParallel(linkedList);
		long iarrParallel = testParallel(iarr);
		
		//병렬 스트림 처리 시간 구하기
		arrayListListParallel = testParallel(arrayList);
		linkedListParallel = testParallel(linkedList);
		iarrParallel = testParallel(iarr);
		System.out.println("arrayListListParallel::"+arrayListListParallel);
		System.out.println("linkedListParallel::"+linkedListParallel);
		System.out.println("iarrParallel::"+iarrParallel);
		
		if(arrayListListParallel < linkedListParallel) {
			System.out.println("성능 테스트 결과: ArrayList 처리가 더빠름");
		} else {
			System.out.println("성능 테스트 결과: LinkedList 처리가 더빠름");
		}
	}
}
