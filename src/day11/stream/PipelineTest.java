package day11.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PipelineTest {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("강경미",1,20),
			new Member("김태희",1,25),
			new Member("박서준",0,30),
			new Member("강동원",0,35),
			new Member("송혜교",1,32)
		);
		
		Stream<Member> memberStream = list.stream();
//		memberStream.forEach(System.out::println);
		Stream<Member> femaleMemberStream = memberStream.filter(member -> {
			 System.out.println("memberStream::"+member.getName());
			 return member.getSex()==Member.FEMALE; 
		 });
//		femaleMemberStream.forEach(System.out::println);
		IntStream ageStream =	femaleMemberStream.mapToInt(m->m.getAge());
//		femaleMemberStream.mapToInt(Member::getAge);
//		ageStream.forEach(age -> System.out.println(age));
		
		 double avg = list.stream()
		 .filter(member -> {
			 System.out.println("filter::"+member.getName());
			 return member.getSex()==Member.FEMALE; 
		 })
		 .mapToInt(member ->{
			 System.out.println("mapToInt::"+member.getName());			 
			 return member.getAge();		 
		 })
		 .average()
		 .getAsDouble();
		 
		 System.out.println(avg);
		 
		 
		 ageStream.forEach(System.out::println);
	}

}
