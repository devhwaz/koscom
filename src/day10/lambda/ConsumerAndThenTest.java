package day10.lambda;

import java.util.function.Consumer;

public class ConsumerAndThenTest {

	public static void main(String[] args) {
		Consumer<String> conA = (a) -> System.out.println(a+"aaa");
		Consumer<String> conB = (a) -> System.out.println(a+"bbb");
		Consumer<String> conAB = conA.andThen(conB);
		conAB.accept("hello!!");
	}

}
