package javaexam.designpattern.exam01.singleton;

public class StaticTest3 {
	public static void main(String[] args) throws Exception{
		Class.forName("javaexam.designpattern.exam01.singleton.MyDriver");
		StringBuffer sb = DriverManager.getMessage();
		System.out.println(sb.toString());
	}
}

class MyDriver{
	static{
		DriverManager.setDriverName("myDriver");
		System.out.println("static block!!");
	}
	public MyDriver(){
		System.out.println("MyDriver생성자");
	}
}

class DriverManager{
	private static String driverName = null;
	public static void setDriverName(String driverName){
		DriverManager.driverName = driverName;
	}
	public static StringBuffer getMessage(){
		StringBuffer sb = new StringBuffer();
		sb.append(DriverManager.driverName);
		sb.append("!!!");
		return sb;
	}
}