package deep18;

public class PrintThePathInMazeWeCanInAllDirection {
    /*This program show stack over flow error prgrm is correct but we have to use backtarcking here
    bcoz in this case we are going to same place and this is never ending
    This problem is solved by BACKTRACKING
     */
    public static void main(String[] args) {
        boolean [][]board={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        allDirection("",board,0,0);
    }
    static void allDirection(String processed, boolean[][]maze,int row, int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(processed);
            return;
        }
        if(maze[row][col]==false){
            return;
        }
        if(row>0){
            allDirection(processed+'U',maze,row-1,col);
        }
        if(row< maze.length-1){
            allDirection(processed+'D',maze,row+1,col);
        }
        if(col< maze[0].length-1){
            allDirection(processed+'R',maze,row,col+1);
        }
        if(col>0){
            allDirection(processed+'L',maze,row,col-1);
        }
    }
}
