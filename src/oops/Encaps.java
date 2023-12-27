package oops;

public class Encaps {   //pojo:-plain old java Object...
	private String username;
	private String password;
	
	public void setUserName(String uname) {
		username =uname;
	}
	public void setPassWord(String pword) {
		password=pword;
	}
	public String getUserName() {  //without argument and with return type
		return username;
	}
	public String getPassword() {
		return password;
	}
	
}
