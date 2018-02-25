import java.util.HashSet;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		String s = "aaaaaaaaaaa";
				
		String p = "aaaa";
		List<Integer> list = sol.findAnagrams(s, p);
		System.out.println(list.size());
		

	}

}
