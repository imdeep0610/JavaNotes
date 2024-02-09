package deep17;

public class ReturnCountOfLetterComboOfPhoneNo {
    public static void main(String[] args) {
       int ans= letterCombo("","123");
        System.out.println(ans);
    }
    static int letterCombo(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=unprocessed.charAt(0)-'0';//this will convert 2 into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count=count+letterCombo(processed+ch,unprocessed.substring(1));
        }
        return count;
    }
}
