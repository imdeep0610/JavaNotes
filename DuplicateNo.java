package deep9;
//https://leetcode.com/problems/find-the-duplicate-number/

public class DuplicateNo {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int corIndex=nums[i]-1;
                if(nums[i]!=nums[corIndex]){
                    swap(nums,i,corIndex);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
           return -1;
    }
    static void swap(int[] arr,int frst,int sec){
        int temp=arr[frst];
        arr[frst]=arr[sec];
        arr[sec]=temp;
    }
    }


