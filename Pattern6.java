package deep11;

public class Pattern6 {
    public static void main(String[] args) {
    pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<2*n;i++){
            if(n>=i) {
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
             else{
                for (int s = 1; s <=i-n; s++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            }

        }
    }

