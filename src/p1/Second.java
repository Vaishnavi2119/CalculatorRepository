package p1;
import java.util.*;
import java.util.Collections;
class Students implements Comparable<Students> {

	//variables
	int rollno;
	String name;
	int marks;
	
	//constructor
	public Students(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Students b) {
		
		return b.marks - this.marks;
	}
	
	
	
}
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(101, "A", 27);
		Students s2 = new Students(102, "B", 85);
		Students s3 = new Students(103, "C", 68);
		Students s4 = new Students(104, "D", 46);
		
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
//		System.out.println(al);
		
		Collections.sort(al);
		for(Students i : al) {
			System.out.println(i.rollno+" " +i.name+" "+ i.marks);
		}
	}

}
