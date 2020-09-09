package Leetcode.Tree;

//给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针

public class GetNext
{
    public static TreeLinkNode getnext(TreeLinkNode pNode)
    {
        if(pNode == null) return null;
        if(pNode.right != null)
        {
            pNode = pNode.right;
            while(pNode.left != null)
            {
                pNode = pNode.left;
            }
            return pNode;
        }
        while(pNode.next != null)
        {
            if(pNode.next.left == pNode) return pNode.next;
            pNode = pNode.next;
        }
        return  null;
    }
    public static void main(String...args)
    {
        //
        TreeLinkNode treeNode8 = new TreeLinkNode(8);
        TreeLinkNode treeNode6 = new TreeLinkNode(6);
        TreeLinkNode treeNode10 = new TreeLinkNode(10);
        TreeLinkNode treeNode5 = new TreeLinkNode(5);
        TreeLinkNode treeNode7 = new TreeLinkNode(7);
        TreeLinkNode treeNode9 = new TreeLinkNode(9);
        TreeLinkNode treeNode11 = new TreeLinkNode(11);
        //
        treeNode8.left = treeNode6;
        treeNode5.next = treeNode8;
        treeNode8.right = treeNode10;
        treeNode10.next = treeNode8;
        treeNode6.left = treeNode5;
        treeNode5.next = treeNode6;
        treeNode6.right = treeNode7;
        treeNode7.next = treeNode6;
        treeNode10.left = treeNode9;
        treeNode9.next = treeNode10;
        treeNode10.right = treeNode11;
        treeNode11.next = treeNode10;
        //
        TreeLinkNode head = getnext(treeNode5);
        System.out.println(head.val);
    }
}
