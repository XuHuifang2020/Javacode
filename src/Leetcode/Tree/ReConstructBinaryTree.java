package Leetcode.Tree;

import java.util.HashMap;
import java.util.LinkedList;

//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回

public class ReConstructBinaryTree
{
    static int[] po;
    static HashMap<Integer, Integer> io = new HashMap<>();
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in)
    {
        po = pre;
        for(int i = 0; i < in.length; i++)
        {
            io.put(in[i], i);
        }
        return recur(0, 0, in.length - 1);
    }
    static TreeNode recur(int cur, int l, int r)
    {
        if(l > r) return null;
        TreeNode root = new TreeNode(po[cur]);
        int m = io.get(po[cur]);
        root.left = recur(cur + 1, l, m - 1);
        root.right = recur(cur + m - l + 1, m + 1, r);
        return root;
    }

    public static void main(String...args)
    {
        int[] a = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] b = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode res = reConstructBinaryTree(a, b);
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(res);
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