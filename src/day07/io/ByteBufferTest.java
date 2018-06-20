package day07.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteBufferTest {

	public static void main(String[] args) {
		int i = 0;
		byte[] buf = new byte[256];
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		if(args.length < 2){
			System.out.println("»ç¿ë¹ý : java ByteBufferTest [Source] [Destination]");
			System.exit(1);
		}
		try{
			FileInputStream fin = new FileInputStream(new File(args[0]));
			FileOutputStream fout = new FileOutputStream(args[1]);
			
			in = new BufferedInputStream(fin);
			
			out = new BufferedOutputStream(fout);
		}catch(FileNotFoundException e){}
		try{
			while((i=in.read(buf))!= -1) out.write(buf);
			
		}catch(IOException e){}
		finally{
			try{
				in.close();
				out.close();
			}catch(IOException e){}		
		}
	}

}
