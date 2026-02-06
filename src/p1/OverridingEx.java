package p1;

class Bank{
	
	public float interest() {
		return 6.0f;
	}
}

class SBI extends Bank{
	//child class inherits interest() method from parent class
	//and it can modify the method as per its requirements
	//this is called method over riding
	public float interest() {
		return 6.3f;
	}
}

class HDFC extends Bank {
	
	public float interest() {
		return 6.8f;
	}
}

public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		System.out.println(sbi.interest());
		
		HDFC hdfc = new HDFC();
		System.out.println(hdfc.interest());

	}

}
