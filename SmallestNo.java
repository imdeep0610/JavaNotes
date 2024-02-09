package deep7;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestNo {
    public static void main(String[] args) {
        char[] arr={'a','d','g','i','k'};
        char tar='m';
        char ans=Small(arr,tar);

        System.out.println(ans);

    }
    static char Small(char[] num,char target) {
        int strt = 0;
        int end = num.length - 1;

        while (strt <= end) {
            int mid=strt+(end-strt/2);
            if(num[mid]<target){
                strt=mid+1;
            }
            else if(num[mid]>target){
                end=mid-1;
            }
        }
        /*here strt!=0 since its updated , and in this condition we have to return
        the first char in arr
        for this - strt%arr[arr.length]
         */
        return num[strt% num.length];
    }

}
