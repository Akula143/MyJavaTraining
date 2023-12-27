package basics;

public class DataTypes_Variables {
	static int j; //static variable
	String name; // global variable

	    public static void main(String[] args) {
		DataTypes_Variables	ob =new DataTypes_Variables();
		int marks=1000;
		System.out.println(marks);
		float f=1.2f;// local variable
		System.out.println(f);
		long l=9876543210l;
		System.out.println(l);
		boolean t=true;
		boolean t1=false;
		System.out.println(t);
		System.out.println(t1);
		char ch='$';
		System.out.println(ch);
		int i=1; //implicit type casting...widen type casting 
		byte b=(byte)1000; // Explicit type casting ...narrow type casting
		String str="chandu";
		String s1="987456"; //local variable 
		System.out.println(str);
		System.out.println(s1);
		System.out.println(ob.name);
		ob.samp();
		
		System.out.println("explicit type casted vale "+b);
		System.out.println(i); 
	}
	
	public void samp() {
		 
		System.out.println(j);
	}

}
