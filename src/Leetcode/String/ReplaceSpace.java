package Leetcode.String;

//替换空格

public class ReplaceSpace
{
    /**public static String replaceSpace(String s)
     {
     StringBuilder res = new StringBuilder();
     char[] array = s.toCharArray();
     for(Character c : array)
     {
     if(c == ' ') res.append("%20");
     else res.append(c);
     }
     return res.toString();
     }  leetcode*/

    public static String replaceSpace(String s)
    {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ') res.append("%20");
            else res.append(s.charAt(i));
        }
        return res.toString();
    }



    public static void main(String[] args)
    {
        String str = "abc de fg";
        System.out.println(replaceSpace(str));
    }
}
