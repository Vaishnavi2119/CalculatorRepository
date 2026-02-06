package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Feb3 {

	public static void main(String[] args) {
	
		//String str = "1724359";
		//9758601
		/*
		char nums[] = str.toCharArray();
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			
			int num = Integer.parseInt(String.valueOf(nums[i]));
			if(num%2 == 0) {
				even.add(num);
			}
			else {
				odd.add(num);
			}
		}
		
		Collections.sort(even, Collections.reverseOrder());
		Collections.sort(odd, Collections.reverseOrder());
		
		StringBuilder res = new StringBuilder();
		int i = 0, j = 0;
		for(int k = 0; k < str.length(); k++) {
			
			char ch = str.charAt(k);
			int num = Integer.parseInt(String.valueOf(ch));
			if(num%2 == 0) {
				res.append(even.get(i));
				i++;
			}
			else {
				res.append(odd.get(j));
				j++;
			}
		}
		System.out.println(res);
	*/
//		//ArrayList<Integer> track = new ArrayList<>();
//		for(int i = 0; i < str.length()-1; i++) {
//			int num1 = str1.charAt(i) - '0';
//			int num2 = str1.charAt(i+1) - '0';
//			
//			if(num1%2 == 0 && num2%2 == 0) {
//				if(num1 > num2) {
//					res.append(num1);
//				}
//				else {
//					res.append(num2);
//				}
//			}
//		/*
//		String str = "1724359";
//		StringBuilder res = new StringBuilder();
//		int k = 0;
//
//		int l = 0, r = 1;
//		
//		for(r = 1; r < str.length(); r ++) {
//			int num = str.charAt(r) - '0';
//			if(num%2 == 0) {
//				
//				
//			}
//		}
//		
//		*/
		
	String s1[] = {"sathwika", "u", "leela", "alekya", "neha","ad"};
			//{"vysh"};
		//
	String s2[] = {"sat", "vaish", "lilla", "duef", "pdug","la"};
//{"vaiyshu"};
//{
		
		String res[] = new String[s1.length]; 
	
		for(int i = 0; i < s1.length; i++) {
			int n = s1[i].length();
			int k = 0;
			HashSet<Character> set = new HashSet<>();
			for(char ch : s1[i].toCharArray()) {
				set.add(ch);
			}
			
			for(char ch : s2[i].toCharArray()) {
				if(set.contains(ch)) {
					res[i] = "yes";
					break;
				}
				else {
					res[i] = "no";
					//break;
				}
			}
		}
		for(int i = 0; i < res.length; i++)
			System.out.print(res[i]+" ");
	}

}
