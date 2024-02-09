package deep3;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int num[]){
        num[0]=99;/*if we make the change to the object via this reference variable
        same object will be changed*/
    }
}

