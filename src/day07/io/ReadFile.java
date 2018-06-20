package day07.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		int n;
		FileInputStream fis = new FileInputStream("src/input.txt");

		while ((n = fis.available()) > 0) {
//			System.out.println(n);
//			byte[] b = new byte[n];
//			int result = fis.read(b);
			int result = fis.read();
//			if (result == -1)
//				break;
			System.out.print((char)result);
//			String s = new String(b);
//			System.out.println(s);
		}

		byte[] b = new byte[512];
		FileOutputStream fw = new FileOutputStream("read.txt");
		while ((n = fis.read(b)) != -1) {
			String s = new String(b);
			fw.write(b);
			System.out.println(s);
		}

	}

}
