package Test;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int month = in.nextInt();
            System.out.println(getTotalCount(month));
        }
    }

    public static int getTotalCount(int m)
    {
        if(m <= 2) return 1;
        else return getTotalCount(m - 1) + getTotalCount(m - 2);
    }
}

