package deep13;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;

public class ReturnTypeAsAnArrayList {
    public static void main(String[] args) {
      /*Var inside the argument is available for future function call
      but var inside the function works only for that function
       */
        int[] arr={2,5,4,7,4,12,4,8,9,4,10,0,4};
        int tar=4;
        /*here we can create separately list and add it by its name in findAllIndex instead of
        creating it when we are calling ans
         */
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>ans=findAllIndex(arr,tar,0,list);
        ArrayList<Integer>ana=findAllIndex(arr,tar,0, new ArrayList<>());
        System.out.println(ans);
        System.out.println(ana);
      //  System.out.println(findAllIndex(arr,tar,0,new ArrayList<>()));

    }
    static ArrayList<Integer> findAllIndex(int [] arr, int tar,int index, ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==tar){
            list.add(index);
        }
        return findAllIndex(arr,tar,index+1,list);
    }
}
