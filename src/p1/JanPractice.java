package p1;
import java.util.*;
public class JanPractice {

	static boolean isVowel(char ch) {
		
		return (ch == 'a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1st
		String str = "hello world";
		char blocked = 'o';
		
		StringBuilder res = new StringBuilder("");
		
		for(char ch : str.toCharArray()) {
			if(ch != blocked) {
				res.append(ch);
			}
		}
		System.out.println(res.toString());
		*/
		
		
		/*2nd
		String str = "hello world from java";
		
		String arr[] = str.split(" ");
		for(String word : arr) {
			StringBuilder word1 = new StringBuilder();
			char ch = word.charAt(0);
			word1.append(Character.toUpperCase(ch));
			word1.append(word.substring(1)).append(" ");
			System.out.print(word1);
		}
		*/
		
		/*3rd
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		str1.toLowerCase();
		str2.toUpperCase();
		
		if(str1.length() != str2.length() ) {
			System.out.println("false");
		}
		else {
			if(	(str1.concat(str1)).contains(str2))
					System.out.println("true");
			else
				System.out.println("false");
		}
		*/
		
		/* 4th
		String str = "The quick brown fox jumps";
		char  ch = 's';
		String arr[] = str.split(" ");
		int cnt = 0;
		for(String word : arr) {
			//converting stringbuilder to string --> use .toString();
			//cobverting charcater to string --> Character.toString(ch);
			if(word.endsWith(Character.toString(ch))) {
				cnt++;
			}
		}
		System.out.println(cnt);
		*/
		
		/*5th
		String str = "banana";
		String target = "na";
		String change = "xy";
		
		//string class is immutable and creates a new object
		//so we have to store it in a new variable
		String s1 = str.replace(target, change);
			
		System.out.println(str.replace(target, change));
		*/
		
		
		
		
		/*6th
		String arr[] = {"Java is fun", "I love java!", "JAVA is powerful"};
	String str = "java";
		
		str = str.toLowerCase();
	int cnt = 0;
		
		for(String sen : arr) {
			
		String words[] = sen.toLowerCase().split(" ");
			
		
		for(String word : words) {
			
				StringBuilder res = new StringBuilder("");
				//String res = "";
				for(char ch : word.toCharArray()) {
					if(Character.isLetter(ch)) {
					res.append(ch);
					//res += ch;
					}
				}
				String res1 = res.toString();
				//res.toString();	
				if(res1.equals(str)) {
					cnt++;
			}
					}
	
		}
		System.out.println(cnt);
		
//		String arr[] = {"Java is fun", "I love java!", "JAVA is powerful"};
//		String word = "java";
//		 int count = 0;
//		    word = word.toLowerCase();
//
//		    for (String line : arr) {
//		        String[] words = line.toLowerCase().split(" ");
//		        for (String w : words) {
//		            // remove punctuation manually
//		            String clean = "";
//		            for (char c : w.toCharArray()) {
//		                if (Character.isLetter(c)) clean += c;
//		            }
//		            if (clean.equals(word)) count++;
//		        }
//		    }
//		    System.out.println(count);
		*/
		
		/*7th
		String arr[] = {"apetuk", "detrwp", "aweyip", "grtypq", "ezovuj"};
		ArrayList<String> res = new ArrayList<String>();
		for(String word : arr) {
		
			if(!isVowel(word.charAt(0)))
				continue;
			
			boolean valid = true;
			for(int i=1; i<word.length(); i++) {
				if(isVowel(word.charAt(i)) == isVowel(word.charAt(i-1))) {
					valid = false;
					break;
				}
			}
			
			if(valid) {
				res.add(word);
			}
		}
		System.out.println(res);
			*/
		
		/*8th
		String arr[] = {"train", "horse", "apple", "brisk", "flute"};
		
		ArrayList<String> res = new ArrayList<String>();
		for(String word : arr) {
			word = word.toLowerCase();
			int v= 0, c = 0;
			for(char ch : word.toCharArray()) {
				if(isVowel(ch)) {
					v++;
				}
				else if(Character.isLetter(ch)) {
					c++;
				}
			}
			System.out.print(word+" ");
			System.out.println();
			if(v == 2 && c== 3) {
				res.add(word);
			}
			
		}
		
		System.out.println(res);
		*/
		
		
		
		/*print the compressed string of the given string
		 
		String msg = "abaacbbb";
		StringBuilder res = new StringBuilder();
		int cnt = 1;
		
		if(msg == null || msg.length() == 0) {
			System.out.println("...");
		}
		
		for(int i = 0; i < msg.length() ; i++) {
			
			if(i >= msg.length()-1 || msg.charAt(i) != msg.charAt(i+1)) {
				
				res.append(msg.charAt(i));
				
				if(cnt > 1) {
					res.append(cnt);
				}
				cnt = 1;
				
			}
			else {
				cnt++;
			}
		}
		if(res.length() == 0) {
			res.append(msg.charAt(0)).append(msg.length());
		}
		System.out.println(res.toString());*/
		
		
		
//		
//		int arr[] = {1,3,9,10};
//		Arrays.sort(arr);
//		int diff = arr[arr.length-1] - arr[0];
//		
//		if(diff%2 == 0) {
//			//when diff is even, the original array is the longest 
//			System.out.println(arr.length);
//		}
//		else {
//			//arr= [1,2,4,7]
//			//remove min 
//			int max = arr[arr.length - 1];
//			int min = arr[1];
//			if((max-min)%2 == 0) {
//				System.out.println(arr.length-1);
//			}
//			else {
//				int max1 = arr[arr.length-2];
//				int min1 = arr[1];
//				if((max1-min1)%2 == 0){
//					System.out.println(arr.length-2);
//				}
//			}
//			
//			
//		}
		
		/*
		int arr[] = {1,1,2,2}; 
				//{1,6,8,10};
			//{10, 12, 14, 16, 18, 3, 5};
		 //{1,6,8,10};
		Arrays.sort(arr);//{2,4,1,7} -> {1,2,4,7}

		int n = arr.length; //4

		// check whole array
		if ((arr[n-1] - arr[0]) % 2 == 0) { // 7-1 = 6
		    System.out.println(n);
		    return;
		}

		// try removing the minimum
		if ((arr[n-1] - arr[1]) % 2 == 0) { // 10-3 = 7
		    System.out.println(n - 1);
		    return;
		}

		// try removing the maximum
		if ((arr[n-2] - arr[0]) % 2 == 0) { // 9-1 = 8 {1,3,9}
			
		    System.out.println(n - 1);
		    return;
		}

		 int odd = 0, even = 0;
		    for (int x : arr) {
		        if (x % 2 == 0) even++;
		        else odd++;
		    }

		    int ans = Math.max(even, odd);

		

		
		System.out.println(ans);
	*/
		
		/*
		int n = arr.length;
		for(int i = n; i >= 1 ; i--) {
			for(int j = 0; j + i -1 < n; j++) {
				
				int min  = arr[j];
				int max = arr[j+i-1];
				int diff = max - min;
				
				if(diff%2 == 0) {
					System.out.println(i);
				}
			}
		}
		*/
		
		String str = "This test contains even words";
				//"I love programming a lot";


				//"loves leelas hari";
		String arr[] = str.split(" ");
		StringBuilder ans = new StringBuilder();
		int max_length = arr[0].length();
		for(int i = 1; i < arr.length; i++) {
			if(arr[i].length()%2 == 0 && arr[i].length() > max_length ) {
				max_length = arr[i].length();
				ans.append(arr[i]);
			}
		}
		System.out.println(ans+" "+max_length);
		
	}

}
