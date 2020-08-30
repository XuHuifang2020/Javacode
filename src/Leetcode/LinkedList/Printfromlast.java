package Leetcode.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//从尾到头打印链表

public class Printfromlast
{
    /**ArrayList<Integer> temp = new ArrayList<>();
     public int[] reversePrint(ListNode head)
     {
     next(head);
     int[] res = new int[temp.size()];
     for(int i = 0; i < temp.size(); i++)
     {
     res[i] = temp.get(i);
     }
     return res;
     }

     void next(ListNode head)
     {
     if(head == null) return;
     next(head.next);
     temp.add(head.val);
     } */

    //辅助栈法
    public static int[] reversePrint(ListNode head)
    {
        LinkedList<Integer> temp = new LinkedList<>();
        while(head != null)
        {
            temp.add(head.val);
            head = head.next;
        }
        int[] res = new int[temp.size()];
        for(int i = 0; i < res.length; i++)
        {
            res[i] = temp.removeLast();
        }
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
        int[] res = reversePrint(first);
        for(int a : res)
            System.out.print(a);
    }
}
