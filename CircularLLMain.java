package deep25;

public class CircularLLMain {
    public static void main(String[] args) {

        CircularLL list = new CircularLL();
        list.insert(45);
        list.insert(23);
        list.insert(5);
        list.insert(3);
        list.insert(450);
        list.insert(231);
        list.display();
        list.delete(450);
        list.display();
    }
}
