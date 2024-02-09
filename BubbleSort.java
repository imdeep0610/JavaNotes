package deep9;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr={10,9,26,5,-1,-17,0,17,15};
      bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        //if no swap is occuring we didnt need to perform it
        boolean swap;
        //run the steps n-1 times
        for(int i=0;i< arr.length;i++){
            swap=false;
            //for each step, max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap condition
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            //if we didnt swap for a particular value of i , it means array is sorted hence stop thw program
            if(!swap) {
                break;
            }
        }
    }
}
