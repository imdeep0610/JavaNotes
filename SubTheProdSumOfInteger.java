package conditionsLopps;

 public class SubTheProdSumOfInteger {
    public static void main(String[] args) {
        int digit=234;
        System.out.println(integer(digit));
    }
    static int integer(int num){
        int temp=0;
        int sum=0;
        int sub=0;
        int prod=1;
        while(num>0) {
            temp = num % 10;
            num = num / 10;
            prod = prod * temp;
            sum += temp;
        }
        return sub=prod-sum;
    }
}
