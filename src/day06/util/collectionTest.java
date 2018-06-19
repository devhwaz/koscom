package day06.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class collectionTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		
		System.out.println(list);
	System.out.println("+++++++++++++++++++++++++++++++++++");	
		System.out.println(list.get(0));
	//	list = null;
		for (String string : list) {
			System.out.println(string);
		}
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.remove(0);
		list.remove("c");
		System.out.println("++++++++++++++++++++++++++++");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Vector<String> v = new Vector<>();
		
		
	}

}
