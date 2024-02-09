package deep25;

  public class SinglyLL {
     private Node head;
     private Node tail; // this extra var help us in inserting thing in constant time
     private int size;

    public SinglyLL() {
        this.size = 0;
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
    public void insertLast(int  val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val); //create a node
        tail.next=node; //putting the value
        tail=node; //connect the new node wth list
    }
    public void insertAtPartiIndex(int val , int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){  //insert at last node
            insertLast(val);
            return;
        }
        Node temp=head; //checking at head
        for(int i=1;i<index;i++){ /*if we need to insert t index=3 , we need to go till 2
        and we strt frm i=1 since head is at 0 index whic is checked in above line */
            temp=temp.next; // as we reaches just behind req node so next node will be target
        }
        Node node=new Node(val,temp.next); /* here we are taking the value and thn temp.next
        is value of index since we reach to pre node and temp.next is req node*/
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value; // this value is to be deleted
        head=head.next; // updating new head
        if(head==null){ /*here if list has only one element which we already deleted thn
        list must be empty and before that since it has only one element
        so it works as tail and head both so we must need to update tail=null*/
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){ // it means it has only one or no element in the list
            return deleteFirst();
        }
        Node secondLast=get(size-1); /* here by giving index no we call get() where we retrive the
        value of index which is second last*/
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int deletePartiIndex(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public Node findNode(int value){
        Node node =head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
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
}
