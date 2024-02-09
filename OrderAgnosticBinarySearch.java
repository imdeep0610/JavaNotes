package deep6;

public class OrderAgnosticBinarySearch {//we didn't knew whether array is in asscending or descending order

    public static void main(String[] args) {
     int[] arr={2567,1345,897,567,309,30,0,-234};
        int[] arr1={-2567,-1345,-897,-567,-309,30,0,234};
        int tar1=-309;
     int tar=-234;
     int ans=orderAgnosticBs(arr, tar);
        System.out.println(ans);
        System.out.println(orderAgnosticBs(arr1,tar1));
    }
    static int orderAgnosticBs(int[] num , int target){
        int strt=0;
        int end=num.length-1;
        //find whether array is asscending or descending
        boolean isAsc=num[strt]<num[end];
        while(strt<=end) {
            int mid=strt+(end-strt)/2;
            if(num[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (num[mid] < target) {
                    strt = mid + 1;
                } else if (num[mid] > target) {
                    end = mid - 1;
                }
            }else{
                if (num[mid] > target) {
                    strt = mid + 1;
                } else if (num[mid]<target) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
        }

