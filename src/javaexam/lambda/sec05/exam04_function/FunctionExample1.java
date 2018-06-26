package javaexam.lambda.sec05.exam04_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("신용권", 95, 93)
	);
	

	// Function은 파라미터를 받아들여 어떤 작업을 수행한 후 결과를 리턴하는
	// R apply(T t); 메소드를 가진다.
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			//  t -> t.getName() 를 파라미터로 전달할 경우에는 student를 파라미터로 받아들여
			// student가 가지고 있는 getname()메소드의 결과를 반환한다.
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			// t -> t.getEnglishScore() 는 student의 getEnglishScore()메소드의 결과를 반환한다.
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Function<Student, String> f = t -> t.getName();
		System.out.println(f.apply(new Student("kang", 100, 100)));
		
//		list.add(new Student("kang", 100, 100));
		System.out.println("[학생 이름]");
		printString( t -> t.getName() );
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() );
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
	}
}
