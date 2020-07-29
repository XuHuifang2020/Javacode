package Nowcoder;

import java.util.ArrayList;

public class JZ3
{
    static ArrayList<Integer> res = new ArrayList<>();
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
        if(listNode == null) return res;
        return recur(listNode);
    }

    static ArrayList<Integer> recur(ListNode listNode)
    {
        if(listNode.next != null)  recur(listNode.next);
        res.add(listNode.val);
        return res;
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

        ArrayList<Integer> res1 = new ArrayList<>();
        res1 = printListFromTailToHead(first);
        System.out.println(res1);
    }
}


