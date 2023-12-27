package accessModifiers1;

import accessModifiers.Test;

public class Test3 {

	public void sam() {
    	Test o=new Test(); //Object 
    	//System.out.println("private variable" +o.a); //The field Test.a is not visible..private variable will be 
    												// accessed only with in the class 
		//System.out.println("default variable" +o.b);
		//System.out.println("protected variable" +o.c);//The field Test.c is not visible..will be used with in the
													 //package and in the child class
		System.out.println("public variable" +o.d);//we can use any where in the project 
        o.display();
	}
}
