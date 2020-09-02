package Leetcode.Tree;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class TreePrint
{
    /**public static List<List<Integer>> levelOrder(TreeNode root)
     {
     List<List<Integer>> res = new LinkedList<>();
     LinkedList<TreeNode> queue = new LinkedList<>();
     queue.add(root);
     while(! queue.isEmpty())
     {
     LinkedList<Integer> temp = new LinkedList<>();
     for(int i = queue.size(); i > 0; i--)
     {
     TreeNode node = queue.pop();
     temp.add(node.val);
     if(node.left != null) queue.add(node.left);
     if(node.right != null) queue.add(node.right);
     }
     res.add(temp);
     }
     return res;
     }*/

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
        //
        TreeNode head = treeNode8;
        // List<List<Integer>> res = levelOrder(head);
        ArrayList<Integer> ans = PrintFromTopToBottom(head);
    }
}