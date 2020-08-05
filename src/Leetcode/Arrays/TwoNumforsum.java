package Leetcode.Arrays;

//输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可

public class TwoNumforsum
{
    public static int[] twoSum(int[] nums, int target)
    {
        int  sum = 0, i = 0, j = nums.length - 1;
        int[] res = new int[2];
        while(i < j)
        {
            sum = nums[i] + nums[j];
            if(sum < target) i++;
            else if(sum > target) j--;
            else if(sum == target)
            {
                res[0] = nums[i];
                res[1] = nums[j];
                i++;
                j--;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,3,4};
        int [] res = twoSum(arr, 5);
        for(int a : res)
            System.out.println(a);
    }
}
