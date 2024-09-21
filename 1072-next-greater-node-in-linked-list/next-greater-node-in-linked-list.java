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
    public int[] nextLargerNodes(ListNode head) {
        int count=0;
        ListNode t=head;
        while(t!=null)
        {   count+=1;
            t=t.next;
        }
        int[] ans=new int[count];
        ListNode current=head;
        int i=0;
        while(current!=null)
        { 
           ListNode temp=current.next;
           int val=current.val;
           int c=0;
           while(temp!=null)
           {
            if(temp.val>val)
            {
                ans[i++]=temp.val;
                c=1;
                break;
            }
            temp=temp.next;
           }

            if(c==0)
            {
                ans[i++]=0;
            }
            current=current.next;
        }
        return ans;
    }
}