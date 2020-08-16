package Leetcode.String;
//牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？

public class ReverseSentence
{
    /**static char[] s;
     public static String reversesentence(String str)
     {
     if(str == null ||str.length()<2)
     {
     return str;
     }
     s = str.toCharArray();
     reverse(0, s.length - 1);
     int[] num = new int[s.length];
     num[0] = -1;
     int k = 0;
     for(int i = 0; i < s.length; i++)
     {
     if(s[i] == ' ')
     {
     num[++k] = i;
     reverse(num[k - 1] + 1, num[k] - 1);
     }
     if(i == s.length - 1)
     {
     reverse(num[k] + 1, i);
     }
     }
     String res = String.valueOf(s);
     return res;
     }
     public static void reverse(int l, int r)
     {
     while(l < r)
     {
     char temp = s[l];
     s[l++] = s[r];
     s[r--] = temp;
     }
     }*/
    //情况不全

    public static String ReverseSentence(String str) // 答案
    {
        if(str == null ||str.length()<2)
        {
            return str;
        }
        char[] array = str.toCharArray();
        reserve(array,0,array.length-1);
        int start = 0;//记录每个单词的起始位置
        int end = 0;//单词的终止位置
        while(end < array.length)
        {
            if(array[end] !=' ')
            {
                if(end == array.length-1)//最后一个单词无空格
                {
                    reserve(array,start,end);
                }
                end++;
            }
            else if(array[end]== ' ')//当遇到空格时，把空格之前的单词翻转，并且把start置为end
            {
                reserve(array,start,end-1);
                end++;
                start = end;//下一个单词的起始位置
            }
        }
        return String.valueOf(array);
    }
    private static void reserve(char[] array,int start,int end)
    {
        char temp = ' ';
        while(start < end)
        {
            temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
    }

    public static void main(String[] args)
    {
        String str = "student. a am I";
        System.out.println(ReverseSentence(str));
    }
}