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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode ptr1=head.next;
        ListNode ptr2=head;
        while(ptr1!=null)
        {
            int val1=ptr1.val;
            int val2=ptr2.val;
            int div=0;
            if(val1<=val2)
            {
                div=val1;
            }
            else
            {
                div=val2;
            }
            div=find(val1,val2,div);
            ListNode node=new ListNode(div);
            node.next=ptr1;
            ptr2.next=node;
            ptr2=ptr1;
            ptr1=ptr1.next;
        }
        return head;
    }
    public int find(int f,int s,int div)
    {
        while(div>0)
        {
            if(f%div==0 && s%div==0)
            {
                return div;
            }
            div--;
        }
        return div;
    }
}