package week59.myCalendarI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyCalendar {
    public Queue<Map<Integer, Integer>> booked;
    public MyCalendar() {
        this.booked = new PriorityQueue<Map<Integer, Integer>>(1000);
    }
    
    public boolean book(int start, int end) {
    	if(booked.isEmpty()){
    		booked.add(new HashMap<Integer, Integer>(start, end));
    		return true;
    	}
        return false;
    }
}
