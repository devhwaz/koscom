package day06.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student{
	String name;
	int score;
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	
}
public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("a");
		System.out.println(set);
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student("강경미",100));
		studentSet.add(new Student("둘리",100));
		studentSet.add(new Student("고길동",100));
		studentSet.add(new Student("강경미",100));
		studentSet.add(new Student("둘리",100));
		System.out.println(studentSet);
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (Student student : studentSet) {
			System.out.println(student);
		}
		
		System.out.println(set.contains("a"));
		System.out.println(set.contains("g"));
		Student student = new Student("강경미", 100);
		System.out.println(studentSet.contains(student));
		
	}

}
