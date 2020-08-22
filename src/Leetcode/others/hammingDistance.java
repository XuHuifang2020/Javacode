package Leetcode.others;
//两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目
//给出两个整数 x 和 y，计算它们之间的汉明距离

public class hammingDistance
{
    public static int hammingdistance(int x, int y)
    {
        int res = 0;
        int ans = x ^ y;
        /**while(ans != 0)
         {
         if((ans & 1) == 1) res++;
         //ans >>= 1;
         }*/
        while(ans != 0)
        {
            res++;
            ans &= (ans - 1);
        }
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println(hammingdistance(2, 5));
    }
}
