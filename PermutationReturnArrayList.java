package deep16;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PermutationReturnArrayList {
    public static void main(String[] args) {
        ArrayList<String>ans=permutation("","abc");
        System.out.println(ans);
    }
    static ArrayList<String> permutation(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(processed);
            return list ;
        }
        ArrayList<String>ans=new ArrayList<>();
        char ch=unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++) {
            String frst = processed.substring(0, i);//here 0 is inclusive and i is exclusive
            String scnd = processed.substring(i, processed.length());
            ans.addAll(permutation(frst + ch + scnd, unprocessed.substring(1)));
        }
        return ans;
    }
}
