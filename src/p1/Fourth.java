package p1;
import java.util.*;
public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 13,12, 45,  4, 70, 60, 50};
		
		Queue<Integer> pmax = new PriorityQueue<Integer>(Collections.reverseOrder());
		Queue<Integer> pmin = new PriorityQueue<Integer>();

		//int i = 1;
		
		pmax.add(arr[0]);
	
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] <= arr[0] ) {
				pmax.add(arr[i]);
			}
			else {
				pmin.add(arr[i]);
			}
			if(pmax.size() > pmin.size()+1) {
			pmin.add(pmax.poll());
		}
		else if(pmin.size() > pmax.size()){
			pmax.add(pmin.poll());
		}
			
		}
		
	
		
		//first add and then balance	
		/*
		int i = 1;
		while(i < arr.length) {
			
			if(arr[i] > pmax.peek()) {
				pmin.add(arr[i]);
			}
			else {
				pmax.add(arr[i]);
			}
			i++;
			if(pmax.size() > pmin.size()) {
				pmin.add(pmax.poll());
			}
			else {
				pmax.add(pmin.poll());
			}

		}
		*/		
		System.out.println(pmax.peek()+" "+pmin.peek());
		System.out.println((pmax.peek() + pmin.peek())/2);
	}
}
