package deep18;

public class CountingPathInMaze {
    public static void main(String[] args) {
        System.out.println(countPath(3,3));
    }
    static int countPath(int row, int col){
        if(row==1 || col==1){
            return 1;
        }

        int ryt=countPath(row,col-1);
        int dwn=countPath(row-1,col);
        return ryt+dwn;
    }
}
