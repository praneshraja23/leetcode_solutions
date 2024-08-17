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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k<=0){
            return head;
        }
        ListNode start=head;
        int size=1;
        while(start.next!=null){
          start=start.next;
          size++;
        }
        start.next=head;
        k=k%size;

        ListNode newend=head;
        for(int i=0;i<size-k-1;i++){
            newend=newend.next;
        } 
        head=newend.next;
        newend.next=null;
        return head;
    }
}