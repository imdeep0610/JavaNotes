package deep12;

public class SqOfANo {
    public static void main(String[] args) {
        int n=40;
        int dec=3;// till how much decimal point we want our ans if its not a perfect root
        System.out.printf("%.3f",sqRoot(n,dec));
        //printf is pretty printing
    }
     static double sqRoot(int n , int dec){
        int strt=0;
        int end=n;
        double root=0.0;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(mid*mid==n){
               return mid;
           } else if (mid*mid>n) {
               end=mid-1;
           }
           else{
               strt=mid+1;
           }
        }
        double incr=0.1;
        for(int i=0;i<=dec;i++){
           while(root*root<=n){
               root+=incr;
           }
               root-=incr;
           incr=incr/10;
            }

        return root;
     }
}
