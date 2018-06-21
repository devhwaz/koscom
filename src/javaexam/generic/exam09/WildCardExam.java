package javaexam.generic.exam09;

import java.util.*;

public class WildCardExam {
	// <T>로 선언하는 것과 달리 ?로 선언했을 때는 제한이 있음 : 
	// 좁은 의미로 사용, 데이터보다 메서드
	public static void size(List<?> list) {
		System.out.println(list.size());
	}
	
	public static void size2(List<String> list) {
		System.out.println(list.size());
		String str = list.get(0);
		System.out.println(str);
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		size(list);
		WildCardExam.<String>size2(list);
	}
}
