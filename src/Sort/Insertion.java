package Sort;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Insertion
{
    public static void sort(Comparable[] a)
    {
        int N= a.length;
        for(int i = 0; i < N; i++)
        {
            for(int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j , j-1);
        }
    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }

    private static void show(Comparable[] a)
    {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the sum:");
        int num = in.nextInt();
        Comparable [] a = new Comparable [num];
        System.out.println("Please enter the array elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = in.nextInt();
        }
        sort(a);
        System.out.println("The output is ");
        show(a);
    }
}

