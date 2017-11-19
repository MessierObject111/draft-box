package week59.selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        if(right < left) return res;
        for(int i = left; i<right; i++){
            if(checkDivide(i, i)){
                res.add(i);
            };
        }
        return res;
    }
    
    private boolean checkDivide(int i, int temp){
    	System.out.println("i:"+i+" i/10:"+i/10);
        while(temp > 0 && temp % 10 >= 0) {
        	if(i == 20){
        		System.out.print("i:"+i+" temp:"+temp);
        		System.out.println(" The result:"+ (temp % 10));
        	}
            if((temp % 10 == 0) || i % (temp % 10) != 0){
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }
}
