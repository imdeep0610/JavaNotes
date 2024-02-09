package deep20;

public class MainClassForSingletonClass {
    public static void main(String[] args) {
        SingletonClass obj1=SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();
        SingletonClass obj3=SingletonClass.getInstance();
        // these all ref var will points towards only one obj i.e. instance
    }
}
