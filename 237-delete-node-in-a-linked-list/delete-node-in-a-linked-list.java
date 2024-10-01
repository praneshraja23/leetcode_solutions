/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node.next;
       
        while(temp!=null)
        {
            node.val=temp.val;
            if(temp.next!=null){
                node=temp;
            }
            temp=temp.next;
        }
        node.next=null;
    }
}