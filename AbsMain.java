package deep22;

public class AbsMain {
    public static void main(String[] args) {
       /* AbsSon child=new AbsSon();
        child.career();*/
        AbsSon son = new AbsSon(34);
        son.career();
        son.normal();//normal method of  abstract parent class
       /* AbsDaughter daught=new AbsDaughter();
        daught.career();*/
        AbsDaughter daught = new AbsDaughter(23);
        daught.career();
        daught.partner();
        daught.normal();//normal method of abstract parent
        AbsParent dar=new AbsDaughter(25);
        //we can use ref var of abstract parent class eventhough we cannot create its obj
        dar.career();
        dar.partner();
        dar.normal();
        AbsParent.hello();//static method of abbstract class

        /* AbsParent pat= new AbsParent()
      we cannot create an obj of anstract class, it will ask to define the methods of abstract class
      bcoz then when we call pat.career() it will show error bcoz the method have no body
      and since class has an obj it can call its method
      @Override
            void career() {

            }
            @Override
            void partner() {

            }
        };
       */
    }

}
