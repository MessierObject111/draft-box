package week60.asteroidCollision;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int[] asteroidCollision(int[] asteroids) {
        //Pseudo code:
		List<Integer> asteroidsList = new LinkedList<Integer>();
		int i = 0;
		while((i+1) < asteroidsList.size() && hasSameDirection(asteroidsList.get(i), asteroidsList.get(i+1))){
			i++;
		}
        if(AllAsteroidsMovesTheSameDirection(asteroids)){
        	int[] result = new int[asteroidsList.size()];
        	for(int j = 0; j < asteroidsList.size(); j++) {
        		result[i] = asteroidsList.get(i);
        	}
            return result;
        }
    }
	
	private boolean hasSameDirection(int a, int b){
		return ((a > 0)&&(b > 0))||((a < 0)&&(b < 0));
	}
	
	private boolean AllAsteroidsMovesTheSameDirection(int[] asteroids) {
		if(asteroids.length <= 1) return true;
		boolean defaultDirection = asteroids[0] > 0;
		if(defaultDirection) {
			for(int i = 1; i < asteroids.length; i++) {
				if(asteroids[i] > 0){
					return false;
				}
			}
		}else{
			for(int i = 1; i < asteroids.length; i++) {
				if(asteroids[i] < 0){
					return false;
				}
			}
		}
		return true;
	}
}
