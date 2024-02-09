package deep9;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        int[] ans=mismatch(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mismatch(int[] nums){
        int i=0;
        while(i< nums.length){
            int corrIndex=nums[i]-1;

            if(nums[i]!=nums[corrIndex]){
                swap(nums,i,corrIndex);
            }
            else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++) {
            if (nums[i]!=i+1){
                return new int[]{i+1,nums[i]};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[]num,int frst,int sec){
        int temp=num[frst];
        num[frst]=num[sec];
        num[sec]=temp;
    }
    }


