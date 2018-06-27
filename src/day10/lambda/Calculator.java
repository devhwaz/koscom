package day10.lambda;

import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

public class Calculator {
	public static int add(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return  x-y;
	}
	
	public static void main(String[] args) {
		IntBinaryOperator operator;
		operator = (x,y)->Calculator.add(x, y);
		System.out.println(operator.applyAsInt(4, 5));
		operator = Calculator :: add;
		System.out.println(operator.applyAsInt(4, 5));
		
		Calculator cal = new Calculator();
		operator = (x,y)->cal.minus(x, y);
		System.out.println(operator.applyAsInt(10, 3));
		
		operator = cal :: minus;
		System.out.println(operator.applyAsInt(10, 3));
		
		ToIntBiFunction<String, String> function;
		
		function = (a,b) -> a.compareToIgnoreCase(b);
		System.out.println(function.applyAsInt("test", "TeST"));
		function = String :: compareToIgnoreCase;
		System.out.println(function.applyAsInt("test", "ggg"));
	}
}
