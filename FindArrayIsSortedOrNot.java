package deep13;

public class FindArrayIsSortedOrNot {
    public static void main(String[] args) {
        int [] arr={2,5,8,10,11,1};
        System.out.println(compare(arr,0));
    }
    static boolean compare(int [] arr , int index){
  /* here the array used in each recursion call is same
  since in 1st call arr[0]= ref var , in 2nd call arr[1]=ref var
  so in each case ref var changes but points towards same object
  if in any recursion call if we modify array it changes for all recursion call
  since we are chngng the object
   */
        if(index==arr.length-1){
            return true;
        }
           /* if(arr[index]>arr[index+1]){
                return false;
        }*/
        return arr[index]<arr[index+1] && compare(arr,index+1);
    }

}
