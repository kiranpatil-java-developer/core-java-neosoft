import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ControlCloning implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning is prohibited");
	}

}

class Connection extends ControlCloning {

	private volatile static Connection instance;

	private Connection() {
		if (instance != null) {
			throw new RuntimeException("Reflection not allowed");
		}
	}

	public static Connection getInstance() {

		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		if (instance == null) {
			synchronized (Connection.class) {
				if (instance == null) {
					instance = new Connection();
				}
			}
		}

		return instance;
	}

}

public class SingletonDesignPattern3 {
	public static void main(String[] args) throws ClassNotFoundException {

		Connection instance1 = Connection.getInstance();
		System.out.println(instance1.hashCode());

		try {
			Connection instance2 = (Connection) instance1.clone();
			System.out.println(instance2.hashCode());
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}

		Class<?> instance3 = Class.forName("Connection");
		Constructor<?>[] constructors = instance3.getDeclaredConstructors();

		for (Constructor<?> c : constructors) {
			c.setAccessible(true);

			try {
				Connection con = (Connection) c.newInstance();
				System.out.println(con.hashCode());
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				System.out.println(e.getMessage());
			}

		}

	}
}
