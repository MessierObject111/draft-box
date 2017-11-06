package array.minIndexSumOfTwoLists;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String[] findRestaurant(String[] list1, String[] list2) {
		int MIN = Integer.MAX_VALUE;
		List<Integer> index = new ArrayList<Integer>();
        for(int i = 0; i < list1.length; i++) {
        	for(int j = 0; j < list2.length; j++) {
        		if(list1[i].equals(list2[j])) {
        			if(i + j < MIN) {
        				MIN = i + j;
        				index.clear();
        				index.add(i);
        			}
        			else if(i + j == MIN) {
        				//System.out.println("i:"+i+" j:"+j);
        				index.add(i);
        			}
        		}
        	}
        }
        String[] result = new String[index.size()];
        for(int z = 0; z< index.size(); z++){
        	//System.out.println("z:"+z+" s:"+list1[index.get(z)]);
        	result[z] = list1[index.get(z)];
        }
        return result;
    }
}
