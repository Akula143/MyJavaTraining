package oops;

public class Audi extends Car{

	public static void main(String[] args) {
		Audi d=new Audi();
		d.carAssemble();
		d.carTestDrive();
		d.carTestTools();
		d.carColour="White";
		System.out.println("My Audi colour is "  +d.carColour);
		d.carNumber="TS09UE0007";
		System.out.println("My Audi car number is " +d.carNumber);
		d.automaticGearsys();	

	}
	public void automaticGearsys() {
		System.out.println("Audi is with Automatic Gear System");
	}
}
