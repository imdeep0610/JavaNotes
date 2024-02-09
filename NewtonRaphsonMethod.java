package deep12;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(sqRootNRM(37));
    }
    static double sqRootNRM(double n){
        double x=n;
        double root;
        while(true){
           root=0.5*(x+(n/x));
          if(Math.abs(root-x)<1){
              break;
          }
          else{
              x=root;
          }
        }
        return root;
    }
}
