package conditionsLopps;

import java.util.Scanner;

public class SumOfNegNoPosOddNoNdEvenNo {
    public static void main(String[] args) {
        int evenSum=0;
        int oddSum=0;
        int negSum=0;
        int n;
        do{
            Scanner in=new Scanner(System.in);
            n=in.nextInt();
            if(n%2==0 && n>0){
                 evenSum+=n;
            } else if (n%2!=0 && n>0) {
                oddSum+=n;
            }
            else{
                negSum+=n;

            }

        }while(n!=0);
        System.out.println("Sum of all even no : " +evenSum);
        System.out.println("Sum of all odd no : " +oddSum);
        System.out.println("Sum of all neg no : " +negSum);
    }
}
