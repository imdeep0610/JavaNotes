package deep3;

public class Scoping {
    public static void main(String[] args) {
        int a=10;  //initializing
        int b=20;
        String name="Deep";
       // System.out.println(num);
        /* whatever defined outside this block can be used inside
        but which is defined inside cant be used outside
        but which is initialized inside can be again initialized outside
        but what is in initialized outside cant be initialized inside
        same thing for loop also
         */

        //This is Block Scoping
        {
          //  int a = 78; already initialize outside the block hence we cant initialize it again
            //but can change the value
            a=78;  // this is updating
            //reassigning the original reference variable to some other value
            System.out.println(a);
            int c=99;
            //value initialized in this block will remain in this block only
            name="Shanu";
           // String name="Shanu";  this is wrong

            //Scoping in for loop
            for(int i=0;i<4;i++){
                System.out.println(i);  //we cant use this i outside the loop
                a=10000; // updating the value
               // int a=100;  initializing inside loop not posble
            }
        }
        int c=10; // initializing outside eventhough it is initialized inside
        System.out.println(a);
        //System.out.println(c); c cant be used outside the block
    }
    static void random(){
        //we can access the variable num only in this function even the argument
        //This is Functional Scoping
        int num=65;
        System.out.println(num);
    }
}
