package p1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Intervals {

	public static void main(String[] args) {
		
		
		/*Non - overlapping intervals
		int intervals[][] = {{0,30},{5,10},{15,20}};
		 if (intervals.length == 0) 
			 System.out.println("0");

		        // Step 1: Sort by end time
		  Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

		        int count = 0;                     // intervals removed
		        int prevEnd = intervals[0][1];     // end time of last kept interval

		        // Step 2: Process intervals
		        for (int i = 1; i < intervals.length; i++) {
		            // If overlapping
		            if (intervals[i][0] < prevEnd) {
		                count++;  // remove this interval
		            } else {
		                // Not overlapping → keep it
		                prevEnd = intervals[i][1];
		            }
		        }
		        System.out.println(count);
		        //return count;
		*/
		
		
		/*Meeting rooms
				int intervals[][] = {{0,30},{5,10},{15,20}};
				boolean res;
		        if (intervals.length == 0) {
		        	System.out.println("true");
		        }

		        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		        for (int i = 1; i < intervals.length; i++) {
		            if (intervals[i][0] < intervals[i - 1][1]) {
		               System.out.println("false");
		               break;
		            }
		        }
		        System.out.println("true");
		 */
		
		
		//Meeting room 2
		int intervals[][] = {{0, 30},{5, 10},{15, 20}};
		        if (intervals.length == 0) {
		            //return 0;
		            System.out.println("true");
		        }

		        // Step 1: Sort meetings by start time
		        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		        // Min-heap for meeting end times
		        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		        // Add the first meeting's end time
		        minHeap.add(intervals[0][1]);

		        // Step 2: Process all meetings
		        for (int i = 1; i < intervals.length; i++) {
		            int start = intervals[i][0];
		            int end = intervals[i][1];

		            // If room is free → reuse it
		            if (start >= minHeap.peek()) {
		                minHeap.poll();   // free the room
		            }

		            // Allocate room (new or reused)
		            minHeap.add(end);
		        }

		        // Heap size = number of rooms needed
		        
		        System.out.println(minHeap.size());
		    
		
		
		
		
		
		

	}

}
