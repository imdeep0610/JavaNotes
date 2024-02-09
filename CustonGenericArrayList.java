package deep23;

import java.util.Arrays;
/*https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
this is the documentation for generics
 */
public class CustonGenericArrayList<T> {
    private Object[] data; /*prefer private array always in making classes
    we use Object type since it inherit all the types */
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustonGenericArrayList() {
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){// we create add() for adding more spaces in ArrayList if it full
        if(isFull()){
            resize();
        }
        //after chcking the above condition the array we add the numin array by increasing its index
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];//double the size of aaray
        //copy the current items in the new resized array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;//after resizing and putting all pre data in temp we send it to original array
    }

    private boolean isFull() {
        return size== data.length;
    }

    public T remove(){
        T removed=(T) data[--size];/*size is also working as index no
        Here we cats data into type T bcoz here we are inserting type T variable into bigger type i.e
        Object so we need to type cast it */
        return removed;
        /* here actually data is not removed , here just array size is decreased by one
        here that index no is overrided , its present there
         */
    }
    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
        data[index]=value;
    }

    @Override
    public String toString() {  // here we modify toString() acdrng to us
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       CustonGenericArrayList<Integer> list=new CustonGenericArrayList<>();
       //here we basically create any type of cutom array list wth the help of generic
       list.add(56);
       list.add(78);
        CustonGenericArrayList<String> list1=new CustonGenericArrayList<>();
        list1.add("ABXGSDB");
        //  list.remove();
        System.out.println(list);//here we are sendng object in println() n, need to modify toString
        System.out.println(list1);
    }

}
