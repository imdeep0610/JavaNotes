package deep7;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class FirstAndLastOccur {
    public static void main(String[] args) {
        int [] arr={2,4,7,7,7,8,8,9,10,11};
        int target=7;
        int [] appu=searchRange(arr,target);
        System.out.println(appu);
    }
    static int[]searchRange(int[]num,int target){
        int[]ans={-1,-1};
        //check for frst occurance if target frst
        int strt=search(num,target,true);
        int end=search(num,target,false);
        ans[0]=strt;
        ans[1]=end;
        return ans;
    }
    static int search(int[] num , int target,boolean findStartIndex){
        //check for frst occurance of target
        int ans=-1;
        int strt = 0;
        int end = num.length - 1;

        while (strt <= end) {
            int mid=strt+(end-strt/2);
            if(num[mid]<target){
                strt=mid+1;
            }
            else if(num[mid]>target){
                end=mid-1;
            } else if (num[mid]==target) {
                //here target=mid , but ques is it may be not the strtng index or ending one
                  ans=mid;
               /*here if we pass true, then if will execute and its ans = strt value
                if we pass false , we get value of end
                */
                  if(findStartIndex){
                      end=mid-1;
                  }else{
                      strt=mid+1;
                  }
            }
        }
        //if nothing above execute thn ans =-1 value will be pass
        return ans;
    }
    }


