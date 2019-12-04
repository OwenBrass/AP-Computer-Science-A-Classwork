public class TicTacToeBoard
{
    private String[][] board = new String[3][3];
    
    public TicTacToeBoard(){
        board[0][0]="1";
        board[0][1]="2";
        board[0][2]="3";
        board[1][0]="4";
        board[1][1]="5";
        board[1][2]="6";
        board[2][0]="7";
        board[2][1]="8";
        board[2][2]="9";
    }
    
    public void enterX(int pos){
        int count = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               count++;
               if((count == pos)&&(!board[i][j].equals("X"))&&(!board[i][j].equals("O")))
                   board[i][j] = "X";
            }
        }
    }
    public void enterO(int pos){
        int count = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               count++;
               if((count == pos)&&(!board[i][j].equals("X"))&&(!board[i][j].equals("O")))
                   board[i][j] = "O";
            }
        }
    }
    
    public boolean checkRows(){
        for (int i=0; i<3; i++){
            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]))
                return true;
        }
        return false;
    }
    public boolean checkCols(){
        for (int j=0; j<3; j++){
            if (board[0][j].equals(board[1][j]) && board[0][j].equals(board[2][j]))
                return true;
        }
        return false;
    }
    public boolean checkDiags(){
        if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]))
            return true;
        else if (board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2]))
            return true;
        else
            return false;
    }
    public boolean checkForWinner(){
        if(checkDiags() == true || checkCols() == true || checkRows() == true)
            return true;
        else
            return false;
    }
    public String toString(){
        String ticTacToe = "";
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                ticTacToe += board[i][j]+" ";
            }
            ticTacToe += "\n";
        }
        return ticTacToe;
    }
}
