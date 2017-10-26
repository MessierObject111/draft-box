import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Solution {
	public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(p.length() > s.length()){
            return result;
        }
        
        HashMap<Character, Integer> keyMap = new HashMap<Character, Integer>();
        for(int j = 0; j < p.length(); j++){
            if(keyMap.get(p.charAt(j)) != null){
            	keyMap.put(p.charAt(j), keyMap.get(p.charAt(j)) + 1);
            }else{
            	keyMap.put(p.charAt(j), 1);
            }
        }
        
        for(int i = 0; i < s.length() - p.length() + 1; i++){
        	HashMap<Character, Integer> segmentMap = new HashMap<Character, Integer>();
            for(int j = i; j < i + p.length(); j++){
            	//System.out.print(s.charAt(j));
                if(segmentMap.get(s.charAt(j)) != null){
                	segmentMap.put(s.charAt(j), segmentMap.get(s.charAt(j)) + 1);
                }else{
                	segmentMap.put(s.charAt(j), 1);
                }
                
            }
            if(keyMap.equals(segmentMap)){
                result.add(i);
            }
            //System.out.println(keyMap.equals(segmentMap));
        }
        return result;
    }
}
