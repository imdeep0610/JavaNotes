package deep12;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int  i=1;i<=n;i++) {
            System.out.println(i + " " +prime(i));
        }
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(Math.sqrt(n)>=c){
            if((n%c)==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
