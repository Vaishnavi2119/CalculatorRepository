package p1;
import java.util.*;


public class Jan24Practice {

	public static void main(String[] args) {
	
//		String full    = "I love programming very much";
//		String partial = "I programming";
		
		String full    = "Java is very powerful language";
		String		partial = "java powerful";

		full = full.toLowerCase();
		System.out.println(full.toLowerCase());
		partial = partial.toLowerCase();
		
		String f[] = full.split(" ");
		String[] p = partial.split(" ");
		ArrayList<String> res = new ArrayList<String>();
		
		HashSet<String> hs = new HashSet<String>();
		
		for(String str : p) {
			hs.add(str);
		}
		for(String str : f) {
			if(!hs.contains(str)) {
				res.add(str);
			}
		}
		System.out.println(res);
	}
}
