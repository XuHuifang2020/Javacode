package Leetcode.String;
import java.util.PriorityQueue;

//如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数

public class GetMedianFromStream
{
    PriorityQueue<Integer> lar = new PriorityQueue<>();
    PriorityQueue<Integer> sma = new PriorityQueue<>((x, y) -> (y - x));
    public void insert(Integer num)
    {
        if(sma.size() == lar.size())
        {
            sma.add(num);
            lar.add(sma.poll());
        }
        else
        {
            lar.add(num);
            sma.add(lar.poll());
        }
    }

    public Double getMedian()
    {
        if(sma.size() != lar.size()) return lar.peek() * 1.0;
        return (sma.peek() + lar.peek())/ 2.0;
        //return new Double((A.size() != B.size())? A.peek() : (A.peek() + B.peek())/2.0);
    }

    public static void main(String[] args)
    {
        GetMedianFromStream s = new GetMedianFromStream();
        s.insert(1);
        s.insert(3);
        s.insert(5);
        s.insert(9);
        System.out.println("output = " + s.getMedian());
    }
}
