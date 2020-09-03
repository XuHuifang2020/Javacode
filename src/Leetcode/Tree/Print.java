package Leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;

//请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推

public class Print
{
    public static ArrayList<ArrayList<Integer>> print(TreeNode pRoot)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null) return res;
        LinkedList<TreeNode> cur = new LinkedList<>();
        cur.add(pRoot);
        int k = 0;
        while(!cur.isEmpty())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            k++;
            for(int i = cur.size(); i > 0; i--)
            {
                TreeNode node = cur.poll();
                if(k % 2 == 1)  temp.add(node.val);
                if(k % 2 == 0)  temp.add(0,node.val);
                if(node.left != null) cur.add(node.left);
                if(node.right != null) cur.add(node.right);
            }
            res.add(temp);
        }
        return res;
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
        ArrayList<ArrayList<Integer>> res = print(head);
    }
}
