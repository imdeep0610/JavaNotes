package deep;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      //  float num=input.nextFloat();
        /*int num=input.nextFloat();
        This is wrong
         */
        //float num=input.nextInt();
       // System.out.println();
        //This is TYPE CASTING
        int num=(int)(0984.847f);
        System.out.println(num);

        //Automatic type promotion in expression
       // int a=257;
       // byte b=(byte)(a);
        /*here type conversion is not possible
        since max length of byte is 256
        So b=257%256=1
         */
       // System.out.println("b :" +b);

        //here byte is promoting to int in mid calculatiom
       /* byte f=40;
        byte g=50;
        byte h=100;
        int i=f*g/h;
        System.out.println("i =" +i);*/

        //here ascii value of A will be printed
        //Automatic Type conversion
       int number='A';
        System.out.println(number);
        System.out.println("намасте м");

        byte b=42;
        char c='a';
        short s= 1024;
        int i=40000;
        float f= 457.877f;
        double d=0.4677;
        double result=(f*b)+(i/c)-(d-s);
        //float+int-double=double
        System.out.println((f*b)+ " " + (i/c) + " " + (d-s) +" ");
        System.out.println(result);



    }
}
