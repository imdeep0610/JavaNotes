package deep9;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        inPlaceSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void inPlaceSort(int[] arr,int s,int e){
        if(e-s==1){
            return ;
        }
        int mid=(s+e)/2;//here we get the middle point of array
       inPlaceSort(arr,s,mid);
       inPlaceSort(arr,mid,e);
       mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int[]arr,int s , int mid,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //it may possble one of the array is not completed, cpy the remaining elements
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){//updating the new array
            arr[s+l]=mix[l];

        }
    }

}
