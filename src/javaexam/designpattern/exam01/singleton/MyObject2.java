package javaexam.designpattern.exam01.singleton;

public class MyObject2 {
	private static MyObject2 instance[]; 
	static{
		instance = new MyObject2[3];
		instance[0] = new MyObject2();
		instance[1] = new MyObject2();
		instance[2] = new MyObject2();
	}
	
	private MyObject2(){} 
	
	public static MyObject2 getInstance(int index){
		return instance[index];
	}
	

	public static void main(String args[]){
		MyObject2 obj1 = MyObject2.getInstance(1);
		MyObject2 obj2 = MyObject2.getInstance(2);
		if(obj1 == obj2)
			System.out.println("obj1 == obj2");
		else
			System.out.println("obj1 != obj2");
	
	}
	

}
