package day07.io;

import java.io.File;


public class FileDir {

	
	public static void main(String[] args) {
		File f = null;
		if(args.length == 0){
			f = new File(".");
		}else{
			f = new File(args[0]);
		}
		
		if(f.isDirectory()){
			String[] fLists = f.list();
			for(int i =0; i<fLists.length; i++)
				System.out.println(fLists[i]);
		}else{
			System.out.println("입력하신 정보는 폴더가 아닙니다. :" + args[0]);
		}
	}
}
