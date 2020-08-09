package Leetcode.Arrays;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分

public class ExchangeOdd
{
    /**
     //奇数或偶数之间的相对位置会变
     public static int[] exchange(int[] nums)
     {
     int temp, i = 0, j = nums.length - 1;
     while(i < j)
     {
     while(i < j && nums[i] % 2 == 1) i++;
     while(i < j && nums[j] % 2 == 0) j--;
     temp = nums[i];
     nums[i] = nums[j];
     nums[j] = temp;
     }
     return nums;
     } */

    //奇数和奇数，偶数和偶数之间的相对位置不变
    public static int[] exchange(int [] array)
    {
        for(int j = 1; j < array.length; j++)
        {
            int i = j;
            while(i >= 1 && array[i] % 2 == 1 && array[i-1] % 2 == 0)
            {
                int temp = array[i];
                array[i] = array[i-1];
                array[i-1] = temp;
                i--;
            }
        }
        return array;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,2,3,4};
        int [] res = exchange(arr);
        for(int a : res)
            System.out.println(a);
    }
}
