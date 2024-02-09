package deep14;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,7,4,8,5,9,1,10};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int i,int j){
        if(i==0){
            return;
        }
        if(j<i) {
            if (arr[j] > arr[j + 1]) {
                //swapping
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr, i, j + 1);
        }
        else
        {
           bubbleSort(arr,i-1,0);
        }
    }
}
