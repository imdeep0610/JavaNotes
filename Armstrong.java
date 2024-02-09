package deep3;

import java.util.Scanner;

public class Armstrong { /* sum of cube of individual digit==
sum of all digit*/
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       /* int n=in.nextInt();
        System.out.println(arm(n));*/
        for(int i=100;i<1000;i++){ //print all 3 digit armstrong no
            if(arm(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean arm(int n) {
        int temp=0;
        int orig=n;
        while (n >0) {
            int s = n % 10;
            n=n/10;
             temp=temp+s*s*s;
        }
       /* if(temp==n){
            return true;
        }
        return false;*/
        return temp==orig;
    }
}
