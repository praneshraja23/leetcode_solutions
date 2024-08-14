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
    public ListNode sortList(ListNode head) {
     if(head==null || head.next==null){
        return head;
     }
     ListNode mid=getMid(head);
     ListNode left=sortList(head);
     ListNode right=sortList(mid);

     return merge(left,right);
        
    }
    
    ListNode getMid(ListNode head){
        ListNode p;
        p=null;
        while(head!=null && head.next!=null){
            p=(p==null)?head:p.next;
            head=head.next.next;           
        }
        ListNode mid=p.next;
        p.next=null;
        return mid;
    }

     ListNode merge(ListNode list1,ListNode list2){
        ListNode head=new ListNode();
        ListNode tail=head;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        tail.next=(list1!=null)?list1:list2;
        return head.next;
    }
}