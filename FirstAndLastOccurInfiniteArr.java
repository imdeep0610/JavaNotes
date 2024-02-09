package deep7;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FirstAndLastOccurInfiniteArr {
    public static void main(String[] args) {
       int[] arr={3,5,7,9,90,100,
       130,140,160,};
       int target=90;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] num , int target){
        /*first find the range
        first strt with a box of size 2
        we are increasing the array size by doubling it
        like {2,4} ,then {5,6,8,10} t
         */
        int strt=0;
        int end=1;
        /*condition for the target to lie in range
        chck wth end one whether it is greater than end one or not
        if not again double the size
         */
        while(target>num[end]){
            int newStrt=end+1;
            //new end=previoud end+2*(size of previous array)
            //size of array=e-(s-1)=e-s+1
             end=end+ 2*(end-strt+1);
             //since we have to use old strt value so we cant changed it previously
             strt=newStrt;
        }
        return binarySearch (num,target,strt,end);
        /* here we basically find the range of array where our target is present
        and set the strt and end accrdng to it and pass to the binary search method
         */
    }
    static int binarySearch(int[] num, int target,int strt,int end){
        while(strt<=end){
        int mid=strt+(end-strt)/2;
            if(num[mid]<target){
                strt=mid+1;
            }
            else if(num[mid]>target){
                end=mid-1;
            } else if (num[mid]==target) {
                return mid;
            }
        }
        return -1;
    }
}
