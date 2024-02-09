package deep23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ObjectCloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloneHuman kunal=new ObjectCloneHuman(34,"Kunal");
        /*the below line will create  clone of obj kunal it takes time
        ObjectCloneHuman twin=new ObjectCloneHuman(kunal);
        */
        /*so we use clone() in Object class for this , in java lang package there is
        an interface Clonable for this, we will implements it
         */
        ObjectCloneHuman twin=(ObjectCloneHuman)kunal.clone();
       // System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(kunal.arr));
        System.out.println(Arrays.toString(twin.arr));
        /* so if we do shallow copy it will change both kunal and its twin array since
        it actually denoting the kunal in case of object as we change arr[0]=100
        but if we do deep copy it will not affect the original one , changes ocuur
        in twin only
         */
    }
}
