package p1;
class Employee1{
	long empId;
	String name;
	String addr;
	long phn;
	double base;
	double spla = 250.80;
	double hra = 1000.50;
	
	public Employee1(long empId, String name, String addr, long phn) {
		super();
		this.empId = empId;
		this.name = name;
		this.addr = addr;
		this.phn = phn;
	}
	
	public double calculateSalary() {
		return base + (base+spla/100)+(base*hra/100); 
		
	}
	public double transportAllowance() {
		return 0.1* base;
	}	
}

class Manager3 extends Employee1{
	public Manager3(long empId, String name, String addr, long phn, long base) {
		super(phn, addr, addr, phn);
		this.empId = empId;
		this.name = name;
		this.addr = addr;
		this.phn = phn;
		this.base = base;
	}
	public double transportAllowance() {
		return 0.15* base;
	}	
}
class Trainee extends Employee1{
	public Trainee(long empId, String name, String addr, long phn, long base) {
		super(phn, addr, addr, phn);
		this.empId = empId;
		this.name = name;
		this.addr = addr;
		this.phn = phn;
		this.base = base;
	}
	public double transportAllowance() {
		return 0.10* base;
	}	
}
public class SplAllowance {

	public static void main(String[] args) {
	
		Manager3 m1 = new Manager3(100,"abc","addr1",9440,50000);
		System.out.println("Manager salary: "+m1.calculateSalary());
		System.out.println("Manager tpa:"+m1.transportAllowance());

	}

}
