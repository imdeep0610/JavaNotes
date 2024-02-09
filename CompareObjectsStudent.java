package deep23;
//to compare two objects we have an interface Comparable
public class CompareObjectsStudent implements Comparable<CompareObjectsStudent> {
    int rollNo;
    float marks;
    public CompareObjectsStudent(int rollNo,float marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return marks + " " + rollNo;
    }

    @Override
    public int compareTo(CompareObjectsStudent o) { /*its the method of interface Comparable
    here logic for comparing is done*/
        System.out.println("in compare to");
        int diff=(int)(this.marks-o.marks);
        //here we provide whom to comapre marks or roll no
        //if diff=0 means both marks are equal and if neg rahul has more marks
        return diff;
    }
}
