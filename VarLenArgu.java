package deep3;

import java.util.Arrays;

/*Variable Length Arguments
When we create a method that takes variable no of arguments , it is VarLenArgs
used when we do not know how many inputs we are giving
 */
public class VarLenArgu {
    public static void main(String[] args) {
       fun(2,3,4,5,6,7,8); // var length args
        fun(); // we can call it by 0 arguments also
        mix(2,3,"Kunal","Ram"); // order of args is imp means int in place of int
    }
    //here argument is taking as array of integer
    static void fun(int ...v){  //it takes an array of integer/string
        System.out.println(Arrays.toString(v));
    }

    // Mixing of arguments
    static void mix(int a , int b , String ...v){  // var len args must be in last

    }
}
