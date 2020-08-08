package Leetcode.LinkedList;

//输入两个链表，找出它们的第一个公共节点

public class GetIntersectionNode
{
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if(headA == null || headB == null) return null;
        ListNode fast = headA;
        ListNode slow = headB;
        while(fast != slow)
        {
            fast = fast != null ? fast.next : headB;
            slow = slow != null ? slow.next : headA;
        }
        return fast;
    }
    public static void main(String[] args)
    {
        //
        ListNode first= new ListNode(1);
        ListNode second= new ListNode(3);
        ListNode third= new ListNode(5);
        ListNode forth= new ListNode(7);
        ListNode fifth= new ListNode(9);
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = null;

        ListNode a= new ListNode(2);
        ListNode b= new ListNode(4);
        ListNode c= new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = forth;

        ListNode res;
        res = getIntersectionNode(first, a);
        while(res != null)
        {
            System.out.print(res.val);
            res = res.next;
        }
    }
}
