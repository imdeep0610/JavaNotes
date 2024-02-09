package deep26;
//https://leetcode.com/problems/linked-list-cycle/description/?source=submission-ac
public class LLCycle {

    class ListNode {
     int val;
      ListNode next;
     ListNode(int x) {
        val = x;
        next = null;
     }
 }
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
               ListNode temp=slow;
               int length=0;
               do{
                   temp=temp.next;
                   length++;
               }while(temp!=slow);
               return length;
            }
        }
        return 0;
    }
}
