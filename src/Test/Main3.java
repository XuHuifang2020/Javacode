package Test;

import java.util.*;

public class Main3
{
    public static  String method(String s)
    {
        StringBuilder str = new StringBuilder();
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        while(a[i] == '_') i++;
        while(a[j] == '_') j--;
        for(int l = i; l <= j; l++)
        {
            if(a[l] != '_') str.append(a[l]);
            if(a[l] == '_' && a[l + 1] == '_') continue;
            if(a[l] == '_' && a[l + 1] != '_') str.append('_');
        }
        return str.toString();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(method(s));
    }
}

