package deep15;

import java.util.ArrayList;

public class PintASCIIValueOfCharacter {
    public static void main(String[] args) {
      asciiValue("","abc");
        System.out.println(asciiValue1("","ab"));
    }
    static void asciiValue(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return ;
        }
        char ch=unprocessed.charAt(0);
        asciiValue(processed,unprocessed.substring(1));
        asciiValue(processed+ch,unprocessed.substring(1));
        asciiValue("" +(ch+0),unprocessed.substring(1));
        /*ch+0=gives the asciii value of character
        "" + (ch+0) bcoz ch+0 gives integer value and we req string
         */
    }
    static ArrayList<String>asciiValue1(String processed, String unprocessed){
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch=unprocessed.charAt(0);
        ArrayList<String>left=asciiValue1(processed,unprocessed.substring(1));
        ArrayList<String>ryt=asciiValue1(processed+ch,unprocessed.substring(1));
        ArrayList<String>ascii=asciiValue1(""+(ch+0),unprocessed.substring(1));
        left.addAll(ryt);
        left.addAll(ascii);
        return left;

    }
}
