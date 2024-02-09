package deep25;

public class SinglyLLMain {
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(10);
        list.insertFirst(30);
        list.insertFirst(76);
        list.insertFirst(12);
        list.insertLast(99);
        list.insertAtPartiIndex(100,2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deletePartiIndex(3));
        list.display();
        System.out.println(list.findNode(100));
    }
}
