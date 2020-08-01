package Leetcode.others;

//Frogs jump the steps: f(0) = 1, f(1) = 1, f(2) = 2...

public class FrogsJump
{
    public static int num(int n)
    {
        int a = 1, b = 1, sum = 1;
        for(int i = 1; i < n; i++)
        {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("output = " + num(2));
    }
}
