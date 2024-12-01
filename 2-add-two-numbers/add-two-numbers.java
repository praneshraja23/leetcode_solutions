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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2!=null)
        {
            return l2;
        }
        else if(l1!=null && l2==null)
        {
            return l1;
        }
        return sum(l1,l2,0);
    }
    public ListNode sum(ListNode node1,ListNode node2,int rem)
    {
        ListNode newNode;
        if(node1==null && node2==null)
        {
            if(rem==0){
               return null;
               }
            else{
               newNode=new ListNode(rem);
               newNode.next=null;
               return newNode;
               }
        }
        
        if(node1==null)
        {   int val=node2.val+rem;
            newNode=new ListNode(val%10);
            newNode.next=sum(node1,node2.next,val/10);
            return newNode;
        }
        if(node2==null)
        {   int val=node1.val+rem;
            newNode=new ListNode(val%10);
            newNode.next=sum(node1.next,node2,val/10);
            return newNode;
        }
        int val=node1.val+node2.val+rem;
        newNode=new ListNode((val%10));
        newNode.next=sum(node1.next,node2.next,(val/10));
        return newNode;
    }
}