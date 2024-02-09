package deep20;

public class AccessModChild extends AccessModifier{

    public AccessModChild(int num, String name) {
        super(num, name);
    }
    AccessModChild a=new AccessModChild();
    int n= a.gum;// default is accessible in child class of same class
    int m=a.sum;//protected is accessible in same package subclass

    public AccessModChild() {

    }
}
