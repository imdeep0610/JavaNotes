package deep11;

public class SumOfEachRowOfPascalTriangle {
    public static void main(String[] args) {
        int n=6;
        /*sum of each row in pascal triangle=2 pe power n-1 (n-1 if we take r=0,1,2,...)
        a<<b=a* 2pe power b(a is the no and we left shift it b times)
         */
        int sum=1<<(n-1);
        System.out.println(sum);
    }
}
