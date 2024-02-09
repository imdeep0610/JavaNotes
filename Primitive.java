package deep;

import java.util.Scanner;

public class Primitive {
    //datatype which cant DIVIDE further eg int cannot be breaked now
    public static void main(String[] args) {
       /* int roll;
        char abc='a';
        float marks=98.87f;
        double large=263748324;
        long extra=78325634477687879L;
        boolean check=false;*/
        Scanner input=new Scanner(System.in);
        int roll=input.nextInt();
        System.out.println("your roll no is "+roll);
        int a=234_00_00_00;
        System.out.println(a);
        //writing millions
       //6 String name=input.next();
        //it will take the next word only
        //String name=input.nextLine();
        //it will take the next line
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;

        System.out.println(sum);
    }
}
