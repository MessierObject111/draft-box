import java.util.HashMap;
import java.util.HashSet;

public class FirstNonRepeatChar {
	public static int nonRepeat(String s){
		HashMap<Character, Integer> set = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            if(set.get(s.charAt(i)) != null ){
                set.put(s.charAt(i), set.get(s.charAt(i)) + 1);
            }else{
            	set.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++){
            if(set.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Asia";
		System.out.println(nonRepeat(s));

	}

}
