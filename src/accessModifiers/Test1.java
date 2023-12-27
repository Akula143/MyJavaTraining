package accessModifiers;

public class Test1 {
    public void sam() {
    	Test o=new Test(); //Object 
    	System.out.println("private variable" +o.a); //The field Test.a is not visiable..private variable will be 
    												// accessed only with in the class 
		System.out.println("default variable" +o.b);
		System.out.println("protected variable" +o.c);
		System.out.println("public variable" +o.d);
        o.display();
    }
}
