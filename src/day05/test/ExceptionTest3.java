package day05.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest3 {
	public static void m1() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("test");
	}
	public static void m2(boolean flag) throws Exception{
		if(flag)
			throw new Exception();
	}
	public static void m3(boolean flag) {
		if(flag)
			throw new DivideByZeroException("예외메시지~~~");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
