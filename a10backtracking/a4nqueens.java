package backtracking;

public class a4nqueens {
    public static boolean isSafe(char board[][], int row, int col){
        // vertical up
        for(int i=row-1; i>=0; i-- ){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i=row-1, j = col-1; i>=0 && j >=0; i--,j-- ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++ ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void nqueen(char board[][] , int row){
        // base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        // column loop
        for(int i=0; i<board.length; i++){

            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                nqueen(board, row+1);  //function call
                board[row][i] = 'X';  // backtracking
            }
            

        }
    }

    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("________________");
    }

    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];

        // empty board
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }

        nqueen(board,0);
    }
}
