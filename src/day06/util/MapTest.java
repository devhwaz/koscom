package day06.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		map.put("kang", new Student("강경미",100));
		map.put("kang2", new Student("강경미",100));
		map.put("kang3", new Student("강경미",100));
		map.put("kang4", new Student("강경미",100));
		
		System.out.println(map);
		System.out.println(map.get("kang"));
		
		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println(map.get(key));
		}
		System.out.println(map.containsKey("kang"));
	}

}
