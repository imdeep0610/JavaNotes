package deep8;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr={{1,45,87,23,76},{90,75,123},{48,109,432,453,12345,98},{40,12}};
        int target=98;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] num, int target){
        for(int i=0;i<num.length;i++){
          for(int j=0;j<num[i].length;j++){
              if(num[i][j]==target){
                  return  new int[]{i,j};
              }
          }
        }
        return new int[] {-1,-1};
    }
}
