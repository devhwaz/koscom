package day07.io;

import java.io.File;

public class ChangeDir {

	
	public static void main(String[] args) {
		System.out.println("Current Dir - " +System.getProperty("user.dir"));
		File dir1 = new File(".");
		String[] files = dir1.list();
		
		System.out.println("Files and Directories In current Dir -");
		for(int i =0; i<files.length; i++)
			System.out.println(files[i]);
		
		System.setProperty("user.dir","c:/java");
		System.out.println("Changed Dir -"+System.getProperty("user.dir"));
		File dir2 = new File(System.getProperty("user.dir"));
		if(dir2.exists()){
			String[] files1 = dir2.list();
			
			System.out.println("Files and Directories In Changed Dir -");
			for(int i = 0; i<files1.length; i++)
				System.out.println(files1[i]);
			System.out.println("Changed Dir - "+dir2.getAbsolutePath());
		}
	}

}
