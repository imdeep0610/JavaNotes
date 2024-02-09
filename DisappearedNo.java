package deep9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class DisappearedNo {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
        List<Integer> ans=new ArrayList<>();
        for(i=0;i<nums.length;i++) {
            if (nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
    static void swap(int[]num,int frst,int sec){
        int temp=num[frst];
        num[frst]=num[sec];
        num[sec]=temp;
    }
}
