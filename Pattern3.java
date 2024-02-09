package deep11;

public class Pattern3 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
            //for(int j=n-i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
