package single_level1;

public class Multilevel {
	public static void main(String[] args) {
		Father f = new Father();
		f.home();
		f.love();

		Son s = new Son();
		s.bike();
		s.home();
		s.love();

		Grandson g = new Grandson();
		g.cycle();
		g.bike();
		g.home();
		g.love();

	}

}
