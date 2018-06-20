package day07.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExam {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("입력하세요^^");
			String msg=null;
			while((msg=br.readLine()) != null) {
				System.out.println(msg);
			}
			System.out.println("종료!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
