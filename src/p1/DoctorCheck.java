package p1;

class SalariedEmp{
	private double salary;

	public SalariedEmp() {
		
	}

	
	public SalariedEmp(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPay() {
		return salary;
	}	
}

class Doctor extends SalariedEmp{
	private String splty;
	private double fee;
	
	public Doctor() {
		super();
	}

	public Doctor(String splty, double fee, double salary) {
		super(salary);
		this.splty = splty;
		this.fee = fee;
		//this.salary = salary;
	}
	
	public String getSplty() {
		return splty;
	}

	public void setSplty(String splty) {
		this.splty = splty;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		String str = "Doctor splt: "+this.splty+"\nPay: "+getPay()+
				"\nVisitor fee: "+this.fee;
		return str;
	}
	public boolean equals(Doctor doc2) {
		if(this.getPay() == doc2.getPay() &&
				this.getSplty().equals(doc2.getSplty())) {
			return true;
		}
		return false;
	}
	
}
public class DoctorCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doctor d1 = new Doctor("obs",500,225.3);
		
		Doctor d2 = new Doctor();
		d2.setFee(500);
		d2.setSalary(2250.3);
		d2.setSplty("obs");
		
		System.out.println("doc1");
		System.out.println(d1);
		
		System.out.println("doc2");
		System.out.println(d2);
		if(d1.equals(d2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
