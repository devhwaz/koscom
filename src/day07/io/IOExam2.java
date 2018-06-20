package day07.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam2 {

	public static void main(String[] args) {
	//	InputStreamReader isr = new InputStreamReader(System.in);
		FileReader isr = null; 
		BufferedReader br = null;		
			
		try {
			isr = new FileReader("src/day07/io/IOExam.java");
			br = new BufferedReader(isr);
			
			System.out.println("입력하세요^^");
			String msg=null;
			while((msg=br.readLine()) != null) {
				System.out.println(msg);
			}
			System.out.println("종료!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				isr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}

}
