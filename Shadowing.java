package deep3;

public class Shadowing {
  //x is shadowed at line 11
    //lower level is overriding higher level
    static  int x=90; //this is available to all inside this class Shadow
    //to use it in inside psvm(object independent) we need to make x static
    //since we cant use obj dependend things inside obj independend things
    public static void main(String[] args) {
        System.out.println(x); //90
        int x; // declaring
       /*  System.out.println(x); error because it is not initialized
       scope begin when variable is initialized
        */


        x=40;  // initializing

        System.out.println(x); //40
        /*this is shadowing , using two variable with the same name
        within the scope that overlaps
         */
        fun();
    }
    static void fun(){
        System.out.println(x);// this will print 90 since fun() is outside the psvm block
    }
}
