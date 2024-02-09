package deep;

import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int count=0;
   int temp=0;
   int b=1;
   while(count<=n){
      int a=temp;
      temp=temp+b;
      b=a;
      System.out.println(temp);
      count++;
   }
    }
}
