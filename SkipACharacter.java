package deep15;

public class SkipACharacter {
    public static void main(String[] args) {
        skip("","bbcavcda");
        System.out.println(skip1("abbapapababa"));
}

    static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) { // isEmpty tells us that the string has no cahracter
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            skip(processed, unprocessed.substring(1));
        /*substring(1) give all the character
            from index 1 to last
             here processed remains same empty but umprocessed cut the oth index character*/
        }
        else{
            skip(processed+ch,unprocessed.substring(1));
        }
    }
    static String skip1(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        char ch=unprocessed.charAt(0);
        if(ch=='a'){
            return skip1(unprocessed.substring(1));
        }
        else{
            return ch+ skip1(unprocessed.substring(1));
        }
    }
}


