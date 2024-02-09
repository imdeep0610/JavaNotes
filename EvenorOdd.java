package deep11;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return ((n & 1)==1);
    }
}
