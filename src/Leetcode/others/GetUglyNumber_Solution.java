package Leetcode.others;

//把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数

public class GetUglyNumber_Solution
{
    public static int getUglyNumber(int index)
    {
        if(index == 0) return 0;
        int[] dp = new int[index];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;
        for(int i = 1; i < index; i++)
        {
            int n1 = dp[a] * 2, n2 = dp[b] * 3, n3 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n1, n2), n3);
            if(dp[i] == n1) a++;
            if(dp[i] == n2) b++;
            if(dp[i] == n3) c++;
        }
        return dp[index - 1];
    }
    public static void main(String[] args)
    {
        System.out.println(getUglyNumber(5));
    }
}