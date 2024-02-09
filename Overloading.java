package deep3;

public class Overloading { //two function having same name can exist with different parameters
    public static void main(String[] args) {
        fun("Kunal" ,"Jiya");

        /*fun(); this will show error
        this is known as Ambuiguity
        method will not decide which one to run since it has no data
         */
    }

    static void fun(String ...v){
        System.out.println("I am a rockstar");
    }

    static void fun(int ...v){
        System.out.println("Happy bday to me");
    }

}
