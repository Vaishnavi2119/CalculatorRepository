package p1;

import java.util.Scanner;

interface DeliveryCharge{
	public double calculateDelivery(int distance);
}

abstract class Package{
	int weight;
	int distance;
	
	public Package(int weight, int distance) {
		super();
		this.weight = weight;
		this.distance = distance;
	}
	
	public double calculateBase() {
		int baseFare = this.weight * 2;
		return baseFare;
	}
	
	abstract double calculateTotal();
}

class BikeDelivery extends Package implements DeliveryCharge{

	public BikeDelivery(int weight, int distance) {
		super(weight, distance);
		
	}

	@Override
	public double calculateDelivery(int distance) {
		if(weight > 500)
			return 0;
		return distance * 10;
	}

	@Override
	double calculateTotal() {
		if(weight > 500) {
			return calculateBase();
		}
		else {
			return calculateBase() + calculateDelivery(distance);
		}
	}
}

class CarDelivery extends Package implements DeliveryCharge{

	public CarDelivery(int weight, int distance) {
		super(weight, distance);
		
	}

	@Override
	public double calculateDelivery(int distance) {
		if(distance > 50)
			return distance*20*0.5;
		return distance * 20;
	}

	@Override
	double calculateTotal() {
		if(distance > 50) {
			return (calculateBase() + calculateDelivery(distance))* 0.50;
		}
		else
			return calculateBase() + calculateDelivery(distance);
	}

	
}
public class SmartDeliverySystem {

	public static void main(String[] args) {
	
//		Package b1 = new BikeDelivery(100,2);
//		System.out.println("Base fare: "+b1.calculateBase());
//		System.out.println("Delivery charges: "+((DeliveryCharge) b1).calculateDelivery(2));
//		System.out.println("final amt: "+b1.calculateTotal());
		
//		System.out.println("--------");
//		Package c1 = new CarDelivery(300, 5);
//		System.out.println("Base fare: "+c1.calculateBase());
//		System.out.println("Delivery charges: "+((DeliveryCharge) c1).calculateDelivery(5));
//		System.out.println("final amt: "+c1.calculateTotal());
//		
//		System.out.println("--------");
//		Package b2 = new BikeDelivery(600,10);
//		System.out.println("Base fare: "+b2.calculateBase());
//		System.out.println("Delivery charges: "+((DeliveryCharge) b2).calculateDelivery(10));
//		System.out.println("final amt: "+b2.calculateTotal());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select vehicle: ");
		String vehicle = sc.nextLine();
		System.out.println("Enter distance: ");
		int distance = sc.nextInt();
		System.out.println("Enter weight: ");
		int weight = sc.nextInt();
		
		if(vehicle.equalsIgnoreCase("bike")) {
			Package b1 = new BikeDelivery(weight,distance);
			System.out.println("Base fare: "+b1.calculateBase());
			System.out.println("Delivery charges: "+((DeliveryCharge) b1).calculateDelivery(distance));
			System.out.println("final amt: "+b1.calculateTotal());
			System.out.println("--------");
			
		}
		else if(vehicle.equalsIgnoreCase("car")) {
			Package c1 = new CarDelivery(weight, distance);
			System.out.println("Base fare: "+c1.calculateBase());
			System.out.println("Delivery charges: "+((DeliveryCharge) c1).calculateDelivery(distance));
			System.out.println("final amt: "+c1.calculateTotal());
			System.out.println("--------");
		}
		
	}

}
