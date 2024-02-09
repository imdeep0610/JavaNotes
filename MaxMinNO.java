package functions;

import java.util.Scanner;

public class MaxMinNO {
    public static void main(String[] args) {


    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    int max=max(a,b,c);
    int min=min(a,b,c);
        System.out.println(max);
        System.out.println(min);

}
       static int max(int a , int b , int c){
           int max=a;
           if(max<=b) {
               max = b;
             if (max <= c) {
                   max = c;
               }
           }
           return max;
       }

    static int min(int a , int b , int c){
        int min=a;
        if(min>=b){
            min=b;
        } else if (min>=c) {
            min=c;
        }
        return min;
    }

}

