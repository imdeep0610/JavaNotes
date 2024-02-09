package deep8;

import java.util.Arrays;

//here all elements is sorted, previous element<next element
public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{49,67,75,89},{91,94,98},{102,106}};
        int target=102;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        //may be matrix is empty for that
        int row=arr.length;
        int col=arr[0].length;
        if(row==1){
            return binarySearch(arr,target,0,0,col-1);
        }
        /*run the loop while two row are remaining
        we can do this by eliminating col wise also
         */
        int rStrt=0;
        int rEnd=row-1;
        int cMid=col/2;
        while(rStrt<rEnd-1){ // this is true it will have two rows
            /*here basically mid =index of the midpoint of midlle col
            thn we compare that mid value wth target
            1st condition : if tar>mid value , means we need to seach in lower part but
            we had to consisdered that row also since it has two more colwhich is unchecked
            here strt=mid
            2nd condition : tar<mid value , we had to check in upper part including that row
            here end=mid
             */
            int mid=rStrt+(rEnd-rStrt)/2;
            if (arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (arr[mid][cMid]<target){
              rStrt=mid;
            }
            else{
                rEnd=mid;
            }
        }
        /*now we have two rows
        check whether the target is in the col of 2 rows
        in the frst two condition we chck the middle col of that two row , we chck row 1 and row2
        value individually
         */
        if (arr[rStrt][cMid]==target){
            return new int[]{rStrt,cMid};
        }
        if (arr[rStrt+1][cMid]==target){
            return new int[]{rStrt+1,cMid};
        }
        //search in 1st half
        if(target<=arr[rStrt][cMid-1]){
            binarySearch(arr,target,rStrt,0,cMid-1);
        }
        //search in 2nd half
        if(target>=arr[rStrt][cMid+1] && target<=arr[rStrt][col-1]){
            binarySearch(arr,target,rStrt,cMid+1,col-1);
        }
        //search in 3rd half
        if(target<=arr[rStrt+1][cMid-1]){
            binarySearch(arr,target,rStrt+1,0,cMid-1);
        }
        //search in 4th half
        else{
            binarySearch(arr,target,rStrt+1,cMid+1,col-1);
        }
        return new int[]{-1,-1};
    }
    //search in the row provided in the column provided
    static int[] binarySearch(int[][] num , int target,int row,int cStrt,int cEnd){
        while(cStrt<=cEnd) {
            int mid=cStrt+(cEnd-cStrt)/2;
            if(num[row][mid]==target){
                return new int[]{row,mid};
            }
            if (num[row][mid] < target) {
                cStrt = mid + 1;
            } else  {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
