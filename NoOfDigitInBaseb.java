package deep11;

public class NoOfDigitInBaseb {
    /* 6 in decimal=1 digit
    6 in binary =110 = 3 digit
     */
    public static void main(String[] args) {
        int n=8;
        int base=2;
           /* n=n>>1;
            count++;*/
            int ans=(int)(Math.log(n)/Math.log(base))+1;
            System.out.println(ans);
    }
}
