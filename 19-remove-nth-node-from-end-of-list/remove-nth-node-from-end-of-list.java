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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode ptr=head;
        ListNode temp1,temp2;
        while(n!=0 && ptr!=null)
        {
            ptr=ptr.next;
            n--;
        }
        temp1=head;
        temp2=temp1;
        while(ptr!=null)
        {
            ptr=ptr.next;
            temp2=temp1;
            temp1=temp1.next;
        }
        if(temp1==head)
           return temp1.next;
        else
           temp2.next=temp1.next;
        return head;
    }
}