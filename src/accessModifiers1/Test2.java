package accessModifiers1;

import accessModifiers.Test;

    public class Test2 extends Test { //is a relationship  	 	
	public void sum() {
		//System.out.println("private variable" +a); //The field Test.a is not visible..only with in the class
		//System.out.println("default variable" +b); //The field Test.b is not visible.. we can use only 
													//with in the package
		System.out.println("protected variable" +c);
		System.out.println("public variable" +d);
	}

}
