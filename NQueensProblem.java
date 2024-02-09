package deep19;

public class NQueensProblem {
    public static void main(String[] args) {
        int n=4;
        boolean[][]board=new boolean[n][n];
        System.out.println(queens(board,0));//this sout shows no of count
    }
    static int queens(boolean[][]board,int row) {/* we can take col also in argument but each time it
    statrted wth 0 so no need to take it*/
        if (row == board.length) {
            /*if we are in last row that means we are about to go in base condition now
        its board.length bcoz last row = board.length-1 so base condition is after last row not in
        last row*/
            display(board);
            // when we display a board add a line so that next board starts after gap
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and chckng for every row and col
        for(int col=0;col<board.length;col++){
            //place the queen if it safe
            if(isSafe(board,row,col) ){
                board[row][col]=true;
                /* if after chcking we can place queen we pass true here , in that
                case it will check for next row*/
                count+=queens(board,row+1);
                /* here each time when base conditon satisfy means
                one possible ans found so count increases by 1 since queens(borad, row+1)
                return 1 each time*/
                board[row][col]=false;
                //here when we came out of that recursion call change it to original
            }
        }
        return count;
    }

     static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
         for (int i = 0; i < row; i++) {
             if (board[i][col]) {
                 // if board[i][col]= true , means Q is presen in above col,its not safe place
                 return false;
             }
         }
         // check in diagonal left side
         int maxLeft = Math.min(row, col);
         //max time we can go in left is min(row,col)
         for (int i = 0; i <= maxLeft; i++) {
             // here both row nd col decreases
             if (board[row - i][col - i]) {
                 return false;
             }
         }
         //check in diagonal right
         int maxRight = Math.min(row, board.length-col-1);
         // max reach is min(row, length of col)
         for (int i = 0; i <= maxRight; i++) {
             //in this case row is decreasing and col is increasing
             if (board[row - i][col + i]) {
                 return false;
             }
         }
         return true;
         //if non of the above condition satisy means we can place Q in that place
     }

    static void display(boolean[][]board){
        /*for every row in board
        here we put each row of board in variable row of boolean type
         */
        for(boolean[] row:board){
            /*for every element/col in that row is showing whether true or false
            here we are putting each cell in var element of boolean type
             */
            for(boolean element:row){
                if(element){//if element is true print Q
                    System.out.print("Q");
                }
                else {// if element is false print X
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    }

