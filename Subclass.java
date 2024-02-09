package deep21forAccessModifier;

import deep20.AccessModChild;
import deep20.AccessModifier;

public class Subclass extends AccessModifier {
    Subclass obj=new Subclass();
    int n=obj.sum;//protected is accessible in subclass of diff package
    AccessModifier obj1 =new AccessModifier();
    //int n=obj1.sum;-even the parent  class type ref var cannot access it outside the package in subclass
}
