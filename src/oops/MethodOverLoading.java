package oops;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading	b=new	MethodOverLoading();
		b.sum(10,20);
		b.sum(10,20,30);
		b.sum(3, 4);
		b.sum(5, 5, "Chandu");

	}
	public void sum() {
		System.out.println("Simple method with no arguments");
	}
	public void sum(int i, int j) {
		System.out.println(" sam of two arguments");
		System.out.println(i+j);
	}
	public void sum(int i,int j,int k) {
		System.out.println("Sum of three arguments");
		System.out.println(i+j+k);
	}
	public void sum(int i,int j,String k) {
		System.out.println("Sum of three arguments");
		System.out.println(i+j +" " +k);
	}
}
