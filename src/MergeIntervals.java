import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	static List<int[]> mergeIntervals(List<int[]> intervals) {
		List<int[]> merged = new ArrayList<int[]>();
		
		Collections.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		int[] interval = null;
		for (int i = 0; i < intervals.size(); i++) {
			if (i == 0 || intervals.get(i)[0] > interval[1]) {
				interval = new int[2];
				interval[0] = intervals.get(i)[0];
				interval[1] = intervals.get(i)[1];
				merged.add(interval);
			} else {
				if (interval[1] < intervals.get(i)[1]) {
					interval[1] = intervals.get(i)[1];
				}
			}
		}
		
		// print
		for (int[] arr : merged) {
			System.out.print("{" + arr[0] + "," + arr[1] + "}, ");
		}
		System.out.println();
		
		return merged;
	}
	
	public static void main(String[] args) {
		mergeIntervals(Arrays.asList(new int[][]{{6,8}, {1,9}, {2,4}, {4,7}}));//{{1,9}}
		mergeIntervals(Arrays.asList(new int[][]{{1,3},{2,6},{8,10},{15,18}}));//{{1,6},{8,10},{15,18}}
	}
}
