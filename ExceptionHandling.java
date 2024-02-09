package deep23;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            divide(4, 0);
            //mimicing
            throw new Exception("just for fun");

        } catch (ArithmeticException e) {
            /*if try have arithmetic excetion it will call it otherwise the below catch will delivered
            Always put catch(Excetion e) below since it inherit all the excetion thn if its above
            the below condition will never delivered
             */
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        }
        try { // this part is manual exception created by user
            String name = "Kunal";
            if (name.equals("Kunal")) {
                throw new MyException("Name is kunal");
            }
        }catch(MyException e){
                System.out.println(e.getMessage());
            }

        finally { // thisnis used only once
            System.out.println("this will always execute whether above condition satisfy or not");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            /*here with throw keyword we say that this will give excetion
            and we need to mention throws above
             */
            throw new ArithmeticException("please do not divide by zero ");

        }
        return a / b;
    }
}
