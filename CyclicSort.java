package deep9;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] num){
        int i=0;
        while(i<num.length){
            int corIndex=num[i]-1;
            if(num[i]!=num[corIndex]){
                swap(num,i,corIndex);

            }
            else{
                i++;
            }
        }

    }
    static void swap(int[] arr,int frst,int sec){
        int temp=arr[frst];
        arr[frst]=arr[sec];
        arr[sec]=temp;
    }
}
