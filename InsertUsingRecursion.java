package deep26;




public class InsertUsingRecursion {
    private Node head;
    private Node tail; // this extra var help us in inserting thing in constant time
    private int size;

    public InsertUsingRecursion(int size) {

        this.size = 0;
    }

    public InsertUsingRecursion() {

    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
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

    public void insert(int val,int index){
        head=insert(val,index,head);// strt wth the frst node i.e head
    }
    private Node insert(int val, int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next= insert(val,--index,node.next);
        return node;
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

