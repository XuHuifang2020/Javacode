package Leetcode.LinkedList;

//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null

public class EntryNodeOfLoop
{
    public static ListNode entrynodeofloop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null || pHead.next.next == null) return null;
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;
        while(fast != slow)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = pHead;
        while(fast != slow)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**public ListNode EntryNodeOfLoop(ListNode pHead)
     {
     ListNode fast = pHead, slow = pHead;
     while (true) {
     if (fast == null || fast.next == null) return null;
     fast = fast.next.next;
     slow = slow.next;
     if (fast == slow) break;
     }
     fast = pHead;
     while (slow != fast) {
     slow = slow.next;
     fast = fast.next;
     }
     return fast;
     } */

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
        fifth.next = third;
        ListNode res;
        res = entrynodeofloop(first);
        System.out.println(res.val);
    }
}