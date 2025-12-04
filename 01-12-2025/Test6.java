
class MyClass {
	public synchronized void method1() {
		try {
			System.out.println("MyClass :: method1");
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void method2() {
		synchronized (this) {
			try {
				System.out.println("MyClass :: method2");
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Test6 {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();

		Thread thread1 = new Thread(() -> myClass.method1(), "T1");
		Thread thread2 = new Thread(() -> myClass.method2(), "T2");

		thread1.start();
		thread2.start();

	}
}
