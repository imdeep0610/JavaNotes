package deep16;

public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");


    }
    static void permutation(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
       for(int i=0;i<=processed.length();i++) {
           String frst = processed.substring(0, i);//here 0 is inclusive and i is exclusive
           String scnd = processed.substring(i, processed.length());
           permutation(frst + ch + scnd, unprocessed.substring(1));
       }
    }
}
