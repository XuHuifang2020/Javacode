package Leetcode.Tree;

//请实现一个函数，用来判断一棵二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的

public class IsSymmetrical
{
    static boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) return true;
        return recur(pRoot.left, pRoot.right);
    }
    static boolean recur(TreeNode left, TreeNode right)
    {
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        return recur(left.right, right.left) && recur(left.left, right.right);
    }
    public static void main(String...args)
    {
        //
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode10 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(5);
        TreeNode treeNode9 = new TreeNode(5);
        TreeNode treeNode11 = new TreeNode(5);
        //
        treeNode8.left = treeNode6;
        treeNode8.right = treeNode10;
        treeNode6.left = treeNode5;
        treeNode6.right = treeNode7;
        treeNode10.left = treeNode9;
        treeNode10.right = treeNode11;



        System.out.println(isSymmetrical(treeNode8));
    }
}
