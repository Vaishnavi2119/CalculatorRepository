package p1;
class MovieTheatre{
	//iv
	private int totalSeats;
	private int availableSeats;
	static String name = "AMB";
	
	public MovieTheatre(int totalSeats, int availableSeats) {
		//super();
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
	}
	
	public void bookSeats(int count) {
		if(count > 0 && count <= this.availableSeats) {
			System.out.println("Seats are booked!");
			this.availableSeats -= count;
		}
		else {
			System.out.println("Booking failed!");
		}
	}
	
	public int getAvailableSeats() {
		return this.availableSeats;
		
	}
}


public class EncapsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTheatre mt1 = new MovieTheatre(500,100);
		mt1.bookSeats(10);
		System.out.println(mt1.getAvailableSeats());
		
		MovieTheatre mt2 = new MovieTheatre(500,30);
		mt2.bookSeats(50);
		System.out.println(	mt2.getAvailableSeats());
		
		MovieTheatre mt3 = new MovieTheatre(500,30);
		mt3.bookSeats(0);
		System.out.println(mt3.getAvailableSeats());
		
		MovieTheatre mt4 = new MovieTheatre(500,30);
		mt4.bookSeats(-20);
		System.out.println(mt4.getAvailableSeats());

//		MovieTheatre mt5 = new MovieTheatre(500,30);
//		mt5.availableSeats(10);
//		System.out.println(mt5.getAvailableSeats());
		
		MovieTheatre mt6= new MovieTheatre(500,30);
		mt6.bookSeats(10);
		System.out.println(mt6.getAvailableSeats());
		mt6.bookSeats(5);
		System.out.println(mt6.getAvailableSeats());



	}

}
