package deep20;

import java.util.ArrayList;

public class MainForAccessModifier {
    public static void main(String[] args) {
        AccessModifier obj=new AccessModifier(10,"Kunal");
        // obj.num; this will show error since num is private in AcccessModifier class
       obj.getNum(); // but this method is public so we can get num value in it and thn use it
      int n=obj.gum;//gum access modifier is default , we can use it in same package diff class
        int m=obj.sum;//protected is accessible in same package diff class
    }
}
