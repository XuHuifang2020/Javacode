package Nowcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class JZ41
{
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum)
    {
        int i = 1;
        int j = 1;
        int ssum = 0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        while(i <= sum/2)
        {
            if(ssum < sum)
            {
                ssum += j;
                j++;
            }
            else if(ssum > sum)
            {
                ssum -= i;
                i++;
            }
            else
            {
                ArrayList<Integer> temp = new ArrayList<>();
                for(int k = i; k < j; k++)
                {
                    temp.add(k);
                }
                res.add(temp);
                ssum -= i;
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //接收第一个输入作为创建数组的大小
        System.out.println("Please enter the sum:");
        int num = in.nextInt();
        System.out.println("The output is ");
        System.out.println(FindContinuousSequence(num));
    }
}

