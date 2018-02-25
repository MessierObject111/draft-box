package array.mergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new LinkedList<Interval>();
        for(Interval sec : intervals){
        	mergeNext(result, sec);
        }
        return result;
    }
    
    private void mergeNext(List<Interval> result, Interval newSec) {
    	if(result.isEmpty()){
    		result.add(newSec);
    	}
    	for(Interval sec : result){
    		if(sec.start > newSec.start || sec.end < newSec.end){
    			Interval mergedSec = new Interval(Math.min(sec.start, newSec.start), Math.max(sec.end, newSec.end));
    			result.remove(sec);
    			result.add(mergedSec);
    		}
    	}
    }
    
    static class compareRules implements Comparator<Interval>{
    	public int compare(Interval i1, Interval i2){
    		return i1.start - i2.start;
    	}
    }
    
    public List<Interval> merge2(List<Interval> intervals){
    	if (intervals.size() <= 1)
            return intervals;
        
        // Sort by ascending starting point using an anonymous Comparator
        //intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        List<Interval> result = new LinkedList<Interval>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for (Interval interval : intervals) {
            if (interval.start <= end) // Overlapping intervals, move the end if needed
                end = Math.max(end, interval.end);
            else {                     // Disjoint intervals, add the previous one and reset bounds
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        
        // Add the last interval
        result.add(new Interval(start, end));
        return result;
    }
    
    public List<Interval> merge3(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval obj0, Interval obj1) {
                return obj0.start - obj1.start;
            }
        });

        List<Interval> ret = new ArrayList<Interval>();
        Interval prev = null;
        for (Interval inter : intervals) {
            if (prev==null || inter.start > prev.end ) {
                ret.add(inter);
                prev = inter;
            } else if (inter.end>prev.end) {
                // Modify the element already in list
                prev.end = inter.end;
            }
        }
        return ret;
    }
}
