package deep25;

public class DoublyLLMain {
    public static void main(String[] args) {

        DoublyLL list = new DoublyLL();
        list.insertFirst(89);
        list.insertFirst(79);
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(19);
        list.insertFirst(101);
        list.insertLast(99);

        list.insertPartiIndex(100,2);

        list.insertAfterPartiValue(79,45);
        list.display();


    }
}
