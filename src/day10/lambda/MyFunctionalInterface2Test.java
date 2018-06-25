package day10.lambda;

public class MyFunctionalInterface2Test {

	public static void main(String[] args) {
		MyFunctionalInterface2 fi2;
		
		fi2 = new MyFunctionalInterface2() {
			
			@Override
			public void method(int x) {
				int result = x * 5;
				System.out.println(result);
			}
		};
		fi2.method(5);
		
		fi2 = (int x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi2.method(5);
		fi2 = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi2.method(5);
		
		fi2 = x -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi2.method(5);
		fi2 = x -> System.out.println(x * 5);
		fi2.method(5);
	}

}
