package deep20;

public class MainClassForInheritance {
    public static void main(String[] args) {
        Parent i=new Parent(4);
       // Parent j=new Parent(old1);
        System.out.println(i.l + " " + i.w + " " + i.h);

        Child k=new Child();
        System.out.println(k.h + " " + k.l + " " + k.weight);

        //here ref var is of parent class type but object is of child class type
        Parent m=new Child(2,3,4,5);
        System.out.println(m.w);//w is parameter of parent class
       /* System.out.println(m.weight); -this cannot be accessed
       bcoz it is the type of ref var (not the obj) that determines the member that can be accessed
       here ref var is of parent class type so member must be from parent class
        */
       /* InheritanceChild n=new Inhertance(2,3,4,5);
        System.out.println(n.weight);
        here ref var= child class , so we have access to child class var i.e weight
        but here obj is of parent class , i.e we have called the constructor of parent class
        so it has no idea about var of child class i.e weight
        */
    }
}
