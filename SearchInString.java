package deep5;

public class SearchInString {
    public static void main(String[] args) {
        String arr="Kunal Singh";
        char tar='K';
        System.out.println(search(arr,tar));


    }
    static boolean search(String str,char tar){
        if(str.length()==0){
            return false;
        }
        /*for(int i=0;i<str.length();i++){
            if(tar==str.charAt(i)){
                return true;
            }
        }*/
        for(char ch : str.toCharArray()){
            if(ch==tar){
                return true;
            }
        }
        return false;
    }
}
