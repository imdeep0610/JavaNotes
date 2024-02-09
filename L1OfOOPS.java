package deep20;

import java.sql.SQLOutput;
import java.util.Arrays;

public class L1OfOOPS {
    public static void main(String[] args) {
        //store 5 roll no
        int[] roll = new int[5];

        //store 5 name
        String[] name = new String[5];

        //data of 5 students :{roll, name , marks}
        int[] roll1 = new int[5];
        String[] name1 = new String[5];
        float[] marks = new float[5];

        /*if we want to store all 3 things in single entity use class
        here we create our own data type of Student type which have all these 3 properties
        , we can do this by using of class
         */
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        //[null,null,null,null,null]
        //Student kunal;
        //System.out.println(kunal); --     this will ask me to initialize kunal
        //here kunal is ref var having data type Student ans has 3 properties
        Student kunal = new Student();
        kunal.rNo=13;
        kunal.marks=90.3f;
        kunal.name="Deep";
        System.out.println(kunal.rNo);//0
        System.out.println(kunal.name);//null
        System.out.println(kunal.marks);//0.0
    }
}
    //create a class
    class Student{
        /*int[]rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];*/
        int rNo;
        String name;
        float marks;

    }

