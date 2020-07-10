package Nowcoder;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JZ53
{
    public static boolean isNumeric(char[] str)
    {
        String s=String.valueOf(str);
        return s.matches("[\\+\\-]?(\\d*\\.\\d+|\\d+\\.?)([eE][\\+\\-]?\\d+)?");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //接收第一个输入作为创建数组的大小
        System.out.println("Please enter the char elements: ");
        String s = in.nextLine();
        char [] str = s.toCharArray();
        System.out.println("The output is ");
        System.out.println(isNumeric(str));
    }
}


