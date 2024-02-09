package deep15;

public class SubSequence {
    public static void main(String[] args) {
           subSeq("","abc");
    }
    static void subSeq(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        subSeq(processed,unprocessed.substring(1));//this will ignore the frst ch of unprocessed
        subSeq(processed+ch,unprocessed.substring(1));/*this will update the processed
        string with frst character of unprocssed*/

    }
}
