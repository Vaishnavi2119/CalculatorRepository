package p1;

import java.util.ArrayList;
import java.util.List;

public class ExInsertInterval {

	public static void main(String[] args) {
		int intervals[][] = {{1,3}, {1,6}};
		int newInt[] = {2,5};
		
		List<int[]> res = new ArrayList<>();
		int i = 0, n = intervals.length;
		
		while(i < n && intervals[i][1] < newInt[0]) {
			res.add(intervals[i]);
			i++;
		}

		while(i < n && intervals[i][0] <= newInt[1]) {
			newInt[0] = Math.min(newInt[0], intervals[i][0]);
			newInt[1] = Math.max(newInt[1], intervals[i][1]);
			i++;
		}
		res.add(newInt);
		
		while(i < n) {
			res.add(intervals[i]);
			i++;
		}
		for(int j = 0; j<res.size(); j++)
		System.out.println(res.get(j));
	}

}
