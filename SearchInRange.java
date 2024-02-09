package deep5;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] num={45,87,98,543,985,93527,82435,764,9674};
        int tar=in.nextInt();
        System.out.println(search(num,tar,1,3));
    }
    static int search(int[] arr , int target,int strt,int end){
        if(arr.length==0){
            return -1;
        }
        /*int strt=2;
        int end=6;*/
        for(int i=strt;i<end;i++){
            int element=arr[i];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}
