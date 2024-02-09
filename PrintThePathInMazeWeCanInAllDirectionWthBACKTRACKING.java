package deep18;

public class PrintThePathInMazeWeCanInAllDirectionWthBACKTRACKING {
    public static void main(String[] args) {
        boolean [][]board={
                {true,true,true},
                {true,true,true},
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
        /*this cell is in my path so I will set it as visited and marked it FALSE
        here we basically make the changes
         */
        maze[row][col]=false;
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
        /*When I am getting out of this recursion call ,I will remove the changes
        i.e marked the visited cell as not visited for another recursion call
        here we basically revert the changes made in this call
         */
        maze[row][col]=true;
    }
}
