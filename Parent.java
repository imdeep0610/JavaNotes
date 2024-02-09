package deep20;

public class Parent {
    //private double l; l can be accessed only in this file since its private
    double l;
    double h;
    double w;
    Parent(){
        super();/*this will refer to OBJECT CLASS , the parent of all the class in java
        thats why we can use super() in parent class also*/
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    //cube
    Parent(double side){
        this.h=side;
        this.w=side;
        this.l=side;
    }
    Parent(double l, double h, double w){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Parent(Parent old){
        this.h= old.h;
        this.l= old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the inheritance");
    }
}
