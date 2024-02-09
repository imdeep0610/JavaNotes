package functions;

import java.util.Scanner;

public class PrimeNoBetwnTwoNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int u=in.nextInt();
        for(int i=l;i<=u;i++){
            if(prime(i)==true)
                System.out.println(i);
        }
    }
    static boolean prime(int l){
            for (int i = 2; i <=Math.sqrt(l); i++) {
                 if(l%i==0){
                    return false;
                 }
            }
              return true;
        }
    }

