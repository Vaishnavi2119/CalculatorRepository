package p1;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print only words that ends with lo
		/*
		String str = "Hello helloworld trello string example";
		
		Pattern p = Pattern.compile("\\b(\\w*lo)\\s\\b",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
		*/
		
		
		//remove words that has 3 consecutive characters
		String str1 = "Sooo excited for this coool event yesss absolutely";

		String arr[] = str1.split("\\s+");
		ArrayList<String> res = new ArrayList<>();
		
		
		Pattern p1 = Pattern.compile("(\\w)\\1\\1",Pattern.CASE_INSENSITIVE);
		

		for(String i : arr) {
			
			Matcher m1 = p1.matcher(i);
			if(!m1.find()) {
				res.add(i);
			}
		}
		String res1 = String.join(" ", res);
		System.out.println(res1);
	}

}
