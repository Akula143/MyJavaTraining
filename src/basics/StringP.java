package basics;

import java.util.Arrays;

public class StringP {

	public static void main(String[] args) {
		String str="automation Testing";//By String Literal //SCP means string constants pool. 
		String	s="Automation Testing";
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(str));
		System.out.println(s.equalsIgnoreCase(str));
		System.out.println(s.trim());
		System.out.println(s.compareTo(str));
		System.out.println(str.length());
		String Date="25/12/2023";
		System.out.println(Date);
		System.out.println(Date.replace('/', '-'));
		System.out.println(str.charAt(9));
		System.out.println(str.indexOf('n'));
		System.out.println(str.indexOf('t'));//first occurrence of t
		System.out.println(str.indexOf('t',str.indexOf('t')+1));
		String st="Hyderabad and Secunderbad are twin cities";
		System.out.println(st.substring(8));
		String[] ar=st.split(" ");
		System.out.println(ar.length);
		System.out.println(Arrays.toString(ar));
		String name="chandu sunil kumar";
		String[] a=name.split("");
		int i=a.length;
		System.out.println(i);
		for (int j = i-1; j>=0; j--) {
			System.out.print(a[j]);
		}
		System.out.println();
		int k=12345;
		System.out.println(new StringBuilder(String.valueOf(k)).reverse());
		System.out.println(new StringBuffer(String.valueOf(k)).reverse());
		System.out.println(name.contains(" kumar"));
	}
	
}
