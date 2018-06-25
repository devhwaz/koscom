package javaexam.lambda.sec05.exam07_andthen_compose;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		// 2개의 펑션을 연결한다. 펑션은 파라미터를 받아서 그 결과를 리턴한다.
		functionAB = functionA.andThen(functionB);
		// functionAB의 apply에 Member를 넣어준면 functionA가 호출되면서 그 결과를 반환한다. (Address를 반환)
		// 반환된 값은 functionB의 파라미터로 전달되고 그 결과를 반환한다. (City를 반환)
		city = functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);


		// Function은 compose메소드를 가진다. compose와 andThen은 처리하는 순서가 다르다.
		// default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
		// 이번에는 compose()를 살펴보도록 하겠습니다. 인터페이스AB가 method()를 호출하면
		// 우선 functionA부터 처리하고 결과를 functionB의 매개값으로 제공합니다.
		// functionB는는 제공받은 매개값을 가지고 처리한 후 최종 결과를 리턴합니다.
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
	}
}
