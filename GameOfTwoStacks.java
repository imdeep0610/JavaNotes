package deep28;

import java.util.Arrays;

public class GameOfTwoStacks {
    public static int main(String[] args) {
        int [] a;
        int [] b;
        a=new int[]{2,7,4,5,6};
        b=new int[]{5,3,4,7};

        return twoStacks(10,a,b,0,0);
    }

    public static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if(sum>x){
          return count;
        }
        if(a.length==0 || b.length==0){
            return count;
        }
        //Arrays.copyOfRange()
        int ans1=twoStacks(x, Arrays.copyOfRange(a,1,a.length),b,sum,count+1);
        int ans2=twoStacks(x, a,Arrays.copyOfRange(b,1,b.length),sum,count+1);
         return Math.max(ans1,ans1);
    }
}
