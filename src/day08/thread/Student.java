package day08.thread;
public class Student extends Thread {
	int type;
	Teacher teacher;

	public Student(int type, Teacher teacher) {
		this.type = type;
		this.teacher = teacher;
	}

	@Override
	public void run() {
		switch (type) {
		case 1:
			teacher.answer1();
			break;
		case 2:
			teacher.answer2();
			break;
		case 3:
			teacher.answer3();
			break;		
		}
	}

}
