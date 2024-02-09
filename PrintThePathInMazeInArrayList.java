package deep18;

import java.util.ArrayList;

public class PrintThePathInMazeInArrayList {
    public static void main(String[] args) {
        System.out.println(pathAddress("",3,3));
    }
    static ArrayList<String> pathAddress(String processed , int row, int col){
        if(row==1 && col==1){
           ArrayList<String>list=new ArrayList<>();
           list.add(processed);/* when one recursion call end and stored in this list nd
           in returning it snd its ans to local list ans*/
            return list ;
        }
        ArrayList<String>ans=new ArrayList<>();/* this is local list available for this fun() only
        but we return its ans to main() where main() took its ans nd print it*/
        if (row>1){
           ArrayList<String>dwn= pathAddress(processed+'D',row-1,col);
            ans.addAll(dwn);
        }
        if (col>1) {
            ArrayList<String>ryt=pathAddress(processed+'R',row,col-1);
            ans.addAll(ryt);
        }
        return ans;
    }
}
