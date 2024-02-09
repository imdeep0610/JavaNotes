package deep20;

public class ObjectClassDemo {
    int num;
   float gpa;
    public ObjectClassDemo(int num , float gpa) {
        this.num = num;
        this.gpa=gpa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

   /* @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }*/

    @Override
    //basically gives number representation of an object
    public int hashCode() {
       // return super.hashCode();
        return num; // here we change super.hashcode to num then now ans come as 34 in sout
    }

    @Override
    public boolean equals(Object obj) {
      /* return super.equals(obj);
        here java is confused to chck what num or gpa */
       return this.num==((ObjectClassDemo)obj).num;
       //here we specify to chck the value of num of both obj
    }

    public static void main(String[] args) {
        ObjectClassDemo obj=new ObjectClassDemo(34,65.5f);
        System.out.println(obj.hashCode()); //1523554304
        ObjectClassDemo obj1=new ObjectClassDemo(34,56.7f);
        System.out.println(obj1.hashCode()); /*2065951873 this no is dependend on obj not on no i.e 34
         return super.hashCode(); due to this line in hashCode() the diff hashcode id coming
         here diff hashcode identify diff obj is used
          After putting return num; it gives 34 in sout
          */

        //Equals
        ObjectClassDemo obj2=new ObjectClassDemo(34, 56.78f);
        ObjectClassDemo obj3=new ObjectClassDemo(46, 43.9f);

        /* if(obj2<obj3){
          sout("obj2 is less than obj3");
          here java get confuse whether to chck num of obj2 nd obj3 or gpa of both nd give error
        }
         */
        if(obj2==obj3){ //it checks the whether these ref var is pointing to same objects or not
            System.out.println("obj 2 is equal to obj3");
        }

        if(obj2.equals(obj3)){ // it checks the value inside obj is same or not
            System.out.println("obj 2 is equal to obj3");
            /* sout doesnt give any ans if in equals method return super.hashCode();
            is present
            return this.num==((ObjectClassDemo)obj).num; == this will give ans
             */

            //instanceof Operator
            ObjectClassDemo obj4=new ObjectClassDemo(76,98.45f);
            System.out.println(obj4 instanceof ObjectClassDemo);
            //if obj4 is an instance of that class it will give true or otherwise false
        }
    }
}
