package Leetcode.Arrays;
import java.util.ArrayList;
import java.util.PriorityQueue;

//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4

public class GetLeastNumbers_Solution
{
    public static ArrayList<Integer> getLeastNumbers_Solution(int [] input, int k)
    {
        PriorityQueue<Integer> num = new PriorityQueue<>((x, y) -> (y - x));
        ArrayList<Integer> res = new ArrayList<>();
        int len = input.length;
        if(len == 0 || k > len || k == 0) return res;
        for(int i = 0; i < k; i++)
        {
            num.add(input[i]);
        }
        for(int i = k; i < len; i++)
        {
            if(input[i] < num.peek())
            {
                num.poll();
                num.add(input[i]);
            }
        }
        for(int j = 0; j < k; j++)
        {
            res.add(num.poll());
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,1,3};
        System.out.println(getLeastNumbers_Solution(arr, 2));
    }
}
