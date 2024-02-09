package deep;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        //WHILE Loop
        //If we didnt knew how many times loop is going to run , we use while loop
       /* Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       int count=1;
       while(count<=n){
           System.out.println(count);
           count++;
        }*/
        //FOR Loop
        //If we knew how many times a loop will run , we will use for loop
        //here count is initialze thn check the condition then print it and then increment it
       /* Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int count = 1; count<=n; count++) {
            System.out.println(count);
*/
      /*DO WHILE Loop
      do {
      body
      }while(condition);
       */

        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=10);


       /* Scanner in=new Scanner(System.in);
        System.out.println("Temp in celsius :");
        float tempC=in.nextFloat();
        float tempF=(tempC*9/5)+32;
        System.out.println("Temp in farenheit :" +tempF);
   */


        }
    }

