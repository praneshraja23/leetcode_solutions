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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while(head.val==val){
            head=head.next;
            if(head==null){
                return head;
            }
        }
        ListNode node=head;
        ListNode ptr=node.next;
        ListNode ptr2=null;
        while(ptr!=null){
            
            if(ptr.val==val){
                node.next=ptr.next;
                ptr=ptr.next;
            }
        else{
           ptr=ptr.next;
           node=node.next;
           }
        }
        return head;
    }
}