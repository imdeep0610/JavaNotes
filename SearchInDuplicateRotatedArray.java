package deep7;

public class SearchInDuplicateRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,6,0,1,1,2};
        int target=2;
        System.out.println(search(arr,target));
    }
    static int search(int[] num,int target){
        int pivot=findPivotWithDuplicate(num);
        //if we didnt find pivot means array is not rotated , thn do simple binary search
        if(pivot==-1){
            return binarySearch(num,target,0,num.length-1);
        }
        //but if pivot is found
        if(num[pivot]==target){
            return pivot;
        }
        if(target>=num[0]){
            return binarySearch(num,target,0,pivot-1);
        }
        else{
            return binarySearch(num,target,pivot+1,num.length-1);
        }
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
    static int binarySearch(int[] num,int target,int strt,int end){
        while(strt<=end) {
            int mid=strt+(end-strt)/2;
            if (num[mid] < target) {
                strt = mid + 1;
            } else if (num[mid] > target) {
                end = mid - 1;
            }
            else if(num[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
