package p1;

class BankAccount{
	//instance variables
	int accNo;
	String accHolderName;
	private float balance;
	static String IFSC = "SBI123";
	
	
	public BankAccount(int accNo, String accHolderName, float balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	
	public void setBalance(float value) {
		if(value > 0) {
			this.balance += value;
		}
		else {
			System.out.println("Invalid!");
		}
	}
	
	public float getBalance() {
		System.out.println("Account balance: ");
		return this.balance;
	}
	
	public void display() {
		System.out.println("IFSC code: "+ IFSC);
		System.out.println("Account Holder Name: "+this.accHolderName);
		System.out.println("Account No: "+this.accNo);
		System.out.println("Balance: "+this.balance);
		System.out.println();
	}
}


public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount(10001, "Abc", 500);
		BankAccount acc2 = new BankAccount(20001, "Mks", 1000);
		
//		acc1.display();
//		acc2.display();
		
		
		acc1.setBalance(200);
		System.out.println(acc1.getBalance());
		acc2.setBalance(-50);
		System.out.println(acc2.getBalance());
	}

}
