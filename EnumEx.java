package deep24;

public class EnumEx  {

    //we use enum when we want fix group of constatnt
    enum Week implements EnumInterface{
        //in this enum type is Week , its always there where they are declared
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        /*enums are constant
        enum are public , static , and final
        since final we cant create child enum
         */
        Week() { /* constructor
        internally it works like
        public static final Week Monday()=new Week();*/
            System.out.println("Constructor called for " + this.toString());
            /*this will call all the constant , if we want individual constant we need to evoke
            constructor explicitly for ech one
             */
        }

        @Override
        public void hello() {
            System.out.println("Hello how are you");
        }
    }


    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        week.hello();
        for(Week day : Week.values()){ //values() gives the value of fetch data
            System.out.println(day);
        }
        System.out.println(week.ordinal()); /*ordinal() gives the position of the enum declaration
        i.e 0 here since its declared from Monday*/
    }
}
