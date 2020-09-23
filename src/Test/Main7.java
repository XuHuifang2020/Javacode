package Test;

import java.util.Scanner;

//查找输入整数二进制数中1的个数

public class Main7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(findNumberOf1(num));
    }

    public static int findNumberOf1(int num)
    {
        if(num == 0) return 0;
        int res = 0;
        while(num != 0)
        {
            //res++;
            //num &= (num - 1);
            res += (num & 1);
            num >>= 1;
        }
        return res;
    }
}