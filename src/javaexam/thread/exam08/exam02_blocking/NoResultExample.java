package javaexam.thread.exam08.exam02_blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 01 Example : 작업 처리 결과가 없다.
public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);
		
		System.out.println("[작업처리요청]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("[처리결과] " + sum);
			}
		};
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("[작업처리완료]");
		} catch(Exception e) {
			System.out.println("[실행 예외 발생함] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}
