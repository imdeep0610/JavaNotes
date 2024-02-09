package deep11;

public class MagicNo {
    /* Magic no is defined in form of power of 5 or sum of unique powers of 5
    eg= 1=1*5=5
    2nd=10 = 0*5 + 1*(5*5)
    4th=100- 0*5 + 0*(5*5) + 1*(5*5*5)
    3rd=011= 1*5 + 1*(5*5)
     */
    public static void main(String[] args) {
       int n=10;
        System.out.println(magicNo(n));
    }
    static int magicNo(int n){
        int ans=0;
        int base=5;
        while(n>0) {
            int last = n & 1; // this will give the last no i.e 110 & 1=0
            n = n >> 1; // 110>>1 =11
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
