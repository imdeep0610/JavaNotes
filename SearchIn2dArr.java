package deep5;

import java.util.Arrays;

public class SearchIn2dArr {
    public static void main(String[] args) {
        int[][] arr= {
                {23,45,12,36,45},
                {76,45,98},
                {18,45},
                {76,90,87,14,16,12,17,19}
        };
        int target=90;
        int[] ans=search(arr,target); // format of return {i,j}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] num , int target){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){

                if(target==num[i][j]){
                    return  new int[]{i,j}; /*since array is not declared anywhere
                    we are using new keyword, basically we are creating obj here
                    return {i,j} = if it is declared earlier*/
                }
            }
        }
        return new int[]{-1,-1};
    }
}
