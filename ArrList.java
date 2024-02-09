package deep4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list= new ArrayList<>();
        list.add(67);//add 67 in the list
        list.add(677);
        list.add(6);
        list.add(6877);
        list.add(6875);
        list.add(6907);
        System.out.println(list.contains(67));//check whether 67 is present in list or not
        list.set(0,23);//update at 0 index with 23
        list.remove(5);
        System.out.println(list);
        //input
        for(int i=0;i<5;i++){
           // list.add(in.nextInt());
            //get item at any  index
            System.out.println(list.get(i));//pass index here , list[index] syntax will not work here
        }
        //System.out.println(list);
    }
}
