package deep26;

import java.util.List;

public class StrtngPointOfCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode strtngPointOfCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        //find the strtng point
          ListNode f=head;
          ListNode s=head;
          while(length>0){
              s=s.next;
              length--;
          }
          //keep moving both f and s till they meet,that is the strtng point
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return s;
    }
}




