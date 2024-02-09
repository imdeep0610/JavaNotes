package deep12;

public class Recursion {
    public static void main(String[] args) {
      print(1);
    }
    static void print(int n){
        if(n==5){ /* this is called BASE CONDITION , if we didnt give this condition
        function calls happen again and againand this will exceed the limit of computer memory
        which gives STACK OVER FLOW ERROR */
            System.out.println(5);
            return;//means return to the function where it is called
        }
        System.out.println(n);/* here print n=1 and then call same function with diff argument
         print(1+1=2)*/
        print(n+1);/*This is tail recursion
        Since print(1) gives its ans and control goes to print(2), print(1) has nothing
        to do with print(1+1)= last staement of a function call*/
    }
}
