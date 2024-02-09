package deep12;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(32,45));
        System.out.println(lcm(32,45));
    }
    static int gcd(int a , int b){
        if(a==0){ // gcd(0,42)=42
            return b;
        }
        return gcd(b%a,a); // gcd(remainder(b,a),a) , remainder(a,b)=b%a
    }
    static int lcm(int a , int b){
        return a*b / gcd(a,b); //a*b=lcm(a,b)*hcf(a,b)
    }

}
