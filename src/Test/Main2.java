package Test;

import java.util.*;

public class Main2
{
    public static void sort(int[] array)
    {
        int lo = 0;
        int hi = array.length - 1;
        sort(array, lo, hi);
    }

    public static void sort(int[] array, int lo, int hi)
    {
        if(lo >= hi) return;
        int m = par(array, lo, hi);
        sort(array, lo, m - 1);
        sort(array, m + 1, hi);
    }

    public static int par(int[] a, int lo, int hi)
    {
        int v = a[lo];
        int i = lo + 1, j = hi;
        while(true)
        {
            while(a[i] < v)
            {
                i++;
                if(i == hi) break;
            }
            while(a[j] > v)
            {
                j--;
                if(j == lo) break;
            }
            if(i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void exch(int[] a, int i, int j)
    {
        int cur = a[i];
        a[i] = a[j];
        a[j] = cur;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //int m = in.nextInt();
        //int[] array = new int[m];
        //String[] s = in.next().split(",");

        String num = in.nextLine();
        int m = Integer.valueOf(num);
        int[] array = new int[m];
        String[] s = in.nextLine().split(",");

        for(int i = 0; i < m; i++)
        {
            array[i] = Integer.parseInt(s[i]);
        }
        sort(array);
        for(int i = 0; i < m - 1; i++)
        {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[m - 1]);
    }
}


