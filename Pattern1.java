package deep11;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(5,6);
    }
    static void pattern(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
