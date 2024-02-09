package functions;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        int temp=0;
       for(int i=0;i<=n;i++){
             temp+=n;
        }
        return temp;
    }
}
