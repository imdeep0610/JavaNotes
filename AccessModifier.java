package deep20;

public class AccessModifier {
    protected int sum;
   private int num;
   int gum; // here default access modifier
   //to access private var we use getters and setter method
    String name;
   int[] arr;/* for security reason allowng access data structure or internal variable is not
    good convention*/

    public AccessModifier() {
        this.sum=sum;//in the same class protected is accessible
    }

    public int getNum() { //GETTER METHOD , it get the value
        return num;
    }

    public void setNum(int num) { //SETTER METHOD , it set the value
        this.num = num;
    }

    public AccessModifier(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=arr;
        this.arr=new int[num];
    }
}
