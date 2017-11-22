package other.fizzBuzz;

import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int n = 15;
		List<String> res = s.fizzBuzz(n);
		for(String str : res){
			System.out.println(str);
		}

	}

}
