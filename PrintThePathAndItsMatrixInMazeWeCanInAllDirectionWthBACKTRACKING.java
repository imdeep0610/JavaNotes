package deep18;

import java.util.Arrays;

public class PrintThePathAndItsMatrixInMazeWeCanInAllDirectionWthBACKTRACKING {
    public static void main(String[] args) {
        boolean [][]board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][]path=new int[board.length][board[0].length];
        allDirection("",board,0,0,path,1);
    }
    static void allDirection(String processed, boolean[][]maze,int row, int col, int[][]path, int step){
        /*here we crete an array and a variable step , in the array we put the step
        for ex DDRUURDD [1,2,3,4,5,6,7,8] like this
        so each step get stored in array
         */
        if(row==maze.length-1 && col==maze[0].length-1){
            path[row][col]=step;
            for(int[]arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        path[row][col]=step;
        maze[row][col]=false;
        if(row>0){
            allDirection(processed+'U',maze,row-1,col,path,step+1);
        }
        if(row< maze.length-1){
            allDirection(processed+'D',maze,row+1,col,path,step+1);
        }
        if(col< maze[0].length-1){
            allDirection(processed+'R',maze,row,col+1,path,step+1);
        }
        if(col>0){
            allDirection(processed+'L',maze,row,col-1,path,step+1);
        }
        maze[row][col]=true;
        path[row][col]=0;
        //bcoz after one recursion call step get started from 0
    }
}
