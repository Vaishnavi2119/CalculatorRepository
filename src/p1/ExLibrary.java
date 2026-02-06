package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Library{
	private int totBooks;
	private String name;
	Map<String,Integer> genre = new HashMap<>();
//	genre.put("Science",100);
	
	
	//constructor
	public Library( String name, int totBooks,HashMap<String, Integer> genre) {
		super();
		this.totBooks = totBooks;
		this.name = name;
		this.genre = genre;
	}
	
	
	//getter setter methods
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		System.out.println("Name of Library: ");
		return name;
	}
	public void setNoOfBooks(int totBooks) {
		this.totBooks = totBooks;
	}
	public int getNoOfBooks() {
		System.out.println("No of books: ");
		return totBooks;
	}
	public void setBookGenre(String name, int books) {
		this.genre.put(name, books);
	}
	public Map<String, Integer> getBookGenre() {
		System.out.println("Genres: ");
		return genre;
	}
	
}
public class ExLibrary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Library: ");
		String name = sc.nextLine();
		System.out.println("Enter total books: ");
		int totBooks = sc.nextInt();
		int allBooks = totBooks;
		Map<String,Integer> genre = new HashMap<>();
		while(allBooks > 0) {
			System.out.println("Enter genre & count of books: ");
			String genreName = sc.next();
			int cnt = sc.nextInt();
			genre.put(genreName, cnt);
			allBooks -= cnt;
		}
		
		

		System.out.println("  ");
		System.out.println("...................");
		Library l1 = new Library(name, totBooks, (HashMap<String, Integer>) genre);
		System.out.println(l1.getName());
		System.out.println(l1.getNoOfBooks());
		System.out.println(l1.getBookGenre());
		
		
		
	}

}
