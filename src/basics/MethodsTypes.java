package basics;

public class MethodsTypes {
//1.without arguments and without return type 
	public void sum() {
		int i=10;
		int j=20;
		System.out.println("1.without arguments and without return type ");
		System.out.println("sum of i and j is "+ (i+j));
		System.out.println();
	}
//2.with arguments and without return type
	public void mutli(int i, int j) {
		System.out.println("2.with arguments and without return type");
		System.out.println("multiplication of i and j is "+ (i*j));
		System.out.println();
		}
//3.without arguments and with return type 
	public int sub() { //void means return nothing
		int i=10;
		int j=5;
		int k=i-j;
		System.out.println("3.without arguments and with return type ");
		System.out.println(k);
		System.out.println();
		return k;	
	}
//4.with arguments and with return type 
	public int div(int i, int j) {
		int k=i/j;
		System.out.println("4.with arguments and with return type ");
		System.out.println(k);
		System.out.println();
		return k;
	}
} 
