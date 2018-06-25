package day10.lambda;

public class MyFunctionalInterface3Test {

	public static void main(String[] args) {
		MyFunctionalInterface3 fi3;
		
		fi3 = new MyFunctionalInterface3() {
			
			@Override
			public int method(int x, int y) {
				return x+y;
			}
		};
		System.out.println(fi3.method(3, 4));
		
		fi3 = (x,y)->{return x+y;};
		fi3.method(3, 4);
		fi3 = (x,y)->x+y;
		fi3.method(3, 4);
		fi3 = (x,y) -> sum(x,y);
		fi3.method(3, 4);
		
		
	}
	public static int sum(int x, int y) {
		return (x+y);
	}

}
