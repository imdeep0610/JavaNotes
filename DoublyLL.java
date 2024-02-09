package deep25;

import java.sql.SQLOutput;

public class DoublyLL {

   private Node head;
   int size;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
       if(head!=null){
           head.prev=node;
       }
       head=node;
    }

    public void insertLast(int val){
        Node node =new Node(val);
        Node last=head; // to check frm strt which is the last node
        node.next=null;
        if(head==null) {
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
             last=last.next;
           }
         last.next=node;
         node.prev=last;
        }

        public void insertPartiIndex(int val,int index){
            if(index==0){
                insertFirst(val);
                return;
            }
            if(index==size){  //insert at last node
                insertLast(val);
                return;
            }
            Node temp=head; //checking at head
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
            Node node=new Node(val,temp.next);
            temp.next=node;
            size++;
        }
        public void insertAfterPartiValue(int after, int val){
        Node p=findNode(after);
        if(p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        node.prev=p;
            if (node.next!=null) {
            node.next.prev=node;
            }
            }

    public Node findNode(int value){
        Node node =head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val + " -> ");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("Print in Reverse");
        while(last!=null){
            System.out.print(last.val +" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {

            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

       public Node(int value , Node next) {
            this.val = value;
            this.next=next;
        }
    }
}
