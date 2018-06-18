package day05.test;

public class DivideByZeroException extends RuntimeException {
	public DivideByZeroException() {
		super("내가 정의한 예외^^");
	}
	public DivideByZeroException(String msg) {
		super(msg);
	}
}
