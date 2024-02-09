package deep12;

public class PrintNto1 {
    public static void main(String[] args) {
       /* Nto1(5);
        OneToN(5);*/
        funBoth(8);
    }
    /*static void Nto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Nto1(n-1);
    }

    static void OneToN(int n){
        if(n==0){
            return ;
        }

         OneToN(n-1);
        System.out.println(n);
    }*/

    static void funBoth(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
