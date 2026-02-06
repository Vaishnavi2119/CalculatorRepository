package p1;

import java.util.Locale;
import java.util.Scanner;

interface Shape{
	abstract double getArea();
	abstract double getPerimeter();
}

abstract class AbstractShape implements Shape{
	private String color;

	public AbstractShape(String color) {
		super();
		this.color = color;
	}
	
	public String toString() {
		return this.color;
		
	}
}


class Rectangle extends AbstractShape{
	
	private int length;
	private int breadth;
	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double getArea() {
		
		return length*breadth;
	}
	@Override
	public double getPerimeter() {
		
		return 2*(length + breadth);
	}

		public String toString() {
        // Rectangle [colour=X, length=Y, breadth=Z]
        return "Rectangle [" + super.toString()
                + ", length=" + this.length
                + ", breadth=" + this.breadth + "]";
    }
	
}


class Circle extends AbstractShape{
	private int radius;
	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}
	@Override
	public double getArea() {
		
		return Math.PI * radius *radius;
	}
	@Override
	public double getPerimeter() {
		
		return 2 * Math.PI *radius;
	}

@Override
    public String toString() {
        // Circle [colour=X, radius=Y]
        return "Circle [" + super.toString()
                + ", radius=" + this.radius + "]";
    }

	
}

public class ShapeHierarchyOops {

	public static void printShape(Shape s) {
        long areaRounded = Math.round(s.getArea());
        long periRounded = Math.round(s.getPerimeter());
        System.out.println("Area: " + areaRounded + ", Perimeter: " + periRounded);
    }
		

	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Expected inputs (typical platform style):
        // First token: "CIRCLE" or "RECTANGLE"
        String shapeType = sc.next().trim().toUpperCase(Locale.ROOT);

        if ("CIRCLE".equals(shapeType)) {
            String colour = sc.next();   // colour
            int radius = sc.nextInt();   // radius
            Circle c = new Circle(colour, radius);
            System.out.println(c.toString());
            printShape(c);
        } else if ("RECTANGLE".equals(shapeType)) {
            String colour = sc.next();   // colour
            int length = sc.nextInt();   // length
            int breadth = sc.nextInt();  // breadth
            Rectangle r = new Rectangle(colour, length, breadth);
            System.out.println(r.toString());
            printShape(r);
        } else {
            // Fallback in case of invalid shape type
            System.out.println("Unsupported shape");
        }

        sc.close();

	}

}
