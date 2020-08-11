package Leetcode.Arrays;
import java.util.ArrayList;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10

public class PrintMatrix
{
    public static ArrayList<Integer> printMatrix(int [][] matrix)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int l = 0, r = len2 - 1, t = 0, b = len1 - 1;
        while(true)
        {
            for(int i = l; i <= r; i++) res.add(matrix[t][i]);
            if(++t > b) break;
            for(int i = t; i <= b; i++) res.add(matrix[i][r]);
            if(--r < l) break;
            for(int i = r; i >= l; i--) res.add(matrix[b][i]);
            if(--b < t) break;
            for(int i = b; i >= t; i--) res.add(matrix[i][l]);
            if(++l > r) break;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3}, {2,3,4}, {3,4,5}};
        System.out.println(printMatrix(arr));
    }
}
