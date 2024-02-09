package deep10;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n=in.next();
        System.out.println(palindrome(n));
       /* String orig=n;
        String ans="";
        for(int i=n.length()-1;i>=0;i--){
            char ch=n.charAt(i);
             ans+=ch;
        }
        if(orig.equals(ans)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }*/
    }
    static boolean palindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char strt=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if (strt!=end){
               return false ;
            }
            }
        return true;
        }

    }

