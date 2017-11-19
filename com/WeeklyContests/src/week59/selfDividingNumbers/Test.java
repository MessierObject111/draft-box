package week59.selfDividingNumbers;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		List<Integer> res = s.selfDividingNumbers(0, 30);
		for(Integer i : res){
			System.out.println(i);
		}

	}

}
