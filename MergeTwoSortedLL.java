package deep26;
//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLL {

    private Node head;
    private Node tail;
    private int size;
    public static MergeTwoSortedLL merge(MergeTwoSortedLL frst , MergeTwoSortedLL scnd){
        Node f=frst.head;
        Node s=scnd.head;

        MergeTwoSortedLL ans=new MergeTwoSortedLL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertFirst(f.value);
                f=f.next;
            }
            else {
                ans.insertFirst(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertFirst(f.value);
        }

        while(s!=null){
           ans.insertFirst(s.value);
        }
        return ans;
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
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value ,Node next) {
            this.value = value;
            this.next=next;
        }
    }

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value + " -> "); //dont confuse wth -> its just a symbol
            temp = temp.next; //now temp moves to next node
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        MergeTwoSortedLL frst=new MergeTwoSortedLL();
        MergeTwoSortedLL scnd=new MergeTwoSortedLL();
        frst.insertFirst(1);
        frst.insertFirst(12);
        frst.insertFirst(12);
        frst.insertFirst(15);
        scnd.insertFirst(1);
        scnd.insertFirst(10);
        scnd.insertFirst(12);
        scnd.insertFirst(15);
        scnd.insertFirst(19);

        MergeTwoSortedLL ans=MergeTwoSortedLL.merge(frst,scnd);
        ans.display();
    }

}
