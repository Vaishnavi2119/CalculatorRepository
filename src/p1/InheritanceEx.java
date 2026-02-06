package p1;

class Person
{
	//parent class
	String name;
	int age;
	String city;
	
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public void displayDetails()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.city);
	}
	
}
class Manager extends Person
{
	//child class
	String company;
	int salary;
	
	public Manager(String name, int age, String city, String company, int salary) {
//		access those 3 lines present in person class constructor
//		child class has to connect to parent class ==> super
		super(name,age,city);//super("John")
		this.company = company;
		this.salary = salary;
	}
	
	public void displayManagerDetails()
	{
		super.displayDetails();
		System.out.println(this.company); 
		System.out.println(this.salary);
	}
	
	
}


public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Mark", 40, "Mumbai");
		p.displayDetails();
		
		System.out.println("-----------------------");
		
		Manager m = new Manager("John", 35, "Pune", "ABC Company", 40000);
		m.displayManagerDetails();

		
	}

}
