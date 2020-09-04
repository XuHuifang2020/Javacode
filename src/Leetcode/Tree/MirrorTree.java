package Leetcode.Tree;

//二叉树的镜像

import java.util.LinkedList;

public class MirrorTree
{
    /**public static TreeNode mirrorTree(TreeNode root)
     {
     if(root == null) return null;
     TreeNode temp = root.left;
     root.left = mirrorTree(root.right);
     root.right = mirrorTree(temp);
     return root;
     } */

    public static TreeNode mirrorTree(TreeNode root)
    {
        if(root == null) return null;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(! queue.isEmpty())
        {
            for(int i = queue.size(); i > 0; i--)
            {
                TreeNode node = queue.pop();
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
        }
        return root;
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
        TreeNode root = mirrorTree(head);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(! queue.isEmpty())
        {
            for(int i = queue.size(); i > 0; i--)
            {
                TreeNode node = queue.pop();
                System.out.print(node.val + " ");
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
    }
}
