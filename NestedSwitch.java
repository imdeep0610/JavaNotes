package deep2;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

       /* switch (empId){
            case 1:
                System.out.println("Deepshikha Singh");
                break;
            case 2 :
                System.out.println("Shanu Shubham Singh");
                break;
            case 3 :
            System.out.println("Rudra Pratap Singh");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management" :
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
                break;
            default :
                System.out.println("Enter correct ID");
        }*/

        //Enhance way
        switch (empId) {
            case 1 -> System.out.println("Deepshikha Singh");
            case 2 -> System.out.println("Shanu Shubham Singh");
            case 3 -> {
                System.out.println("Rudra");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter valid ID");
        }
    }
}
