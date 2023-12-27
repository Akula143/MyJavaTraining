package oops;

public interface MyInterface {
	int minBalance=2000; //The blank final field i may not have been initialized

	public void sum();  //Abstract methods do not specify a body
	public void div(); 
		
	public static void main(String args[]) {
		//MyInterface  r=new MyInterface(); //Cannot instantiate the type MyInterface,bcz an interface can contain the abstract methods
		sub();
	}
	public static void sub() {
		System.out.println("Sub method is implemented");
	}
	public void Login();
	public void Tracking();
	public void ChangePassword();
}
//In an interface variable will act as final and also static in nature by default 
//Abstract methods do not specify a body
//In an interface the methods are abstract in nature 
//Abstract method means the method which is not having the method 
//We can define the method body also in an interface from static methods 
//we can create an object for an interface ,bcz an interface can contain the abstract methods which are unimplemented 