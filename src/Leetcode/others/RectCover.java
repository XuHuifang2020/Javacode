package Leetcode.others;

//矩形覆盖

public class RectCover
{
    /**public static int num(int target)
     {
     if(target <= 2) return target;
     return num(target - 1) + num(target - 2);
     } */

    public static int num(int target)
    {
        if(target <= 2) return target;
        int a = 1, b = 1, res = 1;
        for(int i = 1; i < target; i++)
        {
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println("output = " + num(4));
    }
}
