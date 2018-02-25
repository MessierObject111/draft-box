package com.amazon.findShortestMazePath;

public class TestMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindShortestMazePath fsmp = new FindShortestMazePath();
		int[][] maze = {
				{0, 1, 0, 0, 0},
				{0, 0, 0, 1, 0},
				{0, 1, 0, 1, 0},
				{0, 0, 0, 1, 0}};
		int x=0, y=0;
		fsmp.shortestPathLength(maze, x, y, 0);
		System.out.println(fsmp.shortest);

	}

}
