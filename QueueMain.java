package deep27;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(34);
        queue.insert(45);
        queue.insert(98);
        queue.insert(19);
        queue.insert(3);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println();
        CircularQueue circle=new CircularQueue(5);
        circle.insert(34);
        circle.insert(45);
        circle.insert(98);
        circle.insert(19);
        circle.insert(3);
        circle.display();
        System.out.println(circle.remove());
       circle.insert(133);
        circle.display();
    }
}
