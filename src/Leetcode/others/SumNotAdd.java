package Leetcode.others;

// 不用加减乘除做加法

public class SumNotAdd
{
    public static int add(int a, int b)
    {
        if(b == 0) return a;
        return add(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args)
    {
        System.out.println("a + b = " + add(3, 2));
    }
}

