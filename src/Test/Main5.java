package Test;

import java.util.Scanner;

//找出正整数中偶数，并输出相加后的数，要用 long

public class Main5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(method(num));
    }

    static int method(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int temp = num % 10;
            if(temp % 2 == 0)  sum += temp;
            num /= 10;
        }
        return sum;
    }
}
