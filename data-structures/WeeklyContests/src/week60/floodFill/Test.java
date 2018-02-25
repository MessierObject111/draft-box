package week60.floodFill;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		Solution s = new Solution();
		s.floodFill(image, 1, 1, 2);
		for(int[] row : image){
			for(int col : row) {
				System.out.print(col);
			}
			System.out.println();
		}

	}

}
