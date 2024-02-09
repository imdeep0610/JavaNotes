package deep12;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,5,10,45};
        int target=10;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int strt,int end){/* we put strt, end in argument
    bcoz for next fun call we have to snd new strt nd end*/
       if(strt>end){
           return -1;
       }
       int mid=strt+(end-strt)/2;
       if(arr[mid]==target){
           return mid;
       }
       if(arr[mid]>target){
         return  search(arr,target,strt,mid-1); /* make sure to return the result of a function
         call of the return type */
       }
       return search(arr,target,mid+1,end);//if(arr[mid]<target , strt=mid+1)
    }
}
