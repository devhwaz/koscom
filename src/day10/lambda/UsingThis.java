package day10.lambda;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		
		void method() {
			final int i=30;
			MyFunctionalInterface fi = ()->{
				System.out.println("outterField: "+ outterField);
				System.out.println(UsingThis.this.outterField);
				
				System.out.println("innterField: "+ innerField);
				System.out.println(this.innerField);
				innerField++;
				System.out.println(i);
			};
			fi.method();
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}
