package deep7;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/

/*Mountain array= an array in which no will increse and then decrease
also known as Bitonic Array {1,2,3,4,3,2,1} or {1,2,5,18,12,10}
 */
//we have to find the peak index
public class PeakInMountainArray {
    public static void main(String[] args) {
         int[] arr={2,4,6,8,13,15,12,9,5,1};
        System.out.println(peak(arr));
    }
    static int peak(int[] num) {
        int strt = 0;
        int end = num.length - 1;
        while (strt < end) { /*since loop brk condition is strt!=end and strt cant be greater than end
        so strt<end*/
            int mid = strt + (end - strt) / 2;
            if (num[mid] > num[mid + 1]) { /* this means that we are in descending prt of array and may be
            mid will be the ans so our new array should be in LHS with end=mid */
                end = mid;
            }
            if (num[mid] < num[mid + 1]) { /* here we are in ascending prt and since mid > mid+1
            so strt should be mid+1*/
                strt = mid + 1;
            }
        }/* in last strt=end and pointing towards the largest no
        strt and end try to find the peak value in above two checks so when both points towards
        same element that is the max value*/
        return strt; //here we can return end also since both are same
    }
}
