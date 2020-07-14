package Nowcoder;
import java.util.ArrayList;
import java.util.Scanner;

public class Fib
{
    public static int fib(int num)
    {
        int sum = 0;
        for(int i = 0; i <= num; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //接收第一个输入作为创建数组的大小
        System.out.println("Please enter the num:");
        int num = in.nextInt();
        System.out.println("The output is ");
        System.out.println(fib(num));
    }
}
