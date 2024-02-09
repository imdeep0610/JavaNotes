package deep27;

public class DynamicStack extends CustomStack{
    //this stack size will never come to end
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            //double the size of array
            int[] temp=new int[data.length*2];

            //copy the previous data
            for(int i=0;i<data.length;i++){
               // temp[i]=data[i];
                System.arraycopy(data,0,temp,0,data.length);
            }
            data=temp;
        }
        //insert item
        return super.push(item);
    }
}
