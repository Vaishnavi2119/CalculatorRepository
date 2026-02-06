package p1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[] = {10, 13, 12, 45, 9,4, 70, 60, 50};
		//[4]
		//[4, 9, 10, 12, 13, 15, 21, 45, 50, 60, 70]
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
			if(pmax.size() > pmin.size()) {
				pmin.add(pmax.poll());
			}
			else if(pmin.size() > pmax.size()){
				pmax.add(pmin.poll());
			}
			
		}
		System.out.println("MaxHeap: "+pmax);
		System.out.println("MinHeap: "+pmin);
		System.out.println("Median: "+pmax.peek());
	}

}
