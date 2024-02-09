package deep10;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        /* "-" will not work for string
        in Java + operator has some additional functionality
        This is called Operator Overloading (its not supported in java , exception for +
        for string concatination or joining)
         */
        System.out.println('a' + 'b');/*ans=195 it chnges into int and add its ASCII value
        when we use character it add ASCII value*/
        System.out.println("a" + "b");//ans=ab it will concat the value
        System.out.println('a' + 3);//100 here ASCII value of d is given
        System.out.println((char)('a'+3));//d
        System.out.println("a"+1);/* a1, here integer will converted to Integer that will
        call toString()   same as "a"+"1" */
        System.out.println("Deep" + new ArrayList<>());/* Deep[]
       ArrayList uses wrapper class which uses toString()*/
        System.out.println("Deep" + new Integer(56));/*Deep56 same above logic
        if its an object type its call toString()*/

      /*  System.out.println(new Integer(56) + new ArrayList<>());
        above line will throw error bcoz "+" operator is for primitive and
        for complex object any one should be of type String (so it will automatically chnages
        other into String)
       */
        System.out.println(new Integer(56) + " " + new ArrayList<>());
        // this will work bcoz in btwn "" is string
    }
}
