package deep4;

import java.util.Arrays;

public class PassInFunction {
    public static void main(String[] args) {
        int[] nums={2,3,4,5};
        System.out.println(Arrays.toString(nums));
        //Here nums value get changed since arrays are mutable in java while strings are not
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
