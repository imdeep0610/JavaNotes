package deep7;
//https://leetcode.com/problems/find-in-mountain-array/
public class MinIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int tar=3;
        System.out.println(index(arr,tar));
    }
    static int index(int[]num,int target){
        /*here frst we get the peak value and then divide it in two array
        frst one =asc array and 2nd one descndng arry
        thn find our target in frst one if we find thn taht wouls be our ans since it is an ascending
        array and if we didnt find thn go in descending array
        note: target is not repeated in one part of array twice
         */
        int peak=peak(num);
        /*here strt=0 , end=peak bcoz we are finding in ascnd order and peak may be the ans*/
        int firstTry=orderAgnosticBs( num , target, 0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBs( num , target, peak+1,num.length-1);
    }
    static int peak(int[] num) {
        int strt = 0;
        int end = num.length - 1;
        while (strt < end) {
            int mid = strt + (end - strt) / 2;
            if (num[mid] > num[mid + 1]) {
                end = mid;
            }
            if (num[mid] < num[mid + 1]) {
                strt = mid + 1;
            }
        }
        return strt;
    }
    static int orderAgnosticBs(int[] num , int target, int strt,int end){
        //find whether array is asscending or descending
        boolean isAsc=num[strt]<num[end];
        while(strt<=end) {
            int mid=strt+(end-strt)/2;
            if(num[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (num[mid] < target) {
                    strt = mid + 1;
                } else if (num[mid] > target) {
                    end = mid - 1;
                }
            }else{
                if (num[mid] > target) {
                    strt = mid + 1;
                } else if (num[mid]<target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
