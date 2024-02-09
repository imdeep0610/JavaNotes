package deep11;

public class FindAPowerB {
    public static void main(String[] args) {
        int n=5;
        int base =3;
        int ans=1;
        while(n>0){
            if((n&1)==1) {
                ans = ans * base;
            }
            base=base*base;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
