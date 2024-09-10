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
            int div=find(val1,val2);
            ListNode node=new ListNode(div);
            node.next=ptr1;
            ptr2.next=node;
            ptr2=ptr1;
            ptr1=ptr1.next;
        }
        return head;
    }
    public int find(int f,int s)
    {
        while(f>0 && s>0)
        {
            if(f>=s)
            {
                f=f%s;
            }
            else
            {
                s=s%f;
            }
        }
        if(s==0) return f;
        return s;
    }
}