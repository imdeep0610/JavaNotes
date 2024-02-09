package deep;

public class Condition {
    public static void main(String[] args) {
        /*
        Syntax of if statement
        if(boolean expression T or F ) {
        body
        }
        else {
        do this
        }

        int salary=2457869;
        if(salary>10000){
            salary=salary+20000;
        }
        else {
            salary=salary+1000;
        }
        System.out.println("Salary : " +salary);
       */
        //Multiple if-else
        int salary=36578;
        if(salary>10000){
            salary+=1000;
        }
        else if(salary>20000){
            salary+=2000;
        }
        else if(salary>30000){
            salary+=3000;
        }
        else{
            salary+=4000;
        }
        System.out.println(salary);
    }

}
