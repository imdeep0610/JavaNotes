package conditionsLopps;

import java.util.Scanner;

//No which is same even when it get reversed
public class PalindromeNo {
    public static void main(String[] args) {
        int temp=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int origNo=n;
        while(n>0){
            int a=0;
            a=n%10;
            temp=10*temp+a;
            n=n/10;
        }
        if(temp==origNo) {
            System.out.println("Its an Palindrome No");
        }
        else{
            System.out.println("Its not a palindrome no");
        }
    }


}
