package javaexam.thread.exam08.exam01_execute_submit;

// JDK 5 부터 java.util.concurrent 패키지가 추가되었다. 쓰레드가 강화되었다.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		// 하나의 작업은 Runnable을 구현하거나 Callable을 구현하거나 해서 표현한다.
		// 작업이 완료된 후 리턴값이 있을 경우 Callable을 사용한다.
		for(int i=0; i<10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("pool size: " + poolSize + "] thread name: " + threadName);
				}
			};

			// 쓰레드 풀이 2개니깐 동시에 실행할 수 있는 쓰레드는 2개다.
			// 한쓰레드가 종료되야 쓰레드풀을 사용한다.
			// exeucte() : Runnable을 작업큐에 저장. 작업 처리 결과를 받지 못한다.
			executorService.execute(runnable);
			// submit() : Runnable or Callable을 작업큐에 저장, 리턴된 Future를 통해 작업 처리 결과를 얻을 수 있다.
			//executorService.submit(runnable);
			
			Thread.sleep(10);
		}

		// 쓰레드 풀을 다 사용하면 shutdown()메소드를 호출한다.
		executorService.shutdown();
	}
}
