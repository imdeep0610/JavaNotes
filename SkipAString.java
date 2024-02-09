package deep15;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skip("GwenBenKevinTennyson"));
    }
    static String skip( String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }

        if(unprocessed.startsWith("Ben")){
            return skip(unprocessed.substring(3));
        }
        else{
            return unprocessed.charAt(0)+ skip(unprocessed.substring(1));
        }
    }

}
