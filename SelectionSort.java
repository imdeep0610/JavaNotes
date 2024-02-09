package deep9;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,8,10,2,6,4,0,-1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i< arr.length;i++){
         //find the max no in array and swap wth correct index
            int last =arr.length-i-1;//finding correct index
            int maxIndex=getMaxIndex( arr,0,last);
            swap(arr,maxIndex,last);
        }

    }
    static int getMaxIndex(int[] arr, int strt,int last){
        int max=strt;
        for(int i=1;i<last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int frst,int sec){
        int temp=arr[frst];
        arr[frst]=arr[sec];
        arr[sec]=temp;
    }

}
