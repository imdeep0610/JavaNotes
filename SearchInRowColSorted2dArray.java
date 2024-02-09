package deep8;

import java.util.Arrays;

public class SearchInRowColSorted2dArray {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{15,25,35,45},{28,31,37},{40,52}};
        int target=35;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        int i=0;
        int j=arr[i].length-1;
        while (i<=j){
            if(arr[i][j]==target){
                return new int[]{i,j};
                /*here we are strtng wth last col of frst row and compare it
               basically we try to reduce rows and col
                 */
            } else if (arr[i][j]<target) {
                i++;
            } else if (arr[i][j]>target) {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}
