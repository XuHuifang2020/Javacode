package Leetcode.others;

import java.util.LinkedList;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//有效字符串需满足：
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//注意空字符串可被认为是有效字符串。

public class isValid
{
    public static boolean isvalid(String s)
    {
        if(s.length() == 0) return true;
        LinkedList<Character> queue = new LinkedList<>();
        char[] string = s.toCharArray();
        queue.push(string[0]);
        for(int i = 1; i < string.length; i++)
        {
            if(queue.isEmpty()) queue.push(string[i]);
            else if(equal(queue.peek(), string[i])) queue.pop();
            else queue.push(string[i]);
        }
        return queue.isEmpty();
    }
    static boolean equal(char a, char b)
    {
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if(a == '{' && b == '}') return true;
        return false;
    }

    public static void main(String[] args)
    {
        String str = "([]])";
        System.out.println(isvalid(str));
    }
}
