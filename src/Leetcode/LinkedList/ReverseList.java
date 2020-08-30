package Leetcode.LinkedList;

//输入一个链表，反转链表后，输出新链表的表头

public class ReverseList
{
    public static ListNode reverselist(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode cur = reverselist(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
    public static void main(String[] args)
    {
        //
        ListNode first= new ListNode(3);
        ListNode second= new ListNode(1);
        ListNode third= new ListNode(4);
        ListNode forth= new ListNode(2);
        ListNode fifth= new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = null;
        ListNode res;
        res = reverselist(first);
        System.out.println(res.val);
    }
}