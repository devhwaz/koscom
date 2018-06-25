package javaexam.lambda.sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> { 
			System.out.println("consumerA: " + m.getName()); 
		};
		
		Consumer<Member> consumerB = (m) -> { 
			System.out.println("consumerB: " + m.getId()); 
		};

		// consumerA를 처리하고나서 consumerB를 처리하는 consumerAB가 생성
		// Consumer는  default Consumer<T> andThen(Consumer<? super T> after) 메소드를 가진다.
		Consumer<Member> consumerAB = consumerA.andThen(consumerB); // consumerA다음에 consumerB가 사용되도록 설정

		// 먼저 consumerA의 accept가 호출이 된후, 연이어서 consumerB의 accept메소드가 호출된다.
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}
