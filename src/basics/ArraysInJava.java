package basics;

public class ArraysInJava {

	public static void main(String[] args) {
	/*int i=10;
	i=20;
	System.out.println(i);
	 
	String student="chandu";
	student="141411";
	System.out.println(student);
	
	String std[]= new String[5];
	
     std[0]="chandu";
     std[1]="141411";
     std[2]="175";
     std[3]="O+ve";
     std[4]="Ramudupalem";
     //std[5]="5";
   // System.out.println(std[0]);
   //  System.out.println(Arrays.toString(std));
     System.out.println(std.length);
     for (int j = 0; j < std.length; j++) {
		System.out.println(std[j]);
	}
    Object stddetails[]=new Object[5];
    stddetails[0]="Cherry";
    stddetails[1]=160;
    stddetails[2]='A';
    stddetails[3]=101011;
    stddetails[4]=true;
    System.out.println(Arrays.toString(stddetails));*/
    
    String st[][]=new String[3][3];
    st[0][0]="chandu";
    st[0][1]="Ramudupalem";
    st[0][2]="170";
    st[1][0]="RaviKumar";
    st[1][1]="Darsi";
    st[1][2]="165";
    st[2][0]="Chinna";
    st[2][1]="Surepalli";
    st[2][2]="160";
    //System.out.println(Arrays.toString(st));
    System.out.println(st.length);
    System.out.println(st[0].length);
    for (int j = 0; j < st.length; j++) {
		for (int k = 0; k < st.length; k++) {
			System.out.print(st[j][k] +"  ");
		}
		System.out.println();
	}
    
	}

}
