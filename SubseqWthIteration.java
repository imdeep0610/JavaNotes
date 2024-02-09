package deep15;

import java.util.ArrayList;
import java.util.List;

public class SubseqWthIteration {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
      List<List<Integer>>ans=subseq(arr);
      for(List<Integer>list :ans){
          System.out.println(list);
      }
    }
    static List<List<Integer>> subseq(int[] arr){/*list of list bcoz here at last we are returning
    a list which contains lot of list
    outer list has lots of internal list*/
        List<List<Integer>> outer= new ArrayList<>();/*this is outer list which will get
        returned at last*/
        outer.add(new ArrayList<>());//in 1st step empty list get added
        for(int num:arr){
            int newListSize=outer.size();/* []=1st list ; [1],[]=2nd list ; [1],[],[2],[1,2]
            so each time new internal list gets double the size of outer list*/
            for(int i=0;i<=newListSize;i++){
                List<Integer>internalList=new ArrayList<>(outer.get(i));/* outer.get(i) will give the copy of
                last outer loop to new internal loop*/
                internalList.add(num);
                outer.add(internalList);
            }
        }
        return outer;
    }
}
