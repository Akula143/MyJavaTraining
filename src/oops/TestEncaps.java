package oops;

public class TestEncaps {

	public static void main(String[] args) {
		Encaps e=new Encaps();
		e.setUserName("Chandu");
		e.setPassWord("123456");
		System.out.println(e.getUserName());
		System.out.println(e.getPassword());

	}

}
