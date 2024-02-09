package deep5;

public class EvenNoDigit {
    public static void main(String[] args) {
        int[] arr={45,6,9865,93459};
        System.out.println(findNum(arr));
        System.out.println(digit2(23456754));
    }
    static int findNum(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){ //here it takes frst data and snnd it to the even()
               count++ ;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noOfDigits=digit(num);
        if(noOfDigits%2==0){
            //return true;
        }
        return noOfDigits%2==0;
       // return false;
        }
        static int digit2(int num){
        return (int)(Math.log10(num))+1; // shortcut method to find no of digit
        }
    static int digit(int num){
        if(num<0){
            return num*-1;
        }
        if(num==0){
           return 1;
        }
       int count=0;
            while(num>0){
                    count++;
                num=num/10;
        }
        return count;
    }
}
