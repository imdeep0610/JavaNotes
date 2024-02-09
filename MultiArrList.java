package deep4;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        /*initialize the list
        if we didn't initialize , value of every single index is null
         */
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>()); //3 list has been added
        }
        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
