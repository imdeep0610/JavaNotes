package deep4;

public class Max {
    public static void main(String[] args) {
        int[] arr={23,456,12,3456,98};
        int ans=maxRange(arr,1,3);
        System.out.println(ans);
    }
    /*static int max(int[] arr){
    //add  edge cases
    if(arr.length==0){
    return -1;
    }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
         return max;
    }*/
    static int maxRange(int[] arr,int strt,int end) {
        //edge cases
        if (end>strt){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max = arr[strt];
        for (int i = strt; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
            return max;

    }
}
