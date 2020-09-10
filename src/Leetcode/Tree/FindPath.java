package Leetcode.Tree;

import java.util.ArrayList;

//输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径

public class FindPath
{
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> recur = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findpath(TreeNode root,int target)
    {
        dfs(root, target);
        return res;
    }
    void dfs(TreeNode root,int target)
    {
        if(root == null) return ;
        recur.add(root.val);
        target = target - root.val;
        if(target == 0 && root.left == null && root.right == null)
            res.add(new ArrayList<Integer>(recur));
        dfs(root.left, target);
        dfs(root.right, target);
        recur.remove(recur.size() - 1);
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
        FindPath s = new FindPath();
        ArrayList<ArrayList<Integer>> res = s.findpath(head, 21);
        System.out.println(res);
    }
}
