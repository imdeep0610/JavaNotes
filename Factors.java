package conditionsLopps;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=Math.abs(n);i++){ //Math.abs gives absolute no
            if(n%i==0) {
                System.out.println(i + " ");
            }
        }
    }
    }

