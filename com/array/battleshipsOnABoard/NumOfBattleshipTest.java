package com.array.battleshipsOnABoard;

public class NumOfBattleshipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumOfBattleships obj = new NumOfBattleships();
		char[][] board = {
				{'X', '.', '.', 'X'},
				{'.', '.', '.', 'X'},
				{'X', '.', '.', 'X'}
				};
		System.out.println(obj.countBattleships(board));

	}

}
