package priorityQueue.topKFrequentWords;

import graph.tree.movieNetwork.Movie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
	public List<String> topKFrequent(String[] words, int k) {
		 List<String> result = new LinkedList<String>();
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        for(int i=0; i<words.length; i++)
	        {
	            if(map.containsKey(words[i]))
	                map.put(words[i], map.get(words[i])+1);
	            else
	                map.put(words[i], 1);
	        }
	        
	        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(
	                 //(a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue()
	        );
	        
	        for(Map.Entry<String, Integer> entry: map.entrySet())
	        {
	            pq.offer(entry);
	            if(pq.size()>k)
	                pq.poll();
	        }
	
	        while(!pq.isEmpty())
	            result.add(0, pq.poll().getKey());
	        
	        return result;

	}
	private Comparator<Map.Entry<String, Integer>> freqComparator = new Comparator<Map.Entry<String, Integer>>() {
		@Override
		public int compare(Map.Entry<String, Integer> map1, Map.Entry<String, Integer> map2) {
            return (map1.getValue() - map2.getValue());
        }
	};
	
	public List<String> topKFrequent2(String[] words, int k) {
		List<String> result = new LinkedList<String>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(k, freqComparator);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word : words) {
        	if(map.containsKey(word)) {
        		map.put(word, map.get(word)+1);
        	}else{
        		map.put(word, 1);
        	}
        }
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }

        while(!pq.isEmpty())
            result.add(0, pq.poll().getKey());
        return result;
    }
}
