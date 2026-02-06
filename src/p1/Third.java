package p1;
import java.util.*;
public class Third {

	public static void main(String[] args) {
		
		int arr[] = {1,5,3,2,4};
		int target = 2;
		HashSet<Integer> s = new HashSet<Integer>();
		int cnt = 0;
		for(int i : arr) {
			
			if(!s.contains(i+ target) && !s.contains(i - target) )  {
				//System.out.println(i);
				s.add(i);
			}
			
			else {
				cnt++;																												
			}
		}
		System.out.println(cnt);

	}

}
