package Test;

import java.util.Scanner;
public class Main10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String str = in.nextLine();
            System.out.println(method(str));
        }
    }
    public static int method(String str)
    {
        char[] arr = str.toCharArray();
        int len = arr.length;
        int num = 0;
        int cur = 0;
        for(int i = 2; i < len; i++)
        {
            if((int)arr[i] >= 65) cur = (int)arr[i] - 65 + 10;
            else if((int)arr[i] >= 48) cur = (int)arr[i] - 48;
            num += cur * Math.pow(16, len - i - 1);
        }
        return num;
    }
}