package deep20;

public class SingletonClass {
    /* Singleton class means we can only one object for class
    So if anyone ask obj of this class they have to manage wth only one object
     */
    private SingletonClass(){
        //make this constructor private bcoz no other frm diff class can use it for creating obj
    }
    private static SingletonClass instance;
    /*instance will be only obj , make it static so it doesnt depend on other obj since we didnt
    have other one
     */
    public static SingletonClass getInstance(){
        /*This method is static bcoz we can call it by class name only and this will chck
        whether this class have only one object/instance or not
         */
        if(instance==null){
            instance=new SingletonClass();
        }
        return instance;
    }
}

