import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Repository {

	private volatile static Repository instance;

	private Repository() {
	}

	public static Repository getInstance() {

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		if (instance == null) {
			synchronized (Repository.class) {
				if (instance == null) {
					instance = new Repository();
				}
			}
		}

		return instance;
	}
}

public class SingletonDesignPattern2 {
	public static void main(String[] args) {

		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());

		executor.submit(() -> System.out.println(Repository.getInstance().hashCode()));
		executor.submit(() -> System.out.println(Repository.getInstance().hashCode()));
		executor.submit(() -> System.out.println(Repository.getInstance().hashCode()));
		executor.submit(() -> System.out.println(Repository.getInstance().hashCode()));
		executor.submit(() -> System.out.println(Repository.getInstance().hashCode()));

		executor.shutdown();
		executor.close();
	}
}
