package com.array.battleshipsOnABoard;

public class NumOfBattleships {
	public int countBattleships(char[][] board) {
        int height = board.length;
        int width = board[0].length;
        int sum = 0;
        for(int i=0; i< height; i++){
            for(int j=0; j<width; j++){
                if(board[i][j] == 'X'){
                    searchAndFlip(board, i, j);
                    sum++;
                }
            }
        }
        return sum;
    }
    private void searchAndFlip(char[][] board, int i, int j){
        while(i-1 >= 0 && board[i - 1][j] == 'X'){
            board[i - 1][j] = '.';
            i--;
        }
        while(i+1 <= board.length-1 && board[i + 1][j] == 'X'){
            board[i + 1][j] = '.';
            i++;
        }
        while(j-1 >= 0 && board[i][j - 1] == 'X'){
            board[i][j - 1] = '.';
            j--;
        }
        while(j+1 <= board[0].length-1 && board[i][j + 1] == 'X'){
            board[i][j + 1] = '.';
            j++;
        }
    }
}
