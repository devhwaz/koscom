package day11.stream;

public class Member {
	public static final int MALE=0;
	public static final int FEMALE=1;
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex=sex;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
