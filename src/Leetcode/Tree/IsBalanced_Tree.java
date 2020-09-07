package Leetcode.Tree;

//输入一棵二叉树，判断该二叉树是否是平衡二叉树

public class IsBalanced_Tree
{
    public static boolean IsBalanced_Solution(TreeNode root)
    {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) && Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }

    static int depth(TreeNode node)
    {
        if(node == null) return 0;
        return Math.max(depth(node.left), depth(node.right)) + 1;
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
        System.out.println(IsBalanced_Solution(head));
    }
}
