import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Car> listCar = new ArrayList<Car>();
	ArrayList<Motorcycle> listMotorcycle = new ArrayList<Motorcycle>();
	
	public void Input() {
		String type = null;
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
		} while (!(type.equals("Car") || type.equals("Motorcycle")));
		
		String brand = null;
		do {
			System.out.print("Input brand [>= 5]: ");
			brand = scan.nextLine();
		} while (brand.length() < 5);
		
		String name = null;
		do {
			System.out.print("Input name [>= 5]: ");
			name = scan.nextLine();
		} while (name.length() < 5);
		
		Pattern p = Pattern.compile("^([A-Z]{1,1}) ([1-9][0-9]{0,3}) ([A-Z]{1,3})$");
		Matcher m;
		String license = null;
		do {
			System.out.print("Input license: ");
			license = scan.nextLine();
			m = p.matcher(license);
		} while (!m.matches());
		
		int topSpeed = 0;
		do {
			System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
			topSpeed = scan.nextInt();
			scan.nextLine();
		} while (topSpeed < 100 || topSpeed > 250);
		
		int gasCapacity = 0;
		do {
			System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
			gasCapacity = scan.nextInt();
			scan.nextLine();
		} while (gasCapacity < 30 || gasCapacity > 60);
		
		int wheel = 0;
		String jenis = null;
		int special = 0;
		
		if (type.equals("Car")) {
			do {
				System.out.print("Input wheel [4 <= wheel <= 6]: ");
				wheel = scan.nextInt();
				scan.nextLine();
			} while (wheel < 4 || wheel > 6);
			
			do {
				System.out.print("Input type [SUV | Supercar | Minivan]: ");
				jenis = scan.nextLine();
			} while (! (jenis.equals("SUV") || jenis.equals("Supercar") || jenis.equals("Minivan")));
			
			do {
				System.out.print("Input entertainment system amount [>= 1]: ");
				special = scan.nextInt();
				scan.nextLine();
			} while (special < 1);
			
			Car newCar = new Car(brand, name, license, topSpeed, gasCapacity, wheel, jenis, special);
			listCar.add(newCar);
		} else {
			do {
				System.out.print("Input wheel [2 <= wheel <= 3]: ");
				wheel = scan.nextInt();
				scan.nextLine();
			} while (wheel < 2 || wheel > 3);
			
			do {
				System.out.print("Input type [Automatic | Manual]: ");
				jenis = scan.nextLine();
			} while (! (jenis.equals("Automatic") || jenis.equals("Manual")));

			do {
				System.out.print("Input helm [>= 1]: ");
				special = scan.nextInt();
				scan.nextLine();
			} while (special < 1);
			
			Motorcycle newMotorcycle = new Motorcycle(brand, name, license, topSpeed, gasCapacity, wheel, jenis, special);
			listMotorcycle.add(newMotorcycle);
		}
		
		System.out.println("ENTER to return...");
		scan.nextLine();
	}
	
	public void printTable() {
		System.out.println("");
		System.out.println("");
		System.out.println("|-----|---------------|---------------|");
		 System.out.printf("|%-5s|%-15s|%-15s|\n","No","Type","Nama");
		System.out.println("|-----|---------------|---------------|");
		
		int idx = 1;
		
		for (int i = 0; i < listCar.size(); i++) {
			System.out.printf("|%-5s|%-15s|%-15s|\n",idx,"Car",listCar.get(i).Name);
			idx++;
		}
		
		for (int i = 0; i < listMotorcycle.size(); i++) {
			System.out.printf("|%-5s|%-15s|%-15s|\n",idx,"Motorcycle",listMotorcycle.get(i).Name);
			idx++;
		}
		
		System.out.println("|-----|---------------|---------------|");
		System.out.println("|-----|---------------|---------------|");
	}
	
	public void View() {
		int Choose = 0;
		
		do {
			printTable();
			System.out.print("Pick a vehicle number to test drive [Enter '0' to exit]: ");
			Choose = scan.nextInt();
			scan.nextLine();
			
			if (Choose == 0) {
				
			} else if (Choose > 0 && Choose <= listCar.size()) {
				int temp = Choose - 1;
				listCar.get(temp).TestDrive();
			} else {
				int temp = Choose - listCar.size() - 1;
				listMotorcycle.get(temp).TestDrive();
			}
		} while (Choose != 0);
	}
	
	public Main() {
		int Choose = 0;
		do {
			System.out.println("Welcome to PT Musang");
			System.out.println("--------------------");
			
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Exit");
			
			System.out.print(">> ");
			Choose = scan.nextInt();
			scan.nextLine();
			
			switch(Choose) {
				case 1:{
					Input();
					break;
				}
				case 2:{
					View();
					break;
				}
			}
		} while (Choose != 3);
		
		System.out.println("Thank you!!!");
	}

	public static void main(String[] args) {
		new Main();
	}

}
