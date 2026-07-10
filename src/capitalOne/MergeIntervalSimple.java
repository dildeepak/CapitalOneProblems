package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalSimple {

	public static void main(String[] args) {
		
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		System.out.println( " Out put is " + Arrays.deepToString(merge(intervals)));

	}
	public static int[][] merge(int[][] intervals) {

	    /**
	     We will design based on four simple logic
	    1) Sort the intervals by their start times.
	    2) Iterate through the sorted intervals.
	    3) Merge if the current interval overlaps with the previous one.
	    4) Add to the list if they do not overlap
	     */
	        if(intervals.length <=1){
	            return intervals;
	        }
	        //Sorting the array based on the start values
	        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));

	        List<int[]> result= new ArrayList<>();
	        int[] currentInterval = intervals[0];
	        result.add(currentInterval);

	        for(int[] interval:intervals){ //Iterating through the sorted intervals.
	            int currentEnd = currentInterval[1];
	            int nextStart = interval[0];
	            int nextEnd = interval[1];

	            if(currentEnd >= nextStart){ //Overlap condition
	                currentInterval[1]=Math.max(currentEnd, nextEnd);
	            } else { //No overlap condition
	                currentInterval = interval;
	                result.add(currentInterval);
	            }
	        }
	        return result.toArray(new int[0][]); // Passing 0 is a modern Java best practice because the JVM will automatically allocate the exact required array size instantly.
	    }

}
