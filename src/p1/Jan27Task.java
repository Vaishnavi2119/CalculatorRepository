package p1;
import java.util.*;
public class Jan27Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pitches[] = {10, 12, 13, 9, 14};
		
		Arrays.sort(pitches);
		
		int l =0, r,max=1, windowLength = 1;
		for(r=1; r< pitches.length; r++) {
			
			while(pitches[r] - pitches[r-1] > 1) {
				l = r;
			}
			
			windowLength = r - l + 1;
			max = Math.max(max, windowLength);
			System.out.println(max);
		}
		System.out.println(max);
	}

}
