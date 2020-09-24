package Test;

import java.util.Scanner;

public class Main8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(GetSequeOddNum(num));
    }

    public static String GetSequeOddNum(int m)
    {
        if(m == 1) return "1";
        int m3 = m * m * m;
        int m2 = m * m;
        StringBuffer str = new StringBuffer();
        for(int l = m2 - m + 1; l < m2 + (m - 1); l += 2)
        {
            str.append(l);
            str.append('+');
        }
        str.append(m2 + (m - 1));
        return str.toString();
    }
}