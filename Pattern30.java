package deep11;

public class Pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j+ "");
            }
            for(int j=2;j<=i;j++){//2 to till row no
                System.out.print(j);
            }
            System.out.println();

            }


       }

        }




