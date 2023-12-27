package interview;

public class AsciiChar {

	public static void main(String[] args) {
			isUpper('P');
			char c = 'A';
			String s = "100";
			int d = c;
			int b = (int) c;
			System.out.println(d);
			System.out.println(b);

			int i = 100;// implicit type casting

			int j = (int) 13997932789l;// type casting
			// explicit type casting
			System.out.println("j value with int " + j);
			char ch = 'A';
			int alphabet = ch;

			if (alphabet >= 65 & alphabet <= 90) {
				System.out.println(ch + " is Upper case");
			} else {
				System.out.println(ch + " is Lower case");

			}
		}

		public static void isUpper(char c) {
			if (c >= 'A' && c <= 'Z') {
				System.out.println(c + " is Upper case");

			} else {
				System.out.println(c + " is Lower case");

			}
		}
	
	}


