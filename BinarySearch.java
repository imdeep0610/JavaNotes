package deep6;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-234,-67,0,34,67,89,90,234,5678};
        int tar=90;
        int ans=binarySearch(arr,tar);
        System.out.println(ans);

    }

    //return the index
    static int binarySearch(int[] num , int target){
        int strt=0;
        int end=num.length-1;
        while(strt<=end) {
           // int mid = (strt + end) / 2; may be strt+end exceeds the range of integer in java
            int mid=strt+(end-strt)/2; /*its the sanme this as above
            s+((e-s)/2) =(2s+e-s)/2 = (s+e)/2*/
            if (num[mid] < target) {
                strt = mid + 1;
            } else if (num[mid] > target) {
                end = mid - 1;
            }
            //else if(num[mid]==target){
            else{
                return mid;
            }
        }
        return -1;
    }
}
