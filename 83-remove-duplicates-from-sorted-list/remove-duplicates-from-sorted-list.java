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
    public ListNode deleteDuplicates(ListNode head) {
        
        return (head!=null)?modify(head):head;
    }
    public ListNode modify(ListNode node){
        if(node.next==null){
            return node;
        }
        ListNode temp=modify(node.next);
        if(node.val!=temp.val){
            node.next=temp;
        }
        else{
            return temp;
        }
        return node;
    }
}