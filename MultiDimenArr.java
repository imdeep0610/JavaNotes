package deep4;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArr {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        /*1 2 3
           4 5 6
           7 8 9
         */
        /*adding no of rows is mandatory
        int[][] arr=new int[3][];

        int[][] arr={
                {1,2,3},
                {4,5},
                {7,8,9},
        };*/
        //input
        int[][] arr=new int[3][3];
        //System.out.println(arr.length); //it will give me length of row
        for(int row=0;row<arr.length;row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

            //output
           /* for(int row=0;row<arr.length;row++) {
                //for each col
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.println(arr[row][col] + " ");
                }
                System.out.println();
            }*/
       /* for(int row=0;row<arr.length;row++){
            //since every single individual element of outer array is an array itself
            System.out.println(Arrays.toString(arr[row]));
        }*/
        /*enhanced for loop
        here a is variable of array type since we need to store array in it
        all data of arr array is stored in var a
         */
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
