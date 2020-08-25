package Leetcode.others;

import java.util.Scanner;

public class maxProfit
{
    public static int maxprofit(int prices[])
    {
        if(prices == null) return 0;
        int len = prices.length;
        if(len <= 0) return 0;
        int min = prices[0];
        int profit = 0;
        for(int i = 0; i < len; i++)
        {
            if(prices[i] < min)  min = prices[i];
            else if(prices[i] - min > profit) profit = prices[i] - min;
        }
        return profit;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the num:");
        int num = in.nextInt();
        int [] a = new int [num];
        System.out.println("Please enter the array elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("The output is " + maxprofit(a));
    }
}
