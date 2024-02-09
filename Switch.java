package deep2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();

        /*switch(fruit){
            case "Mango" :
                System.out.println("King of fruit");
                break;

            case "Apple" :
                System.out.println("Keeps the doctor away");
                break;

            case "Orange" :
                System.out.println("My favourite");
                break;

            default :
                System.out.println("Yummy");

        }*/

        //Enhanced switch
        switch(fruit){
           case "Mango" -> System.out.println("King of fruit");
           case "Apple" -> System.out.println("Keeps the doctor away");
           case "Orange" -> System.out.println("My fav");
           default -> System.out.println("Yummy");
        }

        //int day=in.nextInt();
        /*switch(day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                    System.out.println("Funday");
        }*/
       /* switch(day){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        System.out.println("Weekdays");
        break;
        case 6:
            case 7:
                System.out.println("Weekeknds");
                break;

        }*/

      // This doesnt need break condition
      /*  switch(day){
           case 1,2,3,4,5 -> System.out.println("Weekdays");
           case 6,7 -> System.out.println("Weekends");
        }*/

    }

}
