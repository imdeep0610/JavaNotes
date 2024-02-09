package conditionsLopps;

import java.util.Scanner;

public class SumOfEnteredNoTillEnter0 {
    public static void main(String[] args) {
        int n;
        int temp=0;
     do{
         Scanner in=new Scanner(System.in);
         n=in.nextInt();
         temp+=n;
     }while(n>0);
        System.out.println(temp);
    }
}
