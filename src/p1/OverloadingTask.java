package p1;
class FoodItem{
	//instance variables
	float calories;
	float price;
	
	//constructor
	public FoodItem(float calories, float price) {
		//super();
		this.calories = calories;
		this.price = price;
	}
	
	public float finalCalories() {
		return (this.calories + this.price);
	}
	public float finalCalories(int extraCalories) {
		return (this.calories + this.price + extraCalories );
	}
	public float finalCalories(String extraCalories) {
		return (this.calories + this.price + Integer.parseInt(extraCalories));
	}
	
}
public class OverloadingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodItem f1 = new FoodItem(200f,50f );
		System.out.println(f1.finalCalories());
		System.out.println();
		
		FoodItem f2 = new FoodItem(200,50);
		System.out.println(f2.finalCalories(30));
		System.out.println();
		
		FoodItem f3 = new FoodItem(200,50);
		System.out.println(f3.finalCalories("40"));
		System.out.println();

		
	}

}
