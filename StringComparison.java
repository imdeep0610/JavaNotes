package deep10;

public class StringComparison {
    public static void main(String[] args) {
        int a=10;
        String name="Deep";
        System.out.println(name);
        String b="Deep";
        System.out.println(b);
        b="Deepshikha";
        System.out.println(b);
        /*even after changing value of b value of name is not changed eventhough they points to same obj
        becoz here new obj "Deepshikha" created  but "Deep" still exist
        but b="Deep" will not exist here garbage collection work
         */
        System.out.println(name);

        //Comparison of Strings
        String c="Mona";
        String d="Mona";
        System.out.println(c==d);/*this will give true since obj is created in sting pool and
        both points towards same obj*/
        String e=new String ("Mona");
        String f=new String ("Mona");
        System.out.println(e==f);/*this will give false bcoz here due to new keyword obj is created in
        heap but outside the pool and points to two diff obj*/
        System.out.println(e.equals(f));// this will give true since it compare value only not address

    }
}
