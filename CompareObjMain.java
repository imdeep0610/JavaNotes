package deep23;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class CompareObjMain  {
    //to compare two objects we have an interface Comparable
    public static void main(String[] args) {


        CompareObjectsStudent kunal = new CompareObjectsStudent(10, 89.45f);
        CompareObjectsStudent rahul = new CompareObjectsStudent(18, 76.98f);
        CompareObjectsStudent deep = new CompareObjectsStudent(19, 98.65f);
        CompareObjectsStudent shanu = new CompareObjectsStudent(16, 67.45f);

        if (kunal.compareTo(rahul) > 0) {//here we comapring two objects compareTo() is used
            System.out.println(kunal.compareTo(rahul));
            System.out.println("kunal has more marks");
            CompareObjectsStudent[] list={kunal,rahul,deep,shanu};
            System.out.println(Arrays.toString(list));
            Arrays.sort(list, new Comparator<CompareObjectsStudent>() {
                @Override
                public int compare(CompareObjectsStudent o1, CompareObjectsStudent o2) {
                    return (int)(o1.marks-o2.marks);
                }
            });
            System.out.println(Arrays.toString(list));
        }
    }
}
