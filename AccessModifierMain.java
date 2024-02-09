package deep21forAccessModifier;

import deep20.AccessModifier;

public class AccessModifierMain {
    public static void main(String[] args) {
        AccessModifier a=new AccessModifier(45,"Deep");
        a.getNum(); /* here we are accessing private var num in diff package by getting its value in
        getNum() method which is public*/
      /* int n=  a.gum;-- default access modifier doesnt allowed outside package
      gum is defined in diff package
       */
    }

}
