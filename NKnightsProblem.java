package deep19;

public class NKnightsProblem {
    public static void main(String[] args) {
        int n=4;
        boolean[][]board=new boolean[n][n];
        knights(board,0,0,4);
    }

     static void knights(boolean[][] board, int row,int col,int noOfKnights) {
         if (noOfKnights==0) {
             display(board);
             System.out.println();
             return;
         }
         if(row== board.length-1 && col== board.length ){
             return;
         }

         if(col==board.length){
            knights(board,row+1,0,noOfKnights);
         }
         if (isSafe(board, row, col)) {
             board[row][col] = true;
             knights(board, row , col+1,  noOfKnights- 1);
             board[row][col] = false;
         }
         knights(board,row,col+1,noOfKnights);
     }
     static boolean isSafe(boolean[][]board,int row,int col){
        if(isValidCell(board,row-2,col-1)) {
            if (board[row-2][col-1]) {
                return false;
            }
        }
         if(isValidCell(board,row-1,col-2)){
             if(board[row-1][col-2]){
                 return false;
             }
         }
         if(isValidCell(board,row-2,col+1)){
             if(board[row-2][col+1]){
                 return false;
             }
         }
         if(isValidCell(board,row-1,col+2)){
             if(board[row-1][col+2]){
                 return false;
             }
         }
         return true;
        }
        //do not repeat yourself , hence create
     static boolean isValidCell(boolean[][]board,int row , int col){
        if(row>=0 && row<board.length && col>=0 && col< board.length){
            return true;
        }
        return false;
        }

    static void display(boolean[][]board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("K");
                }
                else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
