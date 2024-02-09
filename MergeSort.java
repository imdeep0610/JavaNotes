package deep9;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;//here we get the middle point of array
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] ryt=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,ryt);
    }
    static int[] merge(int[] frst,int[] secnd){
        int[] mix=new int[frst.length+secnd.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<frst.length && j<secnd.length){
            if(frst[i]<secnd[j]){
                mix[k]=frst[i];
                i++;
            }
            else{
                mix[k]=secnd[j];
                j++;
            }
            k++;
        }
        //it may possble one of the array is not completed, cpy the remaining elements
        while(i<frst.length){
            mix[k]=frst[i];
            i++;
            k++;
        }
        while(j<secnd.length){
            mix[k]=secnd[j];
            j++;
            k++;
        }
        return mix;
    }
}
