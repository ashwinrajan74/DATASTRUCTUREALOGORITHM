/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class swapnode {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        size=size/2;
        ListNode temp1=head;
        for(int i=0;i<size;i++){
            int summa=temp1.val;
            temp1.val=temp1.next.val;
            temp1.next.val=summa;
            temp1=temp1.next.next;

        }

      return head;  
    }
}
