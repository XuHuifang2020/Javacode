package Leetcode.LinkedList;

public class MergeList
{
    public static ListNode Merge(ListNode list1,ListNode list2)
    {
        ListNode cur = new ListNode(0);
        ListNode res = cur;
        while(list1 != null && list2 != null)
        {
            if(list1.val <= list2.val)
            {
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }
            else
            {
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        cur.next = list1 != null? list1 : list2;
        return res.next;
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
        ListNode d= new ListNode(8);
        ListNode e= new ListNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        ListNode res;
        res = Merge(first, a);
        while(res != null)
        {
            System.out.print(res.val);
            res = res.next;
        }
    }
}