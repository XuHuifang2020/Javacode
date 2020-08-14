package Leetcode.String;

//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部,定义一个函数实现字符串左旋转操作的功能.比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"


public class StringToleft
{
    /**public static String reverseLeftWords(String s, int n)
     {
     return s.substring(n, s.length() ) + s.substring(0, n );
     } */

    public static String reverseLeftWords(String s, int n)
    {
        String res = "";
        for(int i = n; i < s.length();i++)
        {
            res += s.charAt(i);
        }
        for(int i = 0; i < n; i++)
        {
            res += s.charAt(i);
        }
        //for(int i = n; i < n + s.length(); i++)
        //    res += s.charAt(i % s.length());
        return res;
    }

    /**class Solution
     {
     public String reverseLeftWords(String s, int n)
     {
     StringBuilder res = new StringBuilder();
     for(int i = n; i < n + s.length(); i++)
     res.append(s.charAt(i % s.length()));
     return res.toString();
     }
     }  leetcode */

    public static void main(String[] args)
    {
        String str = "abcdefg";
        System.out.println(reverseLeftWords(str, 3));
    }
}
