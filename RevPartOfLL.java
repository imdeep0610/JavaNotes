package deep26;
//https://leetcode.com/problems/reverse-linked-list-ii/submissions/1167526120/
public class RevPartOfLL {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode reverseBetween(ListNode head, int left, int right) {
            if(left==right){
                return head;
            }
            //skip the frst left-1 element to reach the 1st element of req list
            ListNode current=head;
            ListNode prev=null;
            if(current!=null){
            for(int i=0;i<left-1;i++) {
                prev=current;
                current=current.next;
              }
            }
            //these two will be used to form the link betwn reversed list and left list
            ListNode last=prev;
            ListNode newEnd=current;

            //reverse between left and ryt
            ListNode next=current.next;
            if(current!=null){
            for(int i=0;i<right-left+1;i++) {
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null) {
                    next = next.next;
                }
              }
            }
            if(last!=null){
                last.next=prev;
            }
            else{
                head=prev;
            }
            newEnd.next=current;
            return head;
          }
        }

