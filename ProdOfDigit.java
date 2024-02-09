package deep12;

public class ProdOfDigit {
    public static void main(String[] args) {
        System.out.println(product(3450));
    }
    static int product(int n){
        if(n%10==n){
           return n;
        }
      /*  int temp=1;
        int m=n%10;
        temp*=m;
        return temp*product(n/10);*/
        return (n%10)*(n/10);
    }
}
