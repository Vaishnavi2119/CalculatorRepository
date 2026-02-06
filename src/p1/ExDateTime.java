package p1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class DateCompare implements Comparator<String[]>{

	@Override
	public int compare(String s1[], String s2[]) {
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String date1 = s1[0];
		String date2 = s2[0];
		
		LocalDate d1 = 
		return 0;
	}
	
}
public class ExDateTime {

	public static void main(String[] args) {
//		
//		LocalDate date = LocalDate.now();
//		System.out.println("Currrent date: "+date);
//		System.out.println(date.getDayOfWeek());
//		System.out.println(date.getDayOfMonth());
//		System.out.println(date.getDayOfYear());
//		
//		
//		LocalDate customDate = LocalDate.of(2025,10 , 23);
//		System.out.println("Custom date: "+customDate);
//		
//		
//		String[][] info = { 
//				{"01-01-2023", "14:00", "ERROR", "failed"}, 
//				{"01-12-2023", "15:00", "INFO", "established"}, 
//				{"26-12-2024", "23:15", "ERROR", "failed"},
//				{"22-05-2021", "12:00", "ERROR", "failed"} 	
//			};
//		
//		ArrayList<String[]> res = new ArrayList<String[]>();
//		
//		for(int i = 0; i < info.length; i++) {
//			
//			if(info[i][2].equals("ERROR")) {
//				res.add(info[i]);
//			}
//		}
//		System.out.println("Before Sorting: ");
//		for(String i[] : res) {
//			System.out.println(i[0]+" "+i[1]+" "+i[2]+" "+i[3]);
//		}
//
//		
//		//sorting 
//		Collections.sort(res, new DateCompare());
//		
//		
//		System.out.println("After Sorting: ");
//		for(String i[] : res) {
//			System.out.println(i[0]+" "+i[1]+" "+i[2]+" "+i[3]);
//		}
//
//		
		
		String s = "ctcct cttt";
		Pattern greedy = Pattern.compile("c+t");
		Matcher g = greedy.matcher(s);
		
		Pattern lazy = Pattern.compile("c+?t");
		Matcher l = lazy.matcher(s);
		
		if(g.find()) {
			System.out.println(g.group());
		}
		if(l.find()) {
			System.out.println(l.group());
		}
	}

}
