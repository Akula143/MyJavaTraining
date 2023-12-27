package basics;

public class Loops {

	public static void main(String[] args) {
		//While loop
		System.out.println(" ****do while loop ****");
		int i=1; //initialisation
		while (i<=10) { //conditional part 
			System.out.println("Hello "+i);
			i++; //increment part
		}
		
		//do while
		System.out.println(" ****do while loop ****");
		int j=10;
		do {
			System.out.println(" Hello "+j);
			j--;
		}while (j >=1);
		
		//for loop
		System.out.println(" ****for while loop ****");
        for(int k=0; k<=0; k=k+2) {
        	System.out.println("Hello "+k);
        }
	}

}
