package p1;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,6,8,3,5};
		
		/* Method -1 
		ArrayList res = new ArrayList();
		for(int i : arr) {
			if(i%2 == 0) {
				res.add(i);
			}
		}
		for(int i : arr) {
			if( i%2 != 0) {
				res.add(i);
			}
		}
		System.out.println(res);
		*/
		
		int l = 0, r = arr.length-1;
		while(l < arr.length && r >= 0 ) {
			
			if(arr[l]%2 == 0 && arr[r]%2 != 0) {
				l++;
				r--;
			}
			else {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
	}
		
		
//		public boolean isEven(int num) {
//		if(num%2 == 0)
//			return true;
//		else
//			return false;
//		}

}
