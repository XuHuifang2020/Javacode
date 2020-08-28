package Leetcode.others;

//地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
// 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？

public class movingCount
{
    int m, n, k;
    boolean[][] cur;
    public int movingcount(int threshold, int rows, int cols)
    {
        if(cols == 0 && rows == 0) return 0;
        k = threshold; m = rows; n = cols;
        cur = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }
    int dfs(int i, int j, int si, int sj)
    {
        if(i >= m || j >= n || si + sj > k || cur[i][j]) return 0;
        cur[i][j] = true;
        return 1 + dfs(i + 1, j, ((i + 1)% 10 == 0? si - 8 : si + 1), sj) + dfs(i, j + 1, si, ((j + 1)% 10 == 0? sj - 8 : sj + 1));
    }
    public static void main(String[] args)
    {
        movingCount s = new movingCount();
        System.out.println(s.movingcount(6, 20, 20));
    }
}