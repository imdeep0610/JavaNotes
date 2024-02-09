package deep20;

public class Child extends Parent {
    double weight;
    public Child(){
        this.weight=-2;
    }
    Child(Child other){
        //here we passed other obj of child class type
        super(other);
        /*here in super we are passing child class type
        this is same as ref var=parent class type and obj=child class and child class has access to all
        parent class var
         */
        weight=other.weight;
    }
    public Child(double l, double h, double w, double weight){
        super(l,h,w);/*it say call the parent class constructor having these argument
        used to initialize values present in parent class*/
        System.out.println(super.w);
        /*here super is used as this keywrd but it will access the var of super class only
        this can be used when both parent and child class have same var
        and in child constructor we want super class var of same name we use super
         */
        this.weight=weight;
        // super(l,w,h); we cannot write super class after child class
    }
}
