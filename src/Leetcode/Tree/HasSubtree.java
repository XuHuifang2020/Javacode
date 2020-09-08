package Leetcode.Tree;

//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

public class HasSubtree
{
    public static boolean hasSubtree(TreeNode root1,TreeNode root2)
    {
        if(root1 == null || root2 == null) return false;
        return recur(root1, root2) || hasSubtree(root1.left, root2) || hasSubtree(root1.right, root2);
    }
    static boolean recur(TreeNode r1,TreeNode r2)
    {
        if(r2 == null) return true;
        if(r1 == null || r1.val != r2.val) return false;
        else return recur(r1.left, r2.left) && recur(r1.right, r2.right);
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

        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(7);
        //
        treeNode1.left = treeNode2;
        treeNode8.right = treeNode3;

        System.out.println(hasSubtree(treeNode8, treeNode1));
    }
}