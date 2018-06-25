package day10.lambda;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		fi = new MyFunctionalInterface() {
			
			@Override
			public void method() {
				System.out.println("method call!!!");
			}

//			@Override
//			public void method2() {
//				// TODO Auto-generated method stub
//				
//			}
		};
		
		fi.method();
		
		fi = () -> { System.out.println("method call~~~!!");};
		fi.method();
		
		fi = () -> System.out.println("method call~");
		fi.method();
	}

}
