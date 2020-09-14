package Test;

import java.util.*;

public class Main1
{
    public static int gift(int[][] array)
    {
        if(array == null || array.length == 0) return 0;
        int m = array.length;
        int n = array[0].length;
        int[][] value = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int left = 0;
                int up = 0;
                if(i >= 1) up = value[i - 1][j];
                if(j >= 1) left = value[i][j - 1];
                value[i][j] = Math.max(up, left) + array[i][j];
            }
        }
        return value[m - 1][n - 1];
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(",");
        int m = Integer.valueOf(s[0]);
        int n = Integer.valueOf(s[1]);
        int[][] array = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                array[i][j] = in.nextInt();
            }
        }
        System.out.println(gift(array));
    }
}
