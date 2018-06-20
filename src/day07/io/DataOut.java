package day07.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOut {

	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("src/data.out");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChar('ÀÚ');
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		dos.close();
		fos.close();
	}

}
