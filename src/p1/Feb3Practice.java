package p1;

class Numbers{
	
	int a, b, c;
	double x, y, z;
	
//	public Numbers(int a, int b, int c) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}

	public static int getProduct(int a, int b, int c) {
		return a*b*c;
	}
	
	public static double getProduct(int a, int b, double x, double y, double z) {
		return a*b*x*y*z;
	}
	
	public static double getProduct(int a, double d) {
		return a*d;
	}
}

public class Feb3Practice {

	public static void main(String[] args) {
		
		Numbers n1 = new Numbers();
		System.out.println(n1.getProduct(3,4,5));
		
		Numbers n2 = new Numbers();
		System.out.println(n2.getProduct(1, 3.14));
		
		Numbers n3 = new Numbers();
		System.out.println(n3.getProduct(1,2,0.1,1.00, 2.00));
	}

}
