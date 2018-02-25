package week60.floodFill;

public class Solution {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		boolean[][] visited = new boolean[image.length][image[0].length];
		int oldColor = image[sr][sc];
		fill(image, visited, sr, sc, oldColor, newColor);
		return image;
    }
	
	private void fill(int[][] image, boolean[][] visited, int sr, int sc, int oldColor, int newColor) {
		image[sr][sc] = newColor;
		visited[sr][sc] = true;
		
		if(sr >= 1 && visited[sr - 1][sc] != true && image[sr - 1][sc] == oldColor) {
        	fill(image, visited, sr - 1, sc, oldColor, newColor);
        }
		if(sr < image.length - 1 && visited[sr + 1][sc] != true && image[sr + 1][sc] == oldColor) {
			fill(image, visited, sr + 1, sc, oldColor, newColor);
		}
		
		if(sc >= 1 && visited[sr][sc - 1] != true && image[sr][sc - 1] == oldColor) {
			fill(image, visited, sr, sc - 1, oldColor, newColor);
		}
		if(sc < image[0].length - 1 && visited[sr][sc + 1] != true && image[sr][sc + 1] == oldColor) {
			fill(image, visited, sr, sc + 1, oldColor, newColor);
		}
	}
}
