package javaexam.thread.exam08.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


// 작업 완료 순서로 통보하기
public class CompletionServiceExample extends Thread {
	public static void main(String[] args) {
		ExecutorService  executorService = Executors.newFixedThreadPool(
			Runtime.getRuntime().availableProcessors()
		);

		// 쓰레드 풀에서 작업이 완료된 것만 통보받는 방법이 있는데 CompletionService를
		// 이용하는 것이다.
		// CompletionService를 생성한다.
		CompletionService<Integer> completionService  = 
				new ExecutorCompletionService<Integer>(executorService);
		
		System.out.println("[작업 처리 요청]");
		for(int i=0; i<3; i++) {
			completionService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=1; i<=10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		
		System.out.println("[처리 완료된 작업 확인]");
		executorService.submit(new Runnable() { // 쓰레드 풀의 쓰레드에서 실행하도록 함.
			@Override
			public void run() {
				while(true) {
					try {
						Future<Integer> future = completionService.take(); // 완료된 작업 가져오기
						int value = future.get();
						System.out.println("[처리 결과] " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});

		// 3초후 쓰레드를 종료.
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		executorService.shutdownNow();
	}
}
