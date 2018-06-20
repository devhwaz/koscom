package day07.io;

import java.io.FileOutputStream;

public class IOExam04 {

	public static void main(String[] args) throws Exception{
		int bt;
		FileOutputStream fos = new FileOutputStream("byteFile.txt");
		while((bt = System.in.read()) != -1) {
			System.out.print((char)bt);
			fos.write(bt);
		}
		fos.close();
		
	}

}
