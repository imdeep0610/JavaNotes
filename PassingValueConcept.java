package deep12;

public class PassingValueConcept {
    public static void main(String[] args) {
       fun(9);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        /*fun(n--);this will pass the value of n frst and thn subtract , so in each time n=5 will
        be passed for infinite time since n will never =0 in next fun call */
        fun(--n);// this will subtract frst thn pass the value so each time n value get decreased
    }
}
