package deep10;

import java.sql.SQLOutput;
import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name="  Deepshikha";
        System.out.println(Arrays.toString(name.toCharArray()));
        //it will change the string into character array

        System.out.println(name.toLowerCase());
        System.out.println(name);//above toLowerCase() doesnt change the original value
        System.out.println(name.indexOf('e'));//give me the frst index of e
        System.out.println(name.strip());//removes the extra spaces
        String ans="Deep is a good girl";
        System.out.println(Arrays.toString(ans.split(" ")));/*cut it diff wrd where it saw space
        Arrays is used here since it store it as a array and then toString() chnges it into string
        */
    }
}
