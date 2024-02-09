package deep13;

import java.util.ArrayList;

public class ReturnListWithoutPassngItInArgument {
    public static void main(String[] args) {
        int[] arr={2,5,4,8,3,4,6,4,9};
        int tar=4;
        System.out.println(findAllIndex(arr,tar,0));
    }
    static ArrayList<Integer>findAllIndex(int[] arr, int tar,int index){
        ArrayList<Integer>list=new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        /*this will contain ans for that function call only
        the updated list will not pass to next/previous call
         */
        if(arr[index]==tar){
            list.add(index);
        }
        ArrayList<Integer>ansFromBelowCall=findAllIndex(arr,tar,index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }
}
