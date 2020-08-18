package Leetcode.String;

import java.util.regex.Pattern;

//请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是

public class IsNumeric
{
    public static boolean isNumeric(char[] str)
    {
        String s = String.valueOf(str);
        return s.matches("[+-]?(\\d*)(\\.\\d*)?([eE][+-]?\\d+)?");
    }
    public static void main(String[] args)
    {
        char[] str = {1};
        System.out.println(isNumeric(str));
    }
}