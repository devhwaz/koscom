package day07.io;

import java.io.IOException;


public class Echo {

	public static void main(String[] args) {
		int bt;
		int cnt = 0;
		try{//표준입력을 받는다.
			while((bt=System.in.read()) != -1){
				cnt++;
				//입력받은 내용을 표준 출력한다.
				System.out.print((char)bt);
			}
		}catch(IOException e){
			System.err.println(e);
		}
		System.out.println();
		System.out.println("total bytes :"+cnt);
	}

}
