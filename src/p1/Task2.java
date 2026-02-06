package p1;

abstract class Staff{
	String name;
	int id;
	
	
	public Staff(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		
	}
	
	abstract public void calculateSalary();
}

class TeachingStaff extends Staff{
	
	int basicPay;
	public TeachingStaff(String name, int id, int basicPay) {
		super(name, id);
		this.basicPay = basicPay;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Teaching staff---");
		System.out.println("Name: "+this.name+" Id: "+id);
		System.out.println("Salary: "+basicPay);
	}

	
	
}
class NonTeachingStaff extends Staff{
	int dailyWage, days;
	public NonTeachingStaff(String name, int id, int dailyWage, int days) {
		super(name, id);
		this.dailyWage = dailyWage;
		this.days = days;
	}

	@Override
	public void calculateSalary() {
		System.out.println("Non - Teaching staff---");
		System.out.println("Name: "+this.name+" Id: "+id);
		System.out.println("Salary: "+(dailyWage * days));
		
	}

	
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s1 = new TeachingStaff("Anitha",101,40000);
		s1.calculateSalary();
		
		Staff s2 = new NonTeachingStaff("Ravi",102,400,25);
		s2.calculateSalary();

		
	}

}
