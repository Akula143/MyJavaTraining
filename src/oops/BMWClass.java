package oops;

public class BMWClass extends Car {

	public static void main(String[] args) {
		BMWClass b=new	BMWClass(); //Object
		b.carColour="Red";
		System.out.println(b.carColour);
		b.carNumber="TE12UE2345";
		System.out.println(b.carNumber);
		b.carAssemble();
		b.carTestDrive();
		b.carTestTools();
		b.sunRoof();
	}
	public void sunRoof() {
		System.out.println("sunRoof is installed in the BMW");
	}
}
