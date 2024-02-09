package deep3;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        String message =greet();
        System.out.println(message);
        int ans=sum();
        System.out.println(ans);

        //here passing the value
        int abc=sum2(32,54);
        System.out.println(abc);

        //passing the value as string
       // String secretMessage=myGreet("Deepshikha Singh");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=in.next();
        String secretMessage=myGreet(name);
        System.out.println(secretMessage);
    }

    //name in myGreet and name in secretMessage need not to be same
     static String myGreet(String name) {
        String message="Hello " +name;
        return message;
    }

    //Return the value
    static String greet(){
        String greet="How are you";
        return greet;
    }
    static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 1st no. : ");
        int num1=in.nextInt();
        System.out.println("Enter the 2nd no. : ");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }
    //Passing the value when you call in the method in main()
    static int sum2(int a , int b){
        int sum=a+b;
        return sum;
    }

}
