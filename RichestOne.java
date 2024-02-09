package deep5;

public class RichestOne {
    public static void main(String[] args) {

    }
    static int maximumWealth(int[][] accounts){
        /*per=row
        acc=col
         */
        int ans=Integer.MIN_VALUE;
       // for(int per=0;per< accounts.length;per++){
        for(int[] ints:accounts){
            int sum=0;
            //for(int acc=0;acc<accounts[per].length;acc++){
            for(int anInts : ints){
               // sum+=accounts[per][acc];
                sum+=anInts;
            }
            if(sum>ans){
                ans=sum;
            }
        }
           return ans;
        }
        }


