package deep21forAccessModifier;

import deep20.AccessModifier;

public class Subclass2 extends AccessModifier {
    public static void main(String[] args) {
    Subclass2 obj=new Subclass2();
      int n=  obj.sum;/*Ref var must be of subclass if we want to access protected var
      in diff pack subclass*/
    }
}
