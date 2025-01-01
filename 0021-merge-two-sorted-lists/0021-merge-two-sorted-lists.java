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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
        return null;

        ListNode c=new ListNode(-101);
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode head=c;
        while(t1!=null && t2!=null)
        {
            if(t1.val<t2.val)//c ke pass t1 jayega
            {
                 c.next=t1;
                 c=t1;
                 if(t1!=null)
                 t1=t1.next;
                 c.next=null;
            }
            else//c t2 ke pass jayega
            {
                 c.next=t2;
                 c=t2;
                 if(t2!=null)
                 t2=t2.next;
                 c.next=null;
            }
        }
        while(t1!=null)
        {
            c.next=t1;
            c=t1;
            if(t1!=null)
            t1=t1.next;
            c.next=null;
        }
        while(t2!=null)
        {
            c.next=t2;
            c=t2;
            if(t2!=null)
            t2=t2.next;
            c.next=null;
        }
        return head.next;
    }
}