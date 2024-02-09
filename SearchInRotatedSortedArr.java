package deep7;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

//Rotated
public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
       int[] arr={4,5,6,7,0,1,2};
       int target=0;
        System.out.println(search(arr,target));
    }

    static int search(int[] num,int target){
      int pivot=findPivot(num);
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
