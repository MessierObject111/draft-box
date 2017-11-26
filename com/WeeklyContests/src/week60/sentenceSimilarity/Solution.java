package week60.sentenceSimilarity;

public class Solution {
	public boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {
		if(words1.length != words2.length){
			return false;
		}
        for(int i = 0; i < words1.length; i++) {
        	System.out.println(i);
        	if(!words1[i].equals(words2[i]) && !containsSimilarity(words1[i], words2[i], pairs)){
                return false;
            }
        }
        return true;
    }
    
    private boolean containsSimilarity(String key, String value, String[][] pairs){
        for(int i = 0; i < pairs.length; i++) {
            if(containsStr(key, pairs[i]) || containsStr(value, pairs[i])){
                if(containsStr(key, pairs[i]) && containsStr(value, pairs[i])){
                	return true;
                }
            }
        }
        return false;
    }
    
    private boolean containsStr(String str, String[] pair){
    	if(str.equals(pair[0]) || str.equals(pair[1])) {
    		return true;
    	}
    	return false;
    }
}
