package p1;

class Bank{
	
	public float interest() {
		return 6.0f;
	}
}

class SBI extends Bank{

	public float interest() {
		return 6.3f;
	}
}

class HDFC extends Bank {
	
	public float interest() {
		return 6.8f;
	}
}

public class PolymorphismEx {

	public static void main(String[] args) {
		
		// instead of creating multiple variables
		//we can create a single variables that can work differently for each object
		//this is called Polymorphism
		//create variable of parent class type
		
		Bank b;
		b = new SBI();
		System.out.println(b.interest());
		
		b = new HDFC();
		System.out.println(b.interest());


	}

}
