package javaexam.thread.exam05.exam05_wait_notify;

// 공유객체
public class DataBox {
	private String data;

	// ConsumerThread가 3번 getData()를 호출
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 getData()메소드를 실행합니다.: " + returnValue);
		data = null;
		notify();
		return returnValue;
	}

	// ProducerThread가 3번 setData()를 호출
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 setData()메소드로 data를 설정합니다.: " + data);
		notify();
	}
}


