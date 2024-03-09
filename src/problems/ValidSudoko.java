package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {

    public boolean isValidSudoku(char[][] board) {
  int countCol =0;
  int countRow =0;
        for (int i = 0; i <9 ; i++) {
            Set<Character> setcol= new HashSet<>();
            Set<Character> setrow= new HashSet<>();

            for (int j = 0; j < 9; j++) {

                if (setcol.contains(board[i][j])&&board[i][j]!='.'){
                    return false;
                }
                if (setrow.contains(board[j][i])&&board[j][i]!='.'){
                    return false;
                }
                setrow.add(board[j][i]);
                setcol.add(board[i][j]);
            }
            Set<Character> setbox= new HashSet<>();
            for (int j = countRow; j <countRow+3 ; j++) {
                for (int k = countCol; k <countCol+3 ; k++) {

                    if (setbox.contains(board[j][k])&&board[j][k]!='.'){
                        return false;
                    }

                    setbox.add(board[j][k]);
                }
            }
            countRow=countRow+3;
            if(countRow==9){
                countRow=0;
                countCol=countCol+3;
            }
            
            
        }
        


        return true;
    }

}
