package deep11;

public class FindANoIsPowerOfTwoOrNot {
    public static void main(String[] args) {
    //if n& (n-1)==0  n  is power of 2
        int n=32;
        boolean ans=(n&(n-1))==0;
        if(n==0){
            System.out.println(false);
        }
        else {
            System.out.println(ans);
        }

    }
}
