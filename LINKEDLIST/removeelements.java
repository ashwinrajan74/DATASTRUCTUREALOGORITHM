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
class removeelements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ArrayList<Integer> a=new ArrayList<>();
        while(temp!=null){
            if(temp.val!=val){
                    a.add(temp.val);
            }
            temp=temp.next;
        }
        ListNode d=new ListNode(0);
        ListNode c=d;
        for(int v:a){
            c.next=new ListNode(v);
            c=c.next;
        }
        return d.next;
    }
}
