package p1;

class Employee{
	
	//instance variables - created for each object
	int id;
	String name;
	int age;
	float salary;
	//static variable - created common for all objects
	static String company = "cg";
	
	//constructor
	public Employee(int id, String name, int age, float salary) {
		//iv and lv must have same name
		//this keyword on instance variables to differentiate them from local variables
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;	
	}
	
	//methods
	public void displayEmp() {
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Salary: "+this.salary);
		System.out.println("Company: "+company);
		System.out.println();
	}
}


class Student{
	
	int rollno;
	String name;
	int age;
	float marks;
	//static variables
	static String schl = "GNITS";
	
	public Student(int rollno, String name, int age, float marks) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void displayStudent() {
		System.out.println("Rollno: "+this.rollno);
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Marks: "+this.marks);
		System.out.println("School: "+schl);
		System.out.println();

	}
	
}
public class First {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100, "Neha", 23, 4500.78f);
		emp1.displayEmp();
		
		Employee emp2 = new Employee(102, "Alekhya", 43, 6500.78f);
		emp2.displayEmp();
		
		Student stu1 = new Student(001, "Sathwika", 23, 78.78f);
		stu1.displayStudent();
		
		Student stu2 = new Student(002, "Leela", 22, 78.78f);
		stu2.displayStudent();

	}
}
