package deep23;

import java.util.Arrays;

public class CustomArrayList {
    /*ere problem wth this ArrayList is its only contain integer data
    This problem is solved by GENERICS
     */
    //we are creating our own ArrayList
    private int[] data; //prefer private array always in making classes
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){// we create add() for adding more spaces in ArrayList if it full
        if(isFull()){
            resize();
        }
        //after chcking the above condition the array we add the numin array by increasing its index
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];//double the size of aaray
        //copy the current items in the new resized array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;//after resizing and putting all pre data in temp we send it to original array
    }

    private boolean isFull() {
        return size== data.length;
    }

    public int remove(){
        int removed=data[--size];//size is also working as index no
        return removed;
        /* here actually data is not removed , here just array size is decreased by one
        here that index no is overrided , its present there
         */
    }
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {  // here we modify toString() acdrng to us
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(34);
        list.add(48);
        for(int i=0;i<14;i++){
            list.add(2*i);
        }
      //  list.remove();
        System.out.println(list);//here we are sendng object in println() n, need to modify toString
    }

}
