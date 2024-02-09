package deep12;
////https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class StepsToReduceTo0 {
    public static void main(String[] args) {
        System.out.println(stepCount(12));
    }
    static int stepCount(int num){
        return helper(num,0);
    }
    static int helper(int num, int c){
        if(num==0){
            return c;
        }

        if(num%2==0){
           return helper(num/2,c+1);
        }
        else{
            return helper(num-1,c+1);
        }

    }
}
