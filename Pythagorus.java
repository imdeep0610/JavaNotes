package functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pythagorus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println(pythagorus(a,b,c));

    }
    static boolean pythagorus(int a ,int b,int c){
        int n=(a*a)+(b*b);
        int m=c*c;
        if(m==n) {
            return true;
        }
        return false;
           }
}
