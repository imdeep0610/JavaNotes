package deep7;
/*Ceiling of a no=smallest no in array i.e greater/equal to target element
arr=[3,5,7,13,16,17] , target=14, celining=16
 */
public class CeilingOfNo {
    public static void main(String[] args) {
        int[] arr={23,45,67,98,102,456};


        int tar=68;
        int ans=ceiling(arr,tar);

        System.out.println(ans);

    }
    static int ceiling(int[] num,int target) {
        //if target is greater than greatest no in array
        if(target>num[num.length-1]){
            return -1;
        }
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
                return mid;
            }
        }
                  return strt;
        }

}
