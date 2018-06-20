package day07.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class DataIn {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("src/data.out");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println("\n\r");
		System.out.println(dis.readFloat());
		System.out.print("\n");
		System.out.println(dis.readLong());
		System.out.print("\r");
		System.out.println(dis.readShort());
	}

}
