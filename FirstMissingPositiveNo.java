package deep9;
//https://leetcode.com/problems/first-missing-positive/submissions/
public class FirstMissingPositiveNo {
    public static void main(String[] args) {
      int[] arr={3,4,-1,1};
        System.out.println(frstMissPosNo(arr));
    }
    static int frstMissPosNo(int[] nums){
        int i=0;
        while(i<nums.length){

                int corIndex = nums[i] - 1;
                //for ignorng neg no
                if ( nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[corIndex]) {
                    swap(nums, i, corIndex);

                } else {
                    i++;
                }
            }
  //frst missing no
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
         return nums.length+1;
    }
    static void swap(int[] arr,int frst,int sec){
        int temp=arr[frst];
        arr[frst]=arr[sec];
        arr[sec]=temp;
    }
    }

