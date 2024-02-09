package deep5;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = {12, 34, 56, 74, 87, 98};

        int target = in.nextInt();
        int ans = linearSearch(num, target);
        System.out.println(ans);
        System.out.println(linearSearch2(num, target));
        System.out.println(linearSearch3(num,target));
    }
    //search the array : return the index if item found, otherwise return -1


    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is =target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        //this line will execute if none of the return above executed
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        /*for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
               return element;
            }
        }*/
        for (int element : arr) {
            if (element == target) {
                return element;
            }


        }
        return Integer.MAX_VALUE;

    }
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is =target
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return above executed
        return false;
    }

}
