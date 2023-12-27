package accessModifiers;

public class Test {
	int a;
	int b;  //Default variable
	protected int c;
	public int d;
	 
	public void display() {
		System.out.println("private variable" +a);
		System.out.println("default variable" +b);
		System.out.println("protected variable" +c);
		System.out.println("public variable" +d);
	}
	public void s() {
		System.out.println(a);
	}

}
