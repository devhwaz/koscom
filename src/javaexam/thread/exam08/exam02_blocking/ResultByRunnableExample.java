package javaexam.thread.exam08.exam02_blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 2. 작업 처리 결과를 외부 객체에 저장
public class ResultByRunnableExample {
	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업 처리 요청]");
		class Task implements Runnable {
			Result result;
			Task(Result result) { 
				this.result = result;
			} // 외부 객체를 생성자로 부터 받아서 필드에 저장한다.
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				result.addValue(sum); // 외부 객체에 결과 값을 저장한다.
			}
		}
		
		Result result = new Result();
		Runnable task = new Task(result);
		Future<Result> future1 = executorService.submit(task, result); // 외부객체를 파라미터로 전달하여 실행한다.

		try {
			result = future1.get();
			System.out.println("[처리결과] " + result.accumValue);
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}

class Result { 
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
