package deep11;

public class ithBitOfNo {

    public static void main(String[] args) {
        int num=20;
        int k=2;
        System.out.println(bit(num,k));
        System.out.println(set(num,k));
        System.out.println(reset(num,k));
    }
    static int bit(int n,int k){ // find the kth bit whether its 0 or 1
        int m=0;
         m=(n&(1<<(k-1)))>>(k-1);
         /*(1<<(k-1))=a will work  thn n&a=b thn b>>(k-1)
         n&b is used bcoz a&1=a
          */
        return m;
    }
    static  int set(int n, int k){ // set the ith bit = set the ith bit as 1
        return (n|(1<<(k-1)));/* 1<<(k-1)=a=00010 , n|a=result its in decimal no
        basically it set the ith bit and return that no in decimal form*/

    }

    static  int reset(int n, int k){
        return n&(~(1<<(k-1)));
       /* reset the ith bit = set the ith bit as 0
       1<<(k-1)=a=00010 (let k=2 , here k is taken as whole 00010 total digit 5
         and k=2  kth digit =1 but in computer it woks as 1 is at 1st position)
         ~a=b= 11101 now we get o at our desired position n&b=result, result is in decimal no  */
    }

   /* static int rightMostSetBit(int n,int k){

    }*/
}
