package deep26;
//https://leetcode.com/problems/reverse-linked-list/
public class RevLL {
 private int size;
  private ListNode head;
  private ListNode tail;
   /* public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }*/
    public void reversetListRec(ListNode node) {

        if(node==tail){
          tail=head;
          return;
      }
        reversetListRec(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }



//without recursion
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
        return prev;
    }

}
