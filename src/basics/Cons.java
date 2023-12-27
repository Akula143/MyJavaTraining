package basics;

public class Cons extends ConsP{
	int i;
	double d;
	String s;
	boolean f; //global variable 

	public static void main(String[] args) { //constructor:will instantiate the instance variables 
		Cons c=new Cons();
		
	 System.out.println(c.i);
	 System.out.println(c.d);
	 System.out.println(c.s);
	 System.out.println(c.f);
	 new Cons(100);
	 new Cons(1,"Chandu");
	}
	/*
	 * What is a constructor: a special method in the class having the same name as the class name is nothing but the constructor 
	 * 1.Method over loading is possible on constructor 
	 * 2.Constructor is neither void nor return type 
	 * 3.Constructor is non static (Called via object)
	 * 4.Can we inherit the constructor?
	 * 5.Can we over ride the constructor
	 * We can call the parent class constructor by using the super keyboard
	 * and we can also call the Sam class constructor by using to this keyboard
	 */
	public Cons(){
		this(2000);/*The method in the class having the same name as the class is nothing but the constructor
		we are having 2 types 
		1.Default Constructor 
		2.Parameterized constructor 
	
	*/
		System.out.println("Child default constructor");
	}
	public Cons(int i) {
		System.out.println("Child 1 parameterized constructor "+i);
	}
	public Cons(int i,String s) {
		System.out.println("Child 2 parameterized constructor "+i+" "+s);
	}
}
