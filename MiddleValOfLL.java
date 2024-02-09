package deep26;
//https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleValOfLL {


    public class ListNode {
      int val;

      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next; }
  }
  /*  public ListNode middleNode(ListNode head) {
         ListNode node=head;
         int length=0;
         while(node!=null){
             node=node.next;
             length++;
         }
         if(length%2==0){
            int index= (length/2)-1 ;
           return value(head,index);
         }
         else{
             int index=(length/2)-1;
             return value(head,index);
         }
    }
    public ListNode value(ListNode head,int index){

        ListNode node=head;
        for(int i=0;i<=index;i++){
            node=node.next;
        }
   return node;
        }*/

    public ListNode middleNode(ListNode head) {
          ListNode slow=head;
          ListNode fast=head;
          while(fast!=null && fast.next!=null){
              slow=slow.next;
              fast=fast.next.next;
          }
          return slow;
    }
    }

