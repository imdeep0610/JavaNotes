package deep9;
//https://leetcode.com/problems/missing-number/
import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missing(arr));
    }
    static int missing(int[] arr){
        int i=0;
        while(i< arr.length){
            int corrIndex=arr[i];
            //if it search for nth element of array which size is n
            if(arr[i]<arr.length && arr[i]!=arr[corrIndex]){
                swap(arr,i,corrIndex);
            }
            else {
                i++;
            }
        }
        for(i=0;i<arr.length;i++) {
            if (arr[i]!=i){
                return i;
            }
        }
        return arr.length;//this case is if [0,2,1] we are finding 3
    }
    static void swap(int[]num,int frst,int sec){
        int temp=num[frst];
        num[frst]=num[sec];
        num[sec]=temp;
    }
}
