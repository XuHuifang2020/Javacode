package Leetcode.LinkedList;

//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
//走a+nb步一定是在环入口
//第一次相遇时慢指针已经走了nb步

public class detectCycle
{
    public static ListNode detectCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(true)
        {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while(fast != slow)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
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
        fifth.next = third;
        ListNode res;
        res = detectCycle(first);
        System.out.println(res.val);
    }
}
