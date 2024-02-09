package deep15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSeqOfStringWthDuplicateElements {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>>ans=DuplicateSubseq(arr);
        for(List<Integer>list :ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> DuplicateSubseq(int[] arr){
        Arrays.sort(arr);//we need sorted array since we can compare only adjacent element
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int strt=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            strt=0;
            //if my current and previous element is same thn strt=end+1
            if(i>0 && arr[i]==arr[i-1]) {
                strt = end + 1;
            }
            end=outer.size()-1;
            int newListSize=outer.size();
            for(int j=strt;j<newListSize;j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                    internal.add(arr[i]);
                    outer.add(internal);
            }
        }
        return outer;
    }
}
