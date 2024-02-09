package deep3;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);
        //System.out.println(ans(n));
    }

        static boolean isPrime(int n){
            if(n<=1){
                return false;
            }
            int c=2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;
            }
            /*if (c*c>n){
            return true;
            }
            return false;
             */
            return c*c>n;
        }
    }

