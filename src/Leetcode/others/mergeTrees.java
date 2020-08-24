package Leetcode.others;

import java.util.ArrayList;
import java.util.LinkedList;

//给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
//你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点

public class mergeTrees
{
    /**public static TreeNode mergetrees(TreeNode t1, TreeNode t2)
     {
     if(t1 == null && t2 == null) return null;
     if(t1 == null || t2 == null) return t1 == null? t2: t1;
     TreeNode root = new TreeNode(t1.val + t2.val);
     root.left = mergetrees(t1.left, t2.left);
     root.right = mergetrees(t1.right, t2.right);
     return root;
     }*/

    public static TreeNode mergetrees(TreeNode t1, TreeNode t2)
    {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergetrees(t1.left, t2.left);
        t1.right = mergetrees(t1.right, t2.right);
        return t1;
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.add(root);
        while(! queue.isEmpty())
        {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null)  queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return ans;
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
        treeNode1.right = treeNode3;

        TreeNode root = mergetrees(treeNode8, treeNode1);

        System.out.println(PrintFromTopToBottom(root));
    }
}