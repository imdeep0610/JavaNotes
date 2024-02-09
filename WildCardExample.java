package deep23;

import java.lang.reflect.WildcardType;
import java.util.Arrays;
/*Wildcard is upper bound of a particular data type like here we bound it to Number
so it can only contain data od datat type int float long etc*/
public class WildCardExample<T extends Number> {
    private Object[] data; /*prefer private array always in making classes
    we use Object type since it inherit all the types */
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public WildCardExample() {
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
        WildCardExample<Integer>list=new WildCardExample<>();
        //here we basically create any type of cutom array list wth the help of generic
        list.add(56);
        list.add(78);

        //  list.remove();
        System.out.println(list);//here we are sendng object in println() n, need to modify toString

    }
}
