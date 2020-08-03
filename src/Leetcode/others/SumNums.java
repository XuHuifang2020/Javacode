package Leetcode.others;

// 1 + 2 + 3 + ··· + n

public class SumNums
{
    public static int sumNums(int n)
    {
        boolean x = (n > 1 && (n += sumNums(n - 1) ) > 0);
        return n;
    }

    public static void main(String[] args)
    {
        System.out.println("output = " + sumNums(3));
    }
}

