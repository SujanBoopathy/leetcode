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
    public ListNode swapPairs(ListNode head) {
        ListNode current=new ListNode();
        ListNode prev=new ListNode();
        current=head;
        prev=null;
        while(current !=null && current.next!=null){
            ListNode temp=new ListNode();
            temp=current;
            current=current.next;
            temp.next=current.next;
            current.next=temp;
            if(prev==null){
                head=current;
            }
            else{
                prev.next=current;
            }
            prev=current.next;
            current=current.next.next;
        }
        return head;
    }
}
