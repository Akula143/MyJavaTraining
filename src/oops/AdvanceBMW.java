package oops;

public class AdvanceBMW extends BMWClass{

	public static void main(String[] args) {
		AdvanceBMW	a=new AdvanceBMW();
		a.carAssemble();
		a.carTestDrive();
		a.carTestTools();
		a.carColour="Grey";
		System.out.println(a.carColour);
		a.carNumber="TS09UE141411";
		System.out.println(a.carNumber);
		a.sunRoof();
		a.advancebmwchild();

	}
	public void advancebmwchild() {
			System.out.println("advanced BMW is ready to drive");
	}
	
}
