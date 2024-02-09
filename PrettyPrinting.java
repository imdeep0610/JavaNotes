package deep10;

import java.sql.SQLOutput;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a= 456.1234f;
        System.out.printf("Formated number is %.2f" , a);
        // %.3f will give ans till 3 digit after decimal due to printf()

        System.out.println();
        System.out.printf("Pie : %.3f", Math.PI);
        //Math.PI will give value of pi
    }
}
