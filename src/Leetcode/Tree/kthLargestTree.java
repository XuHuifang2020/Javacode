package Leetcode.Tree;

//给定一棵二叉搜索树，请找出其中第k大的节点

public class kthLargestTree
{
    int count = 0;
    int res = -1;
    public int kthLargest(TreeNode root, int k)
    {
        if(root != null) dfs(root, k);
        return res;
    }
    void dfs(TreeNode node, int k)
    {
        if(node == null) return;
        if(node.right != null) dfs(node.right, k);
        count++;
        if(count == k) res = node.val;
        if(node.left != null) dfs(node.left, k);
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
        kthLargestTree s = new kthLargestTree();
        int num = s.kthLargest(head, 4);
        System.out.println(num);
    }
}
