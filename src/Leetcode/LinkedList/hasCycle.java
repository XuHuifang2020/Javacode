package Leetcode.LinkedList;

//给定一个链表，判断链表中是否有环

public class hasCycle
{
    public static boolean hasCycle(ListNode head)
    {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != slow)
        {
            if(fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args)
    {
        //
        ListNode first= new ListNode(1);
        ListNode second= new ListNode(3);
        ListNode third= new ListNode(5);

        first.next = second;
        second.next = third;
        third.next = second;

        System.out.print(hasCycle(first));
    }
}