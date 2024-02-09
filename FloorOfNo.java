package deep7;
//Floor Of No=greatest no which is smaller or = to the target
public class FloorOfNo {
    public static void main(String[] args) {
        int[] arr={23,45,67,98,102,456};
        int tar=20;
        int ans=floor(arr,tar);
        System.out.println(ans);
    }
    static int floor(int[] num,int target){
        //here if we demand no which is smaller than the smallest no then it return that is -1
        int strt=0;
        int end = num.length-1;
        while(strt<=end){
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
        return end;
    }
    }

