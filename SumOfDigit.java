package deep12;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(12224));
    }
    static int sum(int n){
        if(n<1){
           return 0;
        }
        int temp=0;
        int m=n%10;
        temp+=m;

        //return temp+sum(n/10);
        return (n%10)+sum(n/10);
    }
}
