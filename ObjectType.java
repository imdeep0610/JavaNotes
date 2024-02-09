package deep10;

import java.util.Arrays;

public class ObjectType {
    public static void main(String[] args) {
        // here out is a variable of PrintStream type , its an class and it has an methosd called println
        System.out.println(56);//here println takes integer
        System.out.println("Deep");//here it takes String
        System.out.println(new int[] {2,4,6,7});//here it takes object type
        /*above method println is same for all but its argument is diff in each case
        basically here overloading happens (same method name with diff argumnt type)
        and println calls toString() each time , so basically it prints String in each case
         */
        System.out.println(Arrays.toString(new int[] {2,3,4,5}));//this will print String
        /* this will print correctly bcoz here in println() we are giving Object type argument
        so we have to mention which type of object is it , is it Array ,hashmap etc otherwise
        it prints some default value
        String + @ + hascode=I@5acf9800
        So by saying Arrays.toString() , we are sayng override toString() use toString() which is
        present in Arrays
        Override= parent and child class has same name of method and child one execute
         */

        String name=null;
        System.out.println(name);// it will print null bcoz if obj is null it will print null only

        System.out.println(78);
        //System.out.println(78.toString()); not possible change it into wrapper class
        Integer num=new Integer(78);
        //if we use wrapper class we have so many method
        System.out.println(num.toString());
    }
}
