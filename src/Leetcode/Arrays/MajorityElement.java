package Leetcode.Arrays;

import java.util.Arrays;

//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字

public class MajorityElement
{
    /**public static int majorityElement(int[] nums)
     {
     Arrays.sort(nums);
     return nums[nums.length/2];
     } */

    //摩尔投票法
    public static int majorityElement(int[] nums)
    {
        int res = 0, vote = 0;
        for(int n : nums)
        {
            if(vote == 0) res = n;
            vote += n == res ? 1 : -1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,2,2,0};
        int res = majorityElement(arr);
        System.out.println(res);
    }
}
