package basics;

public class ConsP {
	public ConsP() {
		System.out.println("Parent default constructor");
	}
	public ConsP(int i) {
		System.out.println("Parent 1 argument constructor"+i);
	}
	public ConsP(int i,boolean b) {
		System.out.println("Parent 2 argument constructor"+i+" "+b);
	}
}
