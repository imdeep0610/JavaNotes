package deep18;

public class PrintThePathInMaze {
    public static void main(String[] args) {
       pathAddress("",3,3);
    }
    static void pathAddress(String processed ,int row, int col){
        if(row==1 && col==1){
            System.out.println(processed);
            return ;
        }
        if (row<=4){
         pathAddress(processed+'D',row-1,col);
        }
        if (col<=4) {
         pathAddress(processed+'R',row,col-1);
        }
    }
}
