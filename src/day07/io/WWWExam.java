package day07.io;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


public class WWWExam {


	public static void main(String[] args) throws Exception{
		URL u = new URL("http://www.naver.com/");
		InputStream is = u.openStream();
		BufferedReader br = null;
		try{
			ArrayList<String> list = new ArrayList<>();
			br = new BufferedReader(new InputStreamReader(is));
			String line = null;
			System.out.println("web으로 부터 읽어들인 모든 데이터 ----------------------");
			while((line = br.readLine()) != null){
				list.add(line);
				System.out.println(line);
			}
			System.out.println("-------------------------------------------------");
			for(int i = 4; i >= 0; i--){
				try{
					System.out.println(list.get(i));
				}catch(Exception ex){
					System.out.println("html 소스가 5줄이 안되네요.");
				}
			}
			System.out.println("-------------------------------------------------");
			for(int i = 0; i < list.size(); i++){
				String tmp = (String)list.get(i);
				for(int k = tmp.length() -1; k >= 0; k--){
					System.out.print(tmp.charAt(k));
				}
				System.out.println();
			}
		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(Exception ex){}
			}
		} // finally
		
	} // main

}
