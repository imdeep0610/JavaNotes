package deep22;

public abstract class AbsParent {
    /*we cannot have final abstract class bcoz it prevent class from inherited by others and
    in abstract inhertance matters
     */
    final int value;// we can create final var in abstract class by using it in constructor
    static int game;//we can have static variable in abstract class
    int age;// if we have abstract method, the class needs to be abstract
    AbsParent(int age){
        this.age=age; // this var age can be called in child class by super();
        this.value=354678; //final int var
    }

    /*we cannot create abstract constructor
    abstract AbsParent();*/

    //if we know methods of parents class needs tobe overriden thn make it abstract
    abstract void career();
    /* we cannot create obj of abstract class bcoz thn it will call these method which
    doesnt have body whic shows error
     */
    abstract void partner();
    /*every child class must override the abstract method of parent class since child class have
        to define their body
         */

    /*we cannot create abstract static methods bcoz we cannot override static method so
    whats the point of being static but we can create static method in abstract class
    and  we can call it directly*/
    static void hello (){
        System.out.println("Hii I am static method in abstract class");
    }

    void normal(){
        System.out.println("I am normal method in abstract class");
    }
}
