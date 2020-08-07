package Leetcode.String;
import java.util.HashMap;

//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母

public class FirstUniqChar
{
    public static char firstUniqChar(String s)
    {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] str = s.toCharArray();
        for(char c : str)
        {
            dic.put(c , !dic.containsKey(c));
        }
        for(char c : str)
        {
            if(dic.get(c)) return c;
        }
        return ' ';
    }

    public static void main(String[] args)
    {
        String str = "abcdeafg";
        System.out.println(firstUniqChar(str));
    }
}
