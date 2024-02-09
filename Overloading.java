package deep20;

public class Overloading {

    int sum(int a, int b){
        return a+b;
    }
    double sum(double a , int b){
        return a+b;//for this sum(2,3) will be called due to type casting a/c to return type
    }

    int sum(int a, int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Overloading obj=new Overloading();

        obj.sum(2,3);
        obj.sum(2,4,7);
        //obj.sum(2,4,5,7); show error
    }

}
