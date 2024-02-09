package conditionsLopps;

import java.util.Scanner;

public class Fcatorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fac(n));
    }
    static int fac(int n){
        int fac=1;
        for(int i=n;i>0;i--){
            fac=fac*i;
        }
        return fac;
    }
}
