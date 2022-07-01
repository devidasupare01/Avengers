package multi_level;

public class Child extends Father {
	public void name() {
		System.out.println("DEVIDAS");
	}

	public void age() {
		System.out.println("20YEAR");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.name();
		c.age();
		c.bike();
		c.car();
		c.home();
		c.farm();
		c.photo();

	}
}
