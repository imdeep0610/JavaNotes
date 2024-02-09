package deep15;

import java.util.ArrayList;

public class ReturnAnArrayList {
    public static void main(String[] args) {

        System.out.println(subSetReturn("","abc"));
    }
    static ArrayList<String>subSetReturn(String processed,String unprocessed){
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch=unprocessed.charAt(0);
        ArrayList<String>left=subSetReturn(processed,unprocessed.substring(1));
        ArrayList<String>ryt=subSetReturn(processed+ch,unprocessed.substring(1));
        left.addAll(ryt);
        return left;

    }
}
