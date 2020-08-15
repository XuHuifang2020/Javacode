package Leetcode.String;

import java.util.HashMap;
import java.util.ArrayList;

//请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"

public class StringStreamFirst
{
    //Insert one char from stringstream
    HashMap<Character, Boolean> dic = new HashMap<>();
    ArrayList<Character> s = new ArrayList<>();

    public void Insert(char ch)
    {
        dic.put(ch, !dic.containsKey(ch));
        s.add(ch);
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char c : s)
        {
            if(dic.get(c)) return c;
        }
        return '#';
    }

    public static void main(String[] args)
    {
        StringStreamFirst s= new StringStreamFirst();
        s.Insert('g');
        s.Insert('o');
        s.Insert('o');
        s.Insert('g');
        s.Insert('l');
        s.Insert('e');
        System.out.println(s.FirstAppearingOnce());
    }
}
