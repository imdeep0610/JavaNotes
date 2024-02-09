package deep13;

public class RotatedBinnarySearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        int tar=8;
        System.out.println(rotatedSearch(arr,tar,0,arr.length-1));

    }
    static int rotatedSearch(int[] arr, int tar, int strt,int end){
        if(strt>end){
            return -1;
        }
        int mid=strt+(end-strt)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if (arr[strt]<=tar) {
            if(tar>=arr[strt] && tar<=arr[mid]) {
                return rotatedSearch(arr, tar, strt, mid - 1);
            }
            else{
                return rotatedSearch(arr,tar,mid+1,end);
            }
        }
        else{
            if(arr[end]>=tar && arr[mid]<=tar){
                return rotatedSearch(arr,tar,mid+1,end);
            }
            else{
                return rotatedSearch(arr,tar,strt,mid-1);
            }
        }
    }
}
