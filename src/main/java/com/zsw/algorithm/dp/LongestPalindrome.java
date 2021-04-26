package com.zsw.algorithm.dp;

/**
 * 最长回文子串
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        int maxLen = 1;
        int begin = 0;
        for (int j = 1; j < n; ++j) {
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }


                if (dp[i][j] && j - i + 1> maxLen) {
                    maxLen = j - i + 1;
                    //更新最大子串的初始位置
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }
}
