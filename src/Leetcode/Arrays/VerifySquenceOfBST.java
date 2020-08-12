package Leetcode.Arrays;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同

public class VerifySquenceOfBST
{
    static int[] s;
    public static boolean verifySquenceOfBST(int [] sequence)
    {
        s = sequence;
        int len = sequence.length;
        if(len == 0) return false;
        return recur(0, len - 1);
    }
    static boolean recur(int l, int r)
    {
        if(l > r) return true;
        int i = l;
        while(s[i] < s[r]) i++;
        int m = i;
        while(s[i] > s[r]) i++;
        return i == r && recur(l, m - 1) && recur(m, r - 1);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,1,3};
        System.out.println(verifySquenceOfBST(arr));
    }
}
