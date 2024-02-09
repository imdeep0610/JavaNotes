package deep16;

import java.util.ArrayList;

public class CountOfAns {
    public static void main(String[] args) {

        System.out.println(permutationCount("","abcdrfg"));
    }
    static int permutationCount(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;/*each time permutation counts end here and return 1 which get added in
            count */
        }
        int count=0;
        char ch=unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++) {
            String frst = processed.substring(0, i);//here 0 is inclusive and i is exclusive
            String scnd = processed.substring(i, processed.length());
           count=count+(permutationCount(frst + ch + scnd, unprocessed.substring(1)));
        }
        return count;
    }
}
