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
class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;
        ListNode mid=null,slow=head,fast=head;
        while(fast!=null && fast.next != null){
            mid=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(slow);

        return merge(left,right);
        
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy= new ListNode();
        ListNode current=dummy;

        while(left != null && right != null){

            if(left.val<=right.val){
                current.next=left;
                left=left.next;
            }else{
                current.next=right;
                right=right.next;
            }
            current=current.next;
        }
        if(left==null) current.next=right;
        if(right==null) current.next=left;
    return dummy.next;
    }
}