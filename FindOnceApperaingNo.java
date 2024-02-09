package deep11;

import java.util.Arrays;

public class FindOnceApperaingNo {
    public static void main(String[] args) {
        int[] arr={2,4,1,2,5,6,4,1,5};
        //we have to find the no which comes only once
        System.out.println(appearCount(arr));
    }
    static int appearCount(int [] arr){
        //a^a==0

         int uni=0;
         for(int n:arr){
             /* here each no get ^ with and a^a=0,and after all calculation we get the no which
             is nt repeated
              */
             uni=uni^n;
         }

            return uni;
        }
    }


