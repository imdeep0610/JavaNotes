package deep5;

import java.util.Scanner;

public class MinNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={2453,7563,967,978,98,657};



        System.out.println(min(arr));
    }
    static int min(int[] num){
        int min=Integer.MAX_VALUE;//max value an integer can hold
        for(int i=0;i<num.length;i++){

            if(min>num[i]){
                min=num[i];
            }
        }
        return min;
    }
}
