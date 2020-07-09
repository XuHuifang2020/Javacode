package Nowcoder;

import java.util.Scanner;
import java.util.ArrayList;

public class JZ6
{
    public static int minNumberInRotateArray(int [] array)
    {
        int i = 0;
        int j = array.length - 1;
        while(i < j)
        {
            int m = (i + j) / 2;
            if(array[m] < array[j]) j = m;
            else if(array[m] > array[j]) i = m + 1;
            else j--;
        }
        return array[i];
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //接收第一个输入作为创建数组的大小
        System.out.println("Please enter the sum:");
        int num = in.nextInt();
        int [] a = new int [num];
        System.out.println("Please enter the array elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]= in.nextInt();
        }
        System.out.println("The output is ");
        System.out.println(minNumberInRotateArray(a));
    }
}


