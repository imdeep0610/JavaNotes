package deep26;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class RemoveDuplicateFrmSortedLL {
    private Node head;
    private Node tail; // this extra var help us in inserting thing in constant time
    private int size;

    public RemoveDuplicateFrmSortedLL(int size) {
        this.size = size;
    }

    public RemoveDuplicateFrmSortedLL() {

    }

    public void insertFirst(int val){
        Node node=new Node(val); // create a new node in which we insert value
        node.next=head; //take newly node next element as frst
        head=node;// after inserting new node will become head
        if(tail==null){
            tail=head;// means list has only one element
        }
        size+=1;
    }

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value + " -> "); //dont confuse wth -> its just a symbol
            temp = temp.next; //now temp moves to next node
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value , Node next) {
            this.value = value;
            this.next=next;
        }
    }

    public void deleteDup(){
        Node node=head;//strt checking frm head
        while(node.next!=null) {
            if (node.value==node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    public static void main(String[] args) {
       RemoveDuplicateFrmSortedLL list=new RemoveDuplicateFrmSortedLL();
        list.insertFirst(10);
        list.insertFirst(14);
        list.insertFirst(14);
        list.insertFirst(18);
        list.insertFirst(20);
        list.insertFirst(27);
        list.insertFirst(27);
        list.display();
        list.deleteDup();
        list.display();

    }
}
