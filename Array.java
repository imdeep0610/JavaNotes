package deep4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //datatype[] var_name=new datatype[size];
        int[] roll=new int[5];
        /*int[] roll=new int[3,5,6,4,5];
        data inside is of same type as declared
        new keyword is used to create object
         */

        /*int[] roll; declare array ,roll is getting stored in stack
        this happens at compile time
        roll=new int[6]; initialization , object is created in memory(heap)
        and each obj has its own ref variable
        this happens at runtime, this is called DYNAMIC MEMORY ALLOCATION
        objects allocated may not be in continuous manner
         */
        String[] arr= new String[8];
        System.out.println(arr[0]);
        //since we haven't given any value , default value is Null
        /*Array of primitives
       roll[0]=23;
        roll[1]=28;
        roll[2]=34;
        roll[3]=46;
        roll[4]=90;
        System.out.println(roll[4]);*/
        //we can take input from user as the length od array
        for(int i=0;i<roll.length;i++){
            roll[i]=in.nextInt();
        }
       for(int i=0;i<roll.length;i++) {
           System.out.println(roll[i]);
            /*for(int num : roll){  FOR-EACH Loop
            System.out.println(num + " ");
            }*/
           System.out.println(Arrays.toString(roll));//it will change array inot string
       }

       //Array of objects
        String[]  appu=new String[5];

        for(int i=0;i<appu.length;i++){
           appu[i]=in.next();
       }
        System.out.println(Arrays.toString(appu));
       appu[1]="Deepshikha Singh";
        System.out.println(Arrays.toString(appu));
    }
}
