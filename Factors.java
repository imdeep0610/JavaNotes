package deep12;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        //factors(20);
       // factors1(20);
        factors2(20);
    }
   /* static void factors(int n){
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println(i + " ");
            }
        }
    }
    static void factors1(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i);
                }
                System.out.print(i + " " +n/i + " ");
                // this will give ans not in sorted order
            }
        }
    }*/
// here we get ans in sorted order
    static void factors2(int n){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i);
                }
                System.out.print(i + " ");
                list.add(n/i);
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
    }

    }


