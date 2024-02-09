package deep7;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
            int[] arr={4,5,6,7,0,1,2};
            System.out.println(count(arr));
    }
    static int count(int[] num){
        int pivot=findPivot(num);
         return pivot+1;
    }
    static int findPivot(int[]num){
        int strt=0;
        int end=num.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            //4 cases here
            if(mid<end && num[mid]>num[mid+1]){
                return mid;
            } else if (mid>strt && num[mid]<num[mid-1]) {
                return mid-1;
            } else if (num[strt]>=num[mid]) {
                end=mid-1;
            } else if (num[strt]<=num[mid]) {
                strt=mid+1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicate(int[]num){
        int strt=0;
        int end=num.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            //4 cases here
            if(mid<end && num[mid]>num[mid+1]){
                return mid;
            } else if (mid>strt && num[mid]<num[mid-1]) {
                return mid-1;
            }
            //if elements at strt,mid, end are equal then just skip the  duplicates
            if(num[mid]==num[strt] && num[mid]==num[end]){
                //skip the duplicates
                /*Note:what if these elements at strt and end were the pivots
                check if strt is pivot*/
                if(num[strt]>num[strt-1]){
                    return strt;
                }
                strt++;
                //check if end is pivot
                if(num[end]<num[end-1]){
                    return end-1;
                }
                end--;
            } else if (num[strt]<num[mid] || num[strt]==num[mid] &&num[mid]>num[end]) {
                //above case cnfrm that pivot is in RHS
                strt=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
