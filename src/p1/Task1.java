package p1;

class Vehicles{
	
	String vno;
	String fuel;
	
	//constructor
	public Vehicles(String vno, String fuel) {
		super();
		this.vno = vno;
		this.fuel = fuel;
	}
	
	//concrete method
	public void displayDetails() {
		System.out.println("Vehicles details --"+this.vno);
		System.out.println("fuel type--"+this.fuel);
	}
}

class Car extends Vehicles{

	public Car(String vno, String fuel) {
		super(vno, fuel);
		
	}
}

class Bike extends Vehicles{

	public Bike(String vno, String fuel) {
		super(vno, fuel);
		// TODO Auto-generated constructor stub
	}	
}

public class Task1 {

	public static void main(String[] args) {
		
		Bike v1 = new Bike("KA02XY5678","Petrol");
		v1.displayDetails();
		
		
		Car v2 = new Car("KA01AB1234","disel");
		v2.displayDetails();
		
		
		
	}

}
