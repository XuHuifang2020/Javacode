package Leetcode.String;

import java.util.HashMap;

//在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）

public class FirstNotRepeatingChar
{
    public static int firstnotrepeatingChar(String str)
    {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++)
        {
            dic.put(array[i], !dic.containsKey(array[i]));
        }
        for(int i = 0; i < array.length; i++)
        {
            if(dic.get(array[i]))  return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String str = "aacdefg";
        System.out.println(firstnotrepeatingChar(str));
    }
}