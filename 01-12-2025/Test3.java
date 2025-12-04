class User extends Thread {

	private Integer numbers = 0;

	@Override
	public void run() {

		try {

			for (int i = 0; i < 5; i++) {
				Thread.sleep(2000);
				System.out.println("After increment: " + numbers);
				numbers++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("----------------");
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("----------------");
			System.out.println("e.getLocalizedMessage(): " + e.getLocalizedMessage());
		}
	}
}

public class Test3 {
	public static void main(String[] args) {

		User user = new User();
		user.interrupt();
		user.start();

	}
}
