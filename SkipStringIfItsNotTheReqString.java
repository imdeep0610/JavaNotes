package deep15;

public class SkipStringIfItsNotTheReqString {
    public static void main(String[] args) {
        System.out.println(skip("GwenBenKevinTennyson"));
        System.out.println(skip("GwenBeKevinTennyson"));
    }
    static String skip( String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }

        if(unprocessed.startsWith("Be") && !unprocessed.startsWith("Ben")){
            //here condition is we have to skip Be only when if Ben is not present
            return skip(unprocessed.substring(2));
        }
        else{
            return unprocessed.charAt(0)+ skip(unprocessed.substring(1));
        }
    }

}
