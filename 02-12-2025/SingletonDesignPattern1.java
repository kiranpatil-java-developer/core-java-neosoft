class Database {

	private static Database instance;

	private Database() {
	}

	public static Database getInstance() {

		if (instance == null) {
			return instance = new Database();
		}

		return instance;

	}

}

public class SingletonDesignPattern1 {
	public static void main(String[] args) {
		
		
		Database instance1 = Database.getInstance();
		System.out.println(instance1.hashCode());
		
		Database instance2 = Database.getInstance();
		System.out.println(instance2.hashCode());
		
		Database instance3 = Database.getInstance();
		System.out.println(instance3.hashCode());
		
		
	}
}
