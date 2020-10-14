package Test;

import java.util.*;
import java.io.*;

public class Main9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = null;
        while(in.hasNext())
        {
            int num = Integer.parseInt(in.nextLine());
            int[] arr = new int[num];
            for(int i = 0; i < num; i++)
            {
                str = in.nextLine();
                String[] s = str.split(" ");
                int key = Integer.parseInt(s[0]);
                arr[key] = arr[key] + Integer.parseInt(s[1]);
            }
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < num; i++)
            {
                if(arr[i] != 0) res.append(i).append(" ").append(arr[i]).append("\n");
            }
            res.deleteCharAt(res.length()-1);
            System.out.println(res.toString());
        }
    }
}