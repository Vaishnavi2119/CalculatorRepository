package p1;

interface Shapes{
	
	public void area();
	public void perimeter();
	
}

class Circle implements Shapes{
	
	int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void area() {
		System.out.println("Circle area: "+(3.14*radius*radius));
	}

	@Override
	public void perimeter() {
		System.out.println("Circle perimeter: "+(2*3.14*radius));
	}	
}

class Rectangle implements Shapes{

	int length, breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void area() {
		System.out.println("Rectangle area: "+(length*breadth));
	}

	@Override
	public void perimeter() {
		System.out.println("Rectangle perimeter: "+2*(length + breadth));
	}
	
}
public class Task3 {

	public static void main(String[] args) {
		
		Shapes s1 = new Circle(7);
		Shapes s2 = new Rectangle(10,5);
		s1.area();
		s1.perimeter();
		s2.area();
		s2.perimeter();

	}
}
