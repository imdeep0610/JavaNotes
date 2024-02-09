package deep23;

public class ObjectCloneHuman  implements Cloneable{
    int age ;
    String name;
    int[] arr;

    public ObjectCloneHuman(int age,String name) {
        this.name = name;
        this.age=age;
        this.arr=new int[]{3,4,5,6,7,8};
    }
   /* public ObjectCloneHuman(ObjectCloneHuman other){
        this.age=age;
        this.name=name;
    }*/
  //  @Override means clone() is overriding the clone() in Object class
    /*shallow copy
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        }*/
   public Object clone() throws CloneNotSupportedException{
       //deep copy
       ObjectCloneHuman twin=(ObjectCloneHuman)super.clone();// this is actually shallow copy

       //deep copy
       twin.arr=new int[twin.arr.length];
       for(int i=0;i<twin.arr.length;i++){
           twin.arr[i]=this.arr[i];
       }
       return twin;
   }
}
