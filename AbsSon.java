package deep22;

public class AbsSon extends AbsParent {
 /*every child class must override the abstract method of parent class since child class have
 to define their body
  */
    AbsSon(int age){
        super(age);
       // this.age=age;
    }
    @Override
     void career(){
     System.out.println("I am going to be a doctor");
 }

    @Override
    void partner(){
        System.out.println("I love myself, dont need any partner");
    }

}
