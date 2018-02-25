package array.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(4, 5);
		Interval i3 = new Interval(4, 7);
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		Solution s = new Solution();
		for(Interval in : s.merge3(intervals)){
			System.out.println(in.start + ", " + in.end);
		}
		System.out.println();

	}

}
