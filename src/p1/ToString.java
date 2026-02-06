package p1;

class Employee{
	private String firstName;
	private String lastName;
	private int phn;
	
	public Employee() {
		//default
	}
	public Employee(String firstName, String lastName, int phn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phn = phn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhn() {
		return phn;
	}
	public void setPhn(int phn) {
		this.phn = phn;
	}
	
	@Override
	public String toString() {
		String str = "Employee [ firstname = "+getFirstName()+
				", lastName = "+getLastName()+", phn no = "+getPhn()+"]";
		return str;
	}
}
public class ToString {

	public static void main(String[] args) {
		

	}

}
