package p1;

abstract class Movie{
	
	private String movieName;
	private float basePrice;
	
	public Movie(String movieName, float basePrice) {
		//super();
		this.movieName = movieName;
		this.basePrice = basePrice;
	}
	
	public String getMovieName() {
		return this.movieName;
	}
	
	public float getBasePrice() {
		return this.basePrice;
	}
	public abstract String getType();
	
	public abstract float calculatePrice(int seats);
	
	
}

class Regular extends Movie{

	public Regular(String movieName, float basePrice) {
		super(movieName, basePrice);
		
	}

	@Override
	public float calculatePrice(int seats) {
		float totalPrice = getBasePrice() * seats;
		return totalPrice;
	}
	
	public String getType() {
		return "Regular";
	}
	
}

class Premium extends Movie{

	public Premium(String movieName, float basePrice) {
		super(movieName, basePrice);
		
	}

	@Override
	public float calculatePrice(int seats) {
		float normalPrice = getBasePrice() * seats;
		float extra = (float) (normalPrice * 0.20);
		float totalPrice = normalPrice + extra;
		return totalPrice;
	}
	
	public String getType() {
		return "Premium";
	}
}

class Booking{
	private Movie movieName;
	private int seats;
	
	
	public Booking(Movie movieName, int seats) {
		if(seats <= 0) {
			System.out.println("Invalid!");
			System.out.println(".....");
		}
		this.movieName = movieName;
		this.seats = seats;
	}
	
	public int getSeatsBooked() {
		return seats;
	}
	
	public float getTotalPrice() {
		return movieName.calculatePrice(seats);
	}
}



public class MovieBookingApplication {

	public static void main(String[] args) {
		
	Movie m1 = new Regular("Interstellar", 150);
	Booking b1 = new Booking(m1, 2);
	
	
	System.out.println("Movie: "+m1.getMovieName());
	System.out.println("Type: "+m1.getType());
	System.out.println("Base price: "+m1.getBasePrice());
	System.out.println("No of seats booked: "+b1.getSeatsBooked());
	System.out.println("Pay: "+b1.getTotalPrice());
	System.out.println("..................");
	}

}
