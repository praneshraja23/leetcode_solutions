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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode prev=mid,pres=mid.next,next=pres;
        while(pres!=null){
             if(next!=null){
              next=next.next;
              }
            pres.next=prev;
            prev=pres;
            pres=next;
        }
        ListNode first=head,second=prev;
        while(first!=mid){
            if(first.val==second.val){
                first=first.next;
                second=second.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}