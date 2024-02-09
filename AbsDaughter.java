package deep22;

public class AbsDaughter extends AbsParent {
    @Override
    void career() {
        System.out.println("I am a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Spiderman");
    }
    AbsDaughter(int age){
        //this.age=age;
        super(age);
    }
}
