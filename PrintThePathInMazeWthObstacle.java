package deep18;

public class PrintThePathInMazeWthObstacle {
    public static void main(String[] args) {
        boolean [][]board={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        mazeWthObstcle("",board,0,0);
    }
    static void mazeWthObstcle(String processed, boolean[][]maze, int row, int col){
        if(row==maze.length-1 && col==maze[0].length-1) {
        /* here we take col==maze[0].length-1 , we take o here bcoz each col has equal length
        otherwise we have to take maze[i].length-1
         */
            System.out.println(processed);
            return;
        }
        if(maze[row][col]==false){
           return;
        }

        if(row<maze.length-1){
            mazeWthObstcle(processed+'D',maze,row+1,col);
        }
        if(col<maze[0].length-1){
            mazeWthObstcle(processed+'R',maze,row,col+1);
        }
    }
}
