package deep12;

public class ReverseANo {
    public static void main(String[] args) {
        rev(1234);
        System.out.println(temp);
        System.out.println(rev1(2345));
    }
    static int temp=0;
    static void rev(int n){
        if(n==0){
          return ;
        }

        int rem=n%10;
        temp=10*temp+rem;
        rev(n/10);

    }
    static int rev1(int n){
        /* sometime we might need some additional variables in the argument
        in that case , make another function , here it is helper()
         */
        int digits=(int)(Math.log10(n))+1; // this gives the no of a digit
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
