package p1;

import java.util.Scanner;

class Product{
	private long id;
	private String productName;
	private String supplierName;
	
	public Product(long id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public void display() {
		System.out.println("Product id: "+this.getId());
		System.out.println("Product Name: "+this.getProductName());
		System.out.println("Supplier Name: "+this.getSupplierName());
	}
}
public class ProductSupplier {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id: ");
		long id = sc.nextLong();
		System.out.println("Enter product name: ");
		String productName = sc.nextLine();
		System.out.println("\"Is the product supplied by "
				+ "Nivas Suppliers? Type yes or no\"");
		String str = sc.next();
		String supplierName;
		if(str.equalsIgnoreCase("yes")) {
			supplier
		}
		

	}

}
