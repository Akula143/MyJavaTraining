package oops;

public class ChildC	extends AbClass implements MyInterface,ExcersiceInterface {

	public static void main(String[] args) {
		
		ChildC c=new ChildC();
		c.sub();
		c.sum();
		c.div();
		c.multi();
		c.ChangePassword();
		c.Login();
		c.Tracking();
		MyInterface.sub();
	}

	@Override
	public void sum() {
		System.out.println("sam method of Myinterface is implemented in ChildC");
		
	}

	@Override
	public void div() {
		System.out.println("div method implemeted in ChildC");
	}

	@Override
	public void sub() {
		
		System.out.println("sub method implemeted in ChildC");

	}
	
	@Override
	public void multi() {
		System.out.println("multi method implemeted in ChildC");

		
	}

	@Override
	public void Login() {
		System.out.println("login module implemented by gopal");
		
	}

}
//The type MyInterface cannot be the superclass of ChildC; a superclass must be a class