import java.util.Scanner;

public class Car extends Vehicle {

	Scanner scan = new Scanner(System.in);
	protected int EntertainmentSystem;

	public Car(String brand, String name, String license, int topSpeed, int gasCapacity, int wheel, String jenis, int special) {
		super();
		
		super.Brand = brand;
		super.Name = name;
		super.LicenseNumber = license;
		super.TopSpeed = topSpeed;
		super.GasCap = gasCapacity;
		super.Wheel = wheel;
		super.JenisTipeKendaraan = jenis;
		EntertainmentSystem = special;
	}
	
	public void TestDrive() {
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("Let's go to test drive!");
		System.out.println("-----------------------");
		System.out.println("Brand: " + super.Brand);
		System.out.println("Name: " + super.Name);
		System.out.println("License Plate: " + super.LicenseNumber);
		System.out.println("Type: " + super.JenisTipeKendaraan);
		System.out.println("Gas Capacity: " + super.GasCap);
		System.out.println("Top Speed: " + super.TopSpeed);
		System.out.println("Wheel(s): " + super.Wheel);
		System.out.println("Entertaiment System: " + EntertainmentSystem);
		
		System.out.println("Turning on entertainment system...");
		
		if (super.JenisTipeKendaraan.equals("Supercar")) {
			System.out.println("Boosting!");
		}
		
		System.out.println("Press Enter to End Test Drive...");
		scan.nextLine();
	}
	
}
