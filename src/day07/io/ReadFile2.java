package day07.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile2 {

	public static void main(String[] args) throws IOException{
		FileReader fw = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fw);
		String  s = null;
		while((s = br.readLine()) != null){
			System.out.println(s);
		}
		br.close();
		fw.close();
	}

}
