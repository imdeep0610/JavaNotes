package deep12;

public class FactorialOfNo {
    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial((n-1));

    }
}
