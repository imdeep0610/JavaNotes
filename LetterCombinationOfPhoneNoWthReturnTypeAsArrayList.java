package deep17;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNoWthReturnTypeAsArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=letterCombo("","23");
        System.out.println(list);
    }
    static ArrayList<String> letterCombo(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit=unprocessed.charAt(0)-'0';//this will convert 2 into 2
        ArrayList<String>ans=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(letterCombo(processed+ch,unprocessed.substring(1)));
        }
        return ans;
    }
}
