package basics;

public class ConditionalStatements {

	public static void main(String[] args) {
		 
		int i=10;
		int j=20;
		// simple if
		if (i<j) {
			 System.out.println("i is lesser than j");
		}
		//if else
		if (i>=j) {
			System.out.println("i is lesser or equal to j value ");
		} else {
            System.out.println("i is greater or equal to j value ");
		}
		
	char ch='O';
	//Print the charcter is vowel or consonant
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+ " is a vowel");
		} else {
			System.out.println(ch+ " is a consonant");

		}
		//nested if // else if
		if (i>j) {
			System.out.println("i is is greater than j");
		} else if (i>=j) {
           System.out.println(" i is greater or equal to j");
		}else if (i==j) {
			System.out.println("i and j are equal");
		}else if (i!=j || i==j) {
			System.out.println("i and j are not equal");
		}else {
			System.out.println("i is leaser than j");
		}
	}

}
