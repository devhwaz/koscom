package day07.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class IOExam3 {

	public static void main(String[] args) {
		URL url;
		InputStreamReader isr = null;
		try {
			url = new URL("https://docs.oracle.com/javase/8/docs/api/");
			isr = new InputStreamReader(url.openStream());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		BufferedReader br = null;	
		FileOutputStream fos = null;
		PrintWriter pw = null;
		try {
			fos = new FileOutputStream("exam3output.txt");
			pw = new PrintWriter(fos);
			br = new BufferedReader(isr);
			
			System.out.println("입력하세요^^");
			String msg=null;
			while((msg=br.readLine()) != null) {
				System.out.println(msg);
				pw.println(msg);
			}
			pw.flush();
			System.out.println("종료!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				pw.close();
				isr.close();
				br.close();
				fos.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}

}
