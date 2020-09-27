package Test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] num = {3,5,11,12};
        System.out.println(Arrays.toString(find_prime(num)));
    }

    public static Integer[] find_prime(Integer[] num)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < num.length; i++)
        {
            if(issushu(num[i])) arr.add(num[i]);
        }
        Integer[] res = new Integer[arr.size()];
        for(int j = 0; j < res.length; j++)
        {
            res[j] = arr.get(j);
        }
        return res;
    }

    public static boolean issushu(int m)
    {
            if(m == 0) return false;
            int j = 2;
            while(m % j != 0)
            {
                j++;
            }
            if(j == m) return true;
            return false;
    }
}

