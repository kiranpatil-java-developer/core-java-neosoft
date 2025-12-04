import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Cclass implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(2000);
		return "Task completed by " + Thread.currentThread().getName();
	}
}

public class Test5 {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();

		Cclass task = new Cclass();

		Future<String> future = executor.submit(task);

		try {
			String result = future.get();
			System.out.println("Result: " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
	}
}
