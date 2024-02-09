package deep13;

import java.util.ArrayList;

public class LinearSearchWthRecursion {
    public static void main(String[] args) {
        int[]arr={2,5,6,12,8,0,86,34,0,46,0};
        int target=86;
        int tar=0;
        System.out.println(search(arr,target,0));
        System.out.println(searchFrmLast(arr,tar,arr.length-1));
        findAllIndex(arr,tar,arr.length-1);
        System.out.println(list);
    }
    static int search(int [] arr,int target,int index){

        if(index==arr.length-1) {
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
      /*  return arr[index]==target || search(arr,target,index+1) ;
      this will be used if we usedboolean as return type
       */
        return search(arr,target,index+1) ;
        }
        static int searchFrmLast(int[] arr,int target,int index){
         if(index==-1){
             return -1;
         }
            if (arr[index]==target) {
              return index;
            }
            return searchFrmLast(arr,target,--index);
            }

            //if we want to  return all the index which has our target
            static ArrayList<Integer> list=new ArrayList<>();
            static void findAllIndex(int[] arr, int target,int index){
                if(index==-1){
                    return;
                }
                if (arr[index]==target) {
                    list.add(index);
                    /*here each time target==arr[index] , value is added to the same list
                    each time list is not changed , its same like each time ref var is diff but
                    points towards same object
                     */
                }
                findAllIndex(arr,target,--index);
            }
            }




