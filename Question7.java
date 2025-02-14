// Question link : https://leetcode.com/problems/valid-sudoku/description/

import java.util.*;
public class Question7{
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char num = board[i][j];

                if (num != '.') {
                    String rowCheck = num + " in row " + i;
                    String colCheck = num + " in col " + j;
                    String boxCheck = num + " in box " + (i / 3) + "-" + (j / 3);

                    if (!seen.add(rowCheck) || !seen.add(colCheck) || !seen.add(boxCheck)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        if(isValidSudoku(board)){
            System.out.print("This is valid sudoko");
        }else{
            System.out.print("Not valid");
        }
    }
}