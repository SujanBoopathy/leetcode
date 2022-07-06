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
        ListNode cur=new ListNode();
        cur=head;
        while(cur!=null){
            if(cur.next!=null){
                ListNode temp=new ListNode();
                temp=cur.next;
                cur.next=cur;
                cur=temp;                
            }
            else{
                break;
            }
            cur=cur.next.next.next;
        }       
        return head;
        
    }
}
