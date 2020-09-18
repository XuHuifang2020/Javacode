package Test;

import java.util.Scanner;

public class Main4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(method(a));
    }
    public static int method(int n)
    {
        if(n <= 2) return -1;
        int[][] arr = new int[n][2*n - 1];
        arr[0][0] = 1;
        arr[1][0] = 1; arr[1][1] = 1; arr[1][2] = 1;
        for(int i = 2; i < n; i++)
        {
            arr[i][0] = 1;
            for(int j = 1; j < 2*n - 1; j++)
            {
                if(j == 1) arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                if(j > 2)  arr[i][j] = arr[i-1][j-2] + arr[i-1][j-1] + arr[i-1][j];
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(arr[n-1][i] % 2 == 0) return i + 1;
        }
        return -1;
    }
}
