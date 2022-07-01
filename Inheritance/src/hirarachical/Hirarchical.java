package hirarachical;

public class Hirarchical {
	public static void main(String[] args) {
		Mother m = new Mother();// mothers object
		m.nature();
		Mother.love();

		Son1 s1 = new Son1();
		s1.nature();// calling super class property using sub class object
		s1.watch();// own property
		Son1.money();

		Daughter d1 = new Daughter();
		d1.nature();// calling super class property using sub class object
		d1.scooty();// own property
		Daughter.look();// calling own static method
		Daughter.love();// calling static method of super class
		//Son1.money();
		//Son1.love();
	}
}
