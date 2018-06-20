package day07.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam5 {

	public static void main(String[] args) throws Exception{
		int bt;
		int count=0;
		FileOutputStream fos = new FileOutputStream("byteFile.txt",false);
		FileInputStream fis = new FileInputStream("src/day07/io/IOExam.java");
		byte[] barr = new byte[512];
		while((bt = fis.read(barr)) != -1) {
			count++;
			fos.write(barr,0,bt);
		}
		System.out.println(count);
		fos.close();
		
	}

}
