package javaexam.lambda.sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	// IntBinaryOperator는 int applyAsInt(int left, int right); 메소드를 가진다.
	// 2개의 정수값을 받아들여 그 결과를 반환한다.
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		// 2개의 변수를 받아들여 결과를 리턴하는 람다식을 인자로 전달하고 있다.
		int max = maxOrMin(
			(a, b) -> {
				if(a>=b) return a;
				else return b;
			}
		);
		System.out.println("최대값: " + max);
		
		//최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
	}
}
