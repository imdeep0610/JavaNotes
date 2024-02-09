package deep4;

public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {56,87},
                {12,76,90},
                {18,97,88,07,76,50}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){ /*arr[i].length will make sure col iterate only of the
            length of that row*/
                System.out.println(arr[i][j]);
            }
            System.out.println();

        }

    }
}
