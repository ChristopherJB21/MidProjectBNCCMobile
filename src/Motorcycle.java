import java.util.Scanner;

public class Motorcycle extends Vehicle{
	
	Scanner scan = new Scanner(System.in);

	protected int Helm;
	
	public Motorcycle(String brand, String name, String license, int topSpeed, int gasCapacity, int wheel, String jenis, int special) {
		super();
		
		super.Brand = brand;
		super.Name = name;
		super.LicenseNumber = license;
		super.TopSpeed = topSpeed;
		super.GasCap = gasCapacity;
		super.Wheel = wheel;
		super.JenisTipeKendaraan = jenis;
		Helm = special;
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
		System.out.println("Helm: " + Helm);
		
		System.out.println(super.Name + " is standing!");
		
		int Price = 0;
		
		do {
			System.out.print("Input Helm Price [100000 <= Helm Price <= 1000000|: ");
			Price = scan.nextInt();
			scan.nextLine();
		} while (Price < 100000 || Price > 1000000);
		
		System.out.println("Price: " + Price);
		
		System.out.println("Press Enter to End Test Drive...");
		scan.nextLine();
	}
	
}
