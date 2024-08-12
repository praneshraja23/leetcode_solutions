/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast,slow;
        fast=slow=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
               do{
                    slow=slow.next;
                    length+=1;
                }
                while(slow!=fast);
                ListNode first;
                first=head;
                while(first!=fast){
                    first=first.next;
                    fast=fast.next;
                }
                return first;
            }
        }
        
      return null;
    }
}