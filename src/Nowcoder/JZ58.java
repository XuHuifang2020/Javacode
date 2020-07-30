package Nowcoder;

public class Solution_JZ58
{
    static boolean isSymmetrical(TreeNode pRoot)
    {
        return pRoot == null ? true : recur(pRoot.left, pRoot.right);
    }

    static boolean recur(TreeNode L, TreeNode R)
    {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }

    public static void main(String...args)
    {
        //
        TreeNode treeNode8= new TreeNode(8);
        TreeNode treeNode6= new TreeNode(6);
        TreeNode treeNode10= new TreeNode(10);
        TreeNode treeNode5= new TreeNode(5);
        TreeNode treeNode7= new TreeNode(7);
        TreeNode treeNode9= new TreeNode(9);
        TreeNode treeNode11= new TreeNode(11);

        treeNode8.left= treeNode6;
        treeNode8.right= treeNode10;
        treeNode6.left= treeNode5;
        treeNode6.right= treeNode7;
        treeNode10.left= treeNode9;
        treeNode10.right= treeNode11;
        //
        TreeNode head= treeNode8;
        Solution_JZ62 s= new Solution_JZ62();
        System.out.println(isSymmetrical(head));
    }
}

