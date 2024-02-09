package deep17;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombinationsOfPhoneNo {
    public static void main(String[] args) {
       letterCombo("","12");
    }
    static void letterCombo(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        int digit=unprocessed.charAt(0)-'0';//this will convert 2 into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
           letterCombo(processed+ch,unprocessed.substring(1));
        }
    }
}
