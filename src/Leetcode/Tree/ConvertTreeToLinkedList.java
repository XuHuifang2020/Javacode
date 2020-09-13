package Leetcode.Tree;

//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向

public class ConvertTreeToLinkedList
{
    static TreeNode cur, pre;
    public static TreeNode Convert(TreeNode pRootOfTree)
    {
        if(pRootOfTree == null) return null;
        Convert(pRootOfTree.left);
        if(pre != null) pre.right = pRootOfTree;
        else cur = pRootOfTree; // 保存链表头结点
        pRootOfTree.left = pre;
        pre = pRootOfTree;
        Convert(pRootOfTree.right);
        return cur;
    }
    public static void main(String...args)
    {
        //
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode11 = new TreeNode(11);
        //
        treeNode8.left = treeNode6;
        treeNode8.right = treeNode10;
        treeNode6.left = treeNode5;
        treeNode6.right = treeNode7;
        treeNode10.left = treeNode9;
        treeNode10.right = treeNode11;
        //
        TreeNode head = treeNode8;
        TreeNode root = Convert(head);
    }
}
