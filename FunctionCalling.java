package deep12;

public class FunctionCalling {
    public static void main(String[] args) {
        /*first function to be called is main() in a program and get stored in stack memory
        till it executes its work, So last function to be removed from stack is main()
        A function remains in stack till its call is going on
        Here main() calls print1() so control goes to that function
        but main() is in stack since its execution is not completed
         */
        print1(1);
    }
    static void print1(int n){ // this function is called , it get stored in stack wth main()
        System.out.println(n);
        print2(2);//function calling another function?
    }
    static void print2(int n){  //print2() get stored in stack wth other two
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
        /* At last when print5() get stored in stack and execute its work it get removed from stack
        and control goes to function from where it is called
        Like this all function get removed from stack and last funtion to be removed is main()
        from stack
         */
    }
}
