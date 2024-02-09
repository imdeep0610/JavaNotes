package deep;
import java.util.Scanner;
public class MaxNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Find the max number
                int num1=in.nextInt();
                int num2=in.nextInt();
                int num3=in.nextInt();
                /*int max=num1;
                if(num2>num1) {
                    max = num2;

                 if (num3 > num2) {
                        max = num3;
                    }
                }*/
       /* int max=0;
        if(num1>num2){
           max=num1;
        }
        else{
            max=num2;
        }
        if(num3>max){
            max=num3;
        }*/

        int max=Math.max(num3,(Math.max(num1,num2)));
        System.out.println(max);
    }
}