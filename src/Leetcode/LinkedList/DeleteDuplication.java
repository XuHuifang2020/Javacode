package Leetcode.LinkedList;

//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

public class DeleteDuplication
{
    public static ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null) return pHead;
        ListNode res =new ListNode(0);
        res.next = pHead;
        ListNode cur = res;
        while(cur.next != null && cur.next.next != null)
        {
            if(cur.next.val == cur.next.next.val)
            {
                ListNode temp = cur.next;
                while(temp != null && temp.next != null && temp.val == temp.next.val) temp = temp.next;
                cur.next = temp.next;
            }
            else cur = cur.next;
        }
        return res.next;
    }

    public static void main(String[] args)
    {
        //
        ListNode first= new ListNode(1);
        ListNode second= new ListNode(2);
        ListNode third= new ListNode(2);
        ListNode forth= new ListNode(2);
        ListNode fifth= new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = null;
        ListNode res;
        res = deleteDuplication(first);
        System.out.println(res.val);
        System.out.println(res.next.val);
    }
}