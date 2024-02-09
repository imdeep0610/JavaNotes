package deep20;

public class OverrrrRide {
    int num;
    public OverrrrRide(int num){
      this.num=num;
    }
    @Override
    public String toString(){ // this is manual toString()
        return "OverRide";
    }
    public static void main(String[] args) {
      OverrrrRide obj=new OverrrrRide(54);
        System.out.println(obj);
        /* OUTPUT--deep20.OverrrrRide@7b23ec81
        here println() takes object inside it and it will call valueOf() and it will call obj.toString()
        here java check obj which we passed does have toString() , here it will go in the class which is
        the type of obj , i.e OverrRide class then it check in the class does it have toString()
         if no then it will use default method
        here every class extends Object class which has a toString() by default this will be called
        but if OverrRide class has its own toString() , this will be called , here child class
        toString() overrides parent class(Object) toString()

        But if OverrRide class has toString() as of line no 8-10 this will be executed
        */
    }
}

