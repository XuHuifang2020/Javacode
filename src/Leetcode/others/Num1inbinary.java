package Leetcode.others;

//输入一个整数，输出该数二进制表示中 1 的个

public class Num1inbinary
{
    /**
     // sum + 1,消去最右边1
     public static int num(int n)
     {
     int sum = 0;
     while(n != 0)
     {
     sum++;
     n = n & (n - 1);
     }
     return sum;
     }  */

    //逐位判断
    public static int num(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum += n & 1;
            n >>>= 1;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("num = " + num(00000000000000000000000000001111));
    }
}
