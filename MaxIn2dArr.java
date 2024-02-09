package deep5;

import java.util.Arrays;

public class MaxIn2dArr {
    public static void main(String[] args) {
        int[][] arr= {
                {23,45,12,36,45},
                {76,45,98},
                {18,45},
                {76,90,87,14,16,12,17,190}
        };
        System.out.println(max(arr));
    }
    static int max(int [][] num){
        int max=Integer.MIN_VALUE;// Integer.MIN_VALUE= least value an integer can hold -2147483648
        System.out.println(max);
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++) {

                if(max<num[i][j]){
                    max=num[i][j];
                }

            }

        }
        return max ;
    }
}
