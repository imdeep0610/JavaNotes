package deep12;

public class Palindrome {
    public static void main(String[] args) {
        int n=1123;
          palindrome(n);
          if(n==palindrome(n)){
              System.out.println(true);
          }
          else{
              System.out.println(false);
          }
    }
    static int palindrome(int n) {
        int digits = (int) (Math.log10(n)) + 1; // this gives the no of a digit
        return helper(n, digits);
    }
        static int helper(int n, int digits){
            if(n%10==n){
                return n;
            }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+(n/10);
    }
}
