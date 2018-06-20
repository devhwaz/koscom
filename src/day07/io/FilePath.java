package day07.io;

import java.io.File;
import java.io.IOException;

public class FilePath {

	public static void main(String[] args) throws IOException{
		if(args.length < 1){
			System.out.println("Usage  - java FilePath filename");;
			System.exit(1);
		}
		File file = new File(args[0]);
		if(file.exists()){
			System.out.println(file.getPath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());
			
		}
	}

}
