package deep9;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class AllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corrIndex=nums[i]-1;
            if(nums[i]!=nums[corrIndex]){
                swap(nums,i,corrIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    public void swap(int[] nums, int frst, int sec){
        int temp=nums[frst];
        nums[frst]=nums[sec];
        nums[sec]=temp;
    }
}
