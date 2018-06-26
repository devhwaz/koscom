package javaexam.lambda.sec05.exam09_minby_maxby;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;

		// price로 비교하여 작은 객체를 리턴한다.
		binaryOperator = BinaryOperator.minBy((f1,f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);

		// price로 비교하여 큰 객체를 리턴한다.
		binaryOperator = BinaryOperator.maxBy((f1,f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println(fruit.name);
	
	}
}