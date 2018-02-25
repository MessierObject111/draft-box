package array.minIndexSumOfTwoLists;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
		for(String name : s.findRestaurant(list1, list2)) {
			System.out.println(name);
		}
	}

}
