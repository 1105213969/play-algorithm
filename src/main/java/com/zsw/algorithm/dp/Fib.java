package com.zsw.algorithm.dp;


/**
 * 斐波那契数列
 */
public class Fib {

    /**
     * 暴力递归，存在重叠子问题
     * @param n >= 1
     * @return
     */
    public int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib1(n-1) + fib1(n-2);
    }

    /**
     * 带备忘录的递归
     * 自顶向下
     * @param n >= 1
     * @return
     */
    public int fib2(int n) {
        int[] memo = new int[n+1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {
        if (n == 1 || n == 2) {
            return 1;
        }
        //已经计算过
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = helper(n-1, memo) + helper(n-2, memo);
        return memo[n];
    }

    /**
     * dp[]数组迭代
     * 自底向上
     * @param n >= 1
     * @return
     */
    public int fib3(int n) {
        int[] memo = new int[n+1];
        memo[1] = 1;
        if (n >= 2) {
            memo[2] = 1;
        }
        for (int i = 3; i <= n; ++i) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(new Fib().fib3(i));
        }
    }
}
